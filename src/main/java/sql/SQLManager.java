package sql;

import config.ConfigManager;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SQLManager {
    static final String queriesPath = "src/test/resources/queries.properties";
    static final String connectionsPath = "src/test/resources/databaseConnections.properties";

    public static void createExecution(String executionId, String scenarioId) throws ClassNotFoundException {
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("now: " + now);
        System.out.println("exec id: " + executionId + " -- scenario id: " + scenarioId);
//        System.setProperty("oracle.net.tns_admin", "C:/TNS");
//        String dbURL = "jdbc:oracle:thin:@QA1V6";
//
//        Class.forName ("oracle.jdbc.OracleDriver");
//
//        Connection conn = null;
//        Statement stmt = null;
//
//        try {
//            conn = DriverManager.getConnection(dbURL, "priv_api", "priv_api");
//
//            System.out.println("Connection established");
//
//            stmt = conn.createStatement();
//
//            ResultSet rs = stmt.executeQuery("select * from PRIV_MD.action where rownum <= 20");
//
//            while (rs.next()) {
//                System.out.println(rs.getString(4));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (stmt != null) try { stmt.close(); } catch (Exception e) {}
//            if (conn != null) try { conn.close(); } catch (Exception e) {}
//        }
    }

    public static void connectAndExecuteSelectStatement(String query) {
        Connection connection = null;
        Statement statement = null;
        String row = "";
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metadata = resultSet.getMetaData();
            int columnCount = metadata.getColumnCount();


            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
//                    row += resultSet.getString(i) + ", ";
                    System.out.println(row);
                }

            }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (statement != null) try {
                statement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }

    public String connectAndExecuteSelectStatementCoherent(String query, String environment, String currentObjectID) {
        Connection connection = null;
        Statement statement = null;
        String premium = null;
        try {
            switch (environment) {
                case "AWS_STG":
                    String url_stg = ConfigManager.getConnectionsProperty("aws_stg_url",connectionsPath);
                    String stg_username = ConfigManager.getConnectionsProperty("stg_username",connectionsPath);
                    String stg_password = ConfigManager.getConnectionsProperty("stg_password",connectionsPath);
                    connection = DriverManager.getConnection(url_stg, stg_username, stg_password);
                    System.out.println("Connected to STG database!");
                    break;
                case "AWS_QA":
                    String url_qa = ConfigManager.getConnectionsProperty("aws_qa_url",connectionsPath);
                    String qa_username = ConfigManager.getConnectionsProperty("qa_username",connectionsPath);
                    String qa_password = ConfigManager.getConnectionsProperty("qa_password",connectionsPath);
                    connection = DriverManager.getConnection(url_qa, qa_username, qa_password);
                    System.out.println("Connected to STG database!");
                    break;
            }

            String selectQuery = ConfigManager.getQueryProperty(query, queriesPath, currentObjectID);
            System.out.println(selectQuery);

            assert connection != null;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            ArrayList<String> differences = new ArrayList<>();
            while (resultSet.next()) {
                premium = resultSet.getString("DIFFERENCE");
                differences.add(premium);
            }
            for (String difference : differences) {
                System.out.println(difference);
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (statement != null) try {
                statement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
        return premium;
    }

    public static void connectAndInsertPerfResults(String execution_id, String scenario_id, String userSessionId) {
//        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        LocalDate now = LocalDate.now();
        String query = "INSERT INTO public.\"Performance_Results\"(created_at, updated_at, execution_id, scenario_id, user_session_id) VALUES (?,?,?,?,?);";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");
            Statement executionStatement = connection.createStatement();
            ResultSet executionRs;
            executionRs = executionStatement.executeQuery("select id from public.\"Performance_Executions\" where id = " + execution_id + " limit 1;");

            //if execution doesn't exist, create a new one with provided execution_id argument
            if (!executionRs.isBeforeFirst()) {
                System.out.println("No data found, creating Execution record");
                String execQuery = "INSERT INTO public.\"Performance_Executions\"(id, created_at, updated_at, scenario_id) VALUES (?,?,?,?) ON CONFLICT DO NOTHING;";
                PreparedStatement execPS = connection.prepareStatement(execQuery);
                execPS.setInt(1, Integer.parseInt(execution_id));
                execPS.setObject(2, new Timestamp(System.currentTimeMillis()));
                execPS.setObject(3, new Timestamp(System.currentTimeMillis()));
                execPS.setInt(4, Integer.parseInt(scenario_id));

                execPS.executeUpdate();
                execPS.close();
            }
            //insert results record
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setObject(1, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setObject(2, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setInt(3, Integer.parseInt(execution_id));
            preparedStatement.setInt(4, Integer.parseInt(scenario_id));
            preparedStatement.setLong(5, Long.parseLong(userSessionId));

            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Connected to the database and result record created");
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) try {
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }

    public static void writeToPerformanceTransaction(String execution_id, String scenario_id, String customer_id) {
        String query = "INSERT INTO public.\"Performance_Transactions\"(created_at, updated_at, scenario_id, policy_id, customer_id, status_id, execution_id) VALUES (?,?,?,?,?,?,?);";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String generatedId;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");

            //insert results record
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setObject(1, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setObject(2, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setInt(3, Integer.parseInt(scenario_id));
            preparedStatement.setString(4, "1");
            preparedStatement.setString(5, customer_id);
            preparedStatement.setInt(6, 1);
            preparedStatement.setInt(7, Integer.parseInt(execution_id));

            preparedStatement.executeUpdate();
            System.out.println("gen keys api: " + preparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.close();

            System.out.println("Connected to the database and result record created");

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) try {
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }

    public static void updatePolicyIdOnTransaction(String customerId, String policyId) {
        String query = "UPDATE public.\"Performance_Transactions\" SET policy_id = ? where customer_id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");

            //insert results record
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, policyId);
            preparedStatement.setString(2, customerId);

            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Connected to the database and result record created");

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) try {
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }

    public static void markExecutionAsCompleted(String executionId) {
        System.out.println("updating execution..");
        String query = "UPDATE public.\"Performance_Executions\" SET updated_at = ? where id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");

            //update results record
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setObject(1, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setInt(2, Integer.parseInt(executionId));

            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Connected to the database and result record created");

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) try {
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }

    public static void markExecutionResultStatus(String sessionID, String status) {
        String query = "UPDATE public.\"Performance_Results\" SET status_id = ?, updated_at = ? where user_session_id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://qa-automation-performance-instance-1.ctm75s4yxcdg.us-east-1.rds.amazonaws.com:5432/postgres", "postgres", "MAst3RPa$$");

            //update results record
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.parseInt(status));
            preparedStatement.setObject(2, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setLong(3, Long.parseLong(sessionID));

            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Connected to the database and result record created");

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) try {
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Statement exception: " + e);
            }
            if (connection != null) try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection exception: " + e);
            }
        }
    }


    private static final ThreadLocal<Connection> threadLocalConnection = ThreadLocal.withInitial(() -> null);

    public List<String> executeDatabaseQuery(String queryKey, String columnName, String environment, String documentIDs) {
        List<String> results = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = getDatabaseConnection(environment);
            if (connection == null) {
                throw new SQLException("Failed to establish a database connection.");
            }

            String queryTemplate = ConfigManager.getQueryProperty(queryKey, queriesPath, documentIDs);
            String query = queryTemplate.replace("{ID}", documentIDs);
            System.out.println("Executing Query: " + query);

            Thread.sleep(5000);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Thread.sleep(10000);
            while (resultSet.next()) {
                results.add(resultSet.getString(columnName));
            }

        } catch (SQLException | InterruptedException e) {
            System.err.println("Database operation failed: " + e.getMessage());
            e.printStackTrace();

        } finally {
            closeResources(resultSet, statement, connection);
        }

        return results;
    }

    public Connection getDatabaseConnection(String environment) throws SQLException {
        Connection connection = threadLocalConnection.get();

        if (connection == null || connection.isClosed()) {
            String url, username, password;

            switch (environment) {
                case "AWS_STG":
                    url = ConfigManager.getConnectionsProperty("aws_stg_url", connectionsPath);
                    username = ConfigManager.getConnectionsProperty("stg_username", connectionsPath);
                    password = ConfigManager.getConnectionsProperty("stg_password", connectionsPath);
                    break;
                case "AWS_QA":
                    url = ConfigManager.getConnectionsProperty("aws_qa_url", connectionsPath);
                    username = ConfigManager.getConnectionsProperty("qa_username", connectionsPath);
                    password = ConfigManager.getConnectionsProperty("qa_password", connectionsPath);
                    break;
                case "AWS_DEV":
                    url = ConfigManager.getConnectionsProperty("aws_dev_url", connectionsPath);
                    username = ConfigManager.getConnectionsProperty("dev_username", connectionsPath);
                    password = ConfigManager.getConnectionsProperty("dev_password", connectionsPath);
                    break;
                case "PRE_PROD":
                    url = ConfigManager.getConnectionsProperty("aws_preprod_url", connectionsPath);
                    username = ConfigManager.getConnectionsProperty("preprod_username", connectionsPath);
                    password = ConfigManager.getConnectionsProperty("preprod_password", connectionsPath);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid environment: " + environment);
            }

            try {
                connection = DriverManager.getConnection(url, username, password);
                threadLocalConnection.set(connection);
                System.out.println("Connected to " + environment + " database: " + connection);
            } catch (SQLException e) {
                System.err.println("Connection failed for " + environment + ": " + e.getMessage());
                throw e;
            }
        }
        return connection;
    }

    private void closeResources(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
                System.out.println("ResultSet closed successfully.");
            }

            if (statement != null) {
                statement.close();
                System.out.println("Statement closed successfully.");
            }

            if (connection != null) {
                connection.close();
                threadLocalConnection.remove();
                System.out.println("Database connection closed successfully.");
            }

        } catch (SQLException e) {
            System.err.println("Error closing database resources: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

