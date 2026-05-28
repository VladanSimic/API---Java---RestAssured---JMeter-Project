package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    public static final Properties inforceProperties = new Properties();
    public static final Properties coherentProperties = new Properties();
    public static final Properties queryProperties = new Properties();
    public static final Properties connectionsProperties = new Properties();

    public static void loadProperties(String file, Properties properties) {
        try (FileInputStream inputStream = new FileInputStream(file)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties from file: " + file);
        }
    }

    public static void loadCoherentProperties(String file) {
        loadProperties(file, coherentProperties);
    }

    public static void loadInforceProperties(String file) {
        loadProperties(file, inforceProperties);
    }

    public static String getQueryProperty(String key, String file, String currentObjectID){
        loadProperties(file,queryProperties);
        String query =queryProperties.getProperty(key);
        query = query.replace("{transactionID}", currentObjectID);
        return query;
    }

    public static String getConnectionsProperty(String key, String file){
        loadProperties(file,queryProperties);
        return queryProperties.getProperty(key);
    }

    public static String getCoherentProperty(String key) {
        return coherentProperties.getProperty(key);
    }

    public static String getInforceProperty(String key) {
        return inforceProperties.getProperty(key);
    }

    public static boolean containsKey(String key, Properties property) {
        return property.containsKey(key);
    }

}
