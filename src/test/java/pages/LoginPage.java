package pages;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Random;

public class LoginPage extends CommonComponentsAndActions {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Broker Number']/../../../../div//input")
    List<WebElement> brokerNumberInput;
    @FindBy(xpath = "//div[text()='Username']/../../../../div//input")
    List<WebElement> usernameInput;
    @FindBy(xpath = "//div[text()='Password']/../../../../div//input")
    List<WebElement> passwordInput;
    @FindBy(xpath = "//span[text()='>>> login']")
    List<WebElement> loginButton;
    @FindBy(xpath = "//*[contains(text(),'PURE Secure Login Application')]")
    List<WebElement> secureLogin;

    public void login(String env, String subrole) throws Throwable {
        String username;
        String password;
        String brokerNumber;

        openApplication(env);
        setLoggingLevel("Performance");

        switch (env) {
            case "DEV": {
                switch (subrole) {
                    case "Zonal": {
                        username = "qa_sum_003";
                        password = "qa_sum_003";
                        brokerNumber = "0";
                    }
                    break;
                    case "Field": {
                        username = "qa_sum_001";
                        password = "qa_sum";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                secureLogin();
            }
            break;
            case "DEV2": {
                switch (subrole) {
                    case "Zonal": {
                        username = "qa_sum_003";
                        password = "qa_sum_003";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
            }
            break;
            case "QA2": {
                if (subrole.charAt(0) == 'P' && Character.isDigit(subrole.charAt(1))) {
                    username = "Performance" + subrole.substring(1);
                    brokerNumber = "0";
                    password = "44sbroadway" + subrole.substring(1);
                } else {
                    switch (subrole) {
                        case "Zonal": {
                            username = "qa_sum_003";
                            password = "qa_sum_003";
                            brokerNumber = "0";
                        }
                        break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + subrole);
                    }
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
            }
            break;
            case "QA": {
                switch (subrole) {
                    case "Field": {
                        username = "qa_sum_001";
                        password = "qa_sum";
                        brokerNumber = "0";
                    }
                    break;
                    case "Zonal": {
                        username = "automation2";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "RUM": {
                        username = "automation3";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist1": {
                        username = "automation4";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist2": {
                        username = "automation5";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUnderwriter": {
                        username = "automation6";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter1": {
                        username = "automation7";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter2": {
                        username = "automation8";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Analyst": {
                        username = "automation9";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA1": {
                        username = "automation10";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA2": {
                        username = "automation11";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSSA": {
                        username = "automation12";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSRM": {
                        username = "automation13";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUWManagmentRole": {
                        username = "automation14";
                        password = "automation14";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWManagerRole": {
                        username = "automation15";
                        password = "automation15";
                        brokerNumber = "0";
                    }
                    break;
                    case "UnderwriterRole": {
                        username = "automation16";
                        password = "automation16";
                        brokerNumber = "0";
                    }
                    break;
                    case "UnderwritingTechnicianRole": {
                        username = "automation17";
                        password = "automation17";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUWTechnicianRole": {
                        username = "automation18";
                        password = "automation18";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                secureLogin();
            }
            break;
            case "STG": {
                switch (subrole) {
                    case "Field": {
                        username = "qa_sum_001";
                        password = "qa_sum";
                        brokerNumber = "0";
                    }
                    break;
                    case "Zonal": {
                        username = "automationuw2";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "RUM": {
                        username = "automationuw3";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist1": {
                        username = "automationuw4";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist2": {
                        username = "automationuw5";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUnderwriter": {
                        username = "automationuw6";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter1": {
                        username = "automationuw7";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter2": {
                        username = "automationuw8";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Analyst": {
                        username = "automationuw9";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA1": {
                        username = "automationuw10";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA2": {
                        username = "automationuw11";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSSA": {
                        username = "automation2";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSRM": {
                        username = "automationuw19";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUWManagmentRole": {
                        username = "automation14";
                        password = "automation14";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWManagerRole": {
                        username = "automation15";
                        password = "automation15";
                        brokerNumber = "0";
                    }
                    break;
                    case "UnderwriterRole": {
                        username = "automation16";
                        password = "automation16";
                        brokerNumber = "0";
                    }
                    break;
                    case "UnderwritingTechnicianRole": {
                        username = "automation17";
                        password = "automation17";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUWTechnicianRole": {
                        username = "automation18";
                        password = "automation18";
                        brokerNumber = "0";
                    }
                    break;
                    case "user20": {
                        username = "automation20";
                        password = "automation20";
                        brokerNumber = "0";
                    }
                    break;
                    case "user21": {
                        username = "automation21";
                        password = "automation21";
                        brokerNumber = "0";
                    }
                    break;
                    case "user22": {
                        username = "automation22";
                        password = "automation22";
                        brokerNumber = "0";
                    }
                    break;
                    case "user23": {
                        username = "automation23";
                        password = "automation23";
                        brokerNumber = "0";
                    }
                    break;
                    case "user24": {
                        username = "automation24";
                        password = "automation24";
                        brokerNumber = "0";
                    }
                    break;
                    case "user26": {
                        username = "automation26";
                        password = "automation26";
                        brokerNumber = "0";
                    }
                    break;
                    case "user27": {
                        username = "automation27";
                        password = "automation27";
                        brokerNumber = "0";
                    }
                    break;
                    case "user28": {
                        username = "automation28";
                        password = "automation28";
                        brokerNumber = "0";
                    }
                    break;
                    case "user30": {
                        username = "automation30";
                        password = "automation30";
                        brokerNumber = "0";
                    }
                    break;
                    case "P1": {
                        username = "Performance1";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P2": {
                        username = "Performance2";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P3": {
                        username = "Performance3";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P4": {
                        username = "Performance4";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P5": {
                        username = "Performance5";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P6": {
                        username = "Performance6";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P7": {
                        username = "Performance7";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P8": {
                        username = "Performance8";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P9": {
                        username = "Performance9";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P10": {
                        username = "Performance10";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P11": {
                        username = "Performance11";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P12": {
                        username = "Performance12";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P13": {
                        username = "Performance13";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P14": {
                        username = "Performance14";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P15": {
                        username = "Performance15";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P16": {
                        username = "Performance16";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P17": {
                        username = "Performance17";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P18": {
                        username = "Performance18";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P19": {
                        username = "Performance19";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P20": {
                        username = "Performance20";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P21": {
                        username = "Performance21";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P22": {
                        username = "Performance22";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P23": {
                        username = "Performance23";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P24": {
                        username = "Performance24";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P25": {
                        username = "Performance25";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                clickHome();
            }
            break;
            case "AWS_DEV": {
                switch (subrole) {
                    case "Zonal": {
                        username = "qa_sum_003";
                        password = "qa_sum_003";
                        brokerNumber = "0";
                    }
                    break;
                    case "P1": {
                        username = "Performance1";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P2": {
                        username = "Performance2";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P3": {
                        username = "Performance3";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P4": {
                        username = "Performance4";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P5": {
                        username = "Performance5";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P6": {
                        username = "Performance6";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P7": {
                        username = "Performance7";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P8": {
                        username = "Performance8";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P9": {
                        username = "Performance9";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P10": {
                        username = "Performance10";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P11": {
                        username = "Performance11";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P12": {
                        username = "Performance12";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P13": {
                        username = "Performance26";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P14": {
                        username = "Performance14";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P15": {
                        username = "Performance15";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P16": {
                        username = "Performance16";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P17": {
                        username = "Performance17";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P18": {
                        username = "Performance18";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P19": {
                        username = "Performance19";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P20": {
                        username = "Performance20";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P21": {
                        username = "Performance21";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P22": {
                        username = "Performance22";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P23": {
                        username = "Performance23";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P24": {
                        username = "Performance24";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;
                    case "P25": {
                        username = "Performance25";
                        password = "Performance";
                        brokerNumber = "0";
                    }
                    break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                clickHome();
            }
            break;
            case "AWS_QA": {
                if (subrole.charAt(0) == 'P' && Character.isDigit(subrole.charAt(1))) {
//                    username = "Performance" + subrole.substring(1);
                    brokerNumber = "0";
//                    password = "44sbroadway" + subrole.substring(1);
                    username = "Performance1";
                    password = "Performance";
                } else {
                    switch (subrole) {
                        case "Agent1": {
                            username = "vpetrovic123";
                            password = "Pure1234";
                            brokerNumber = "14673900";
                        }
                        break;
                        case "Agent2": {
                            username = "iantonijevic";
                            password = "iantonijevic";
                            brokerNumber = "800391600";
                        }
                        break;
                        case "Agent3": {
                            username = "mjosifljevic";
                            password = "mjosifljevic";
                            brokerNumber = "800391600";
                        }
                        break;
                        case "Field": {
                            username = "field";
                            password = "field";
                            brokerNumber = "0";
                        }
                        break;
                        case "Zonal": {
                            username = "zonal";
                            password = "zonal";
                            brokerNumber = "0";
                        }
                        break;
                        case "RUM": {
                            username = "rum";
                            password = "rum";
                            brokerNumber = "0";
                        }
                        break;
                        case "Specialist1": {
                            username = "specialist1";
                            password = "specialist1";
                            brokerNumber = "0";
                        }
                        break;
                        case "Specialist2": {
                            username = "specialist2";
                            password = "specialist2";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUnderwriter": {
                            username = "senioruw";
                            password = "senioruw";
                            brokerNumber = "0";
                        }
                        break;
                        case "Underwriter1": {
                            username = "underwriter1";
                            password = "underwriter1";
                            brokerNumber = "0";
                        }
                        break;
                        case "Underwriter2": {
                            username = "underwriter2";
                            password = "underwriter2";
                            brokerNumber = "0";
                        }
                        break;
                        case "Analyst": {
                            username = "analyst";
                            password = "analyst";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSA1": {
                            username = "uwservicesassociate1";
                            password = "uwservicesassociate1";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSA2": {
                            username = "uwservicesassociate2";
                            password = "uwservicesassociate2";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSSA": {
                            username = "uwservicesseniorassociate";
                            password = "uwservicesseniorassociate";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSRM": {
                            username = "uwservicesregionalmanager";
                            password = "uwservicesregionalmanager";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUWManagementRole": {
                            username = "senioruwmanagement";
                            password = "senioruwmanagement";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWManagerRole": {
                            username = "uwmanager";
                            password = "uwmanager";
                            brokerNumber = "0";
                        }
                        break;
                        case "UnderwriterRole": {
                            username = "underwriter";
                            password = "underwriter";
                            brokerNumber = "0";
                        }
                        break;
                        case "UnderwritingTechnicianRole": {
                            username = "underwritingtechnician";
                            password = "underwritingtechnician";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUWTechnicianRole": {
                            username = "senioruwtechnician";
                            password = "senioruwtechnician";
                            brokerNumber = "0";
                        }
                        break;
                        case "AgencyMarketingDirector": {
                            username = "agencymarketingdirector";
                            password = "agencymarketingdirector";
                            brokerNumber = "0";
                        }
                        break;
                        case "SurplusUW": {
                            username = "surplusuw";
                            password = "surplusuw";
                            brokerNumber = "0";
                        }
                        break;
                        case "SurplusUWTech": {
                            username = "surplusuwtechnician";
                            password = "surplusuwtechnician";
                            brokerNumber = "0";
                        }
                        break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + subrole);
                    }
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                clickHome();
            }
            break;
            case "PRE_PROD":
            case "AWS_STG": {
                if (subrole.charAt(0) == 'P' && Character.isDigit(subrole.charAt(1))) {
                    username = "Performance" + subrole.substring(1);
                    brokerNumber = "0";
                    password = "44sbroadway" + subrole.substring(1);
                } else {
                    switch (subrole) {
                        case "Agent1": {
                            username = "vpetrovic123";
                            password = "Pure1234";
                            brokerNumber = "14673900";
                        }
                        break;
                        case "Agent2": {
                            username = "iantonijevic";
                            password = "iantonijevic";
                            brokerNumber = "800391600";
                        }
                        break;
                        case "Agent3": {
                            username = "mjosifljevic";
                            password = "mjosifljevic";
                            brokerNumber = "800391600";
                        }
                        break;
                        case "Field": {
                            username = "field";
                            password = "field";
                            brokerNumber = "0";
                        }
                        break;
                        case "Zonal": {
                            username = "zonal";
                            password = "zonal";
                            brokerNumber = "0";
                        }
                        break;
                        case "RUM": {
                            username = "rum";
                            password = "rum";
                            brokerNumber = "0";
                        }
                        break;
                        case "Specialist1": {
                            username = "specialist1";
                            password = "specialist1";
                            brokerNumber = "0";
                        }
                        break;
                        case "Specialist2": {
                            username = "specialist2";
                            password = "specialist2";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUnderwriter": {
                            username = "senioruw";
                            password = "senioruw";
                            brokerNumber = "0";
                        }
                        break;
                        case "Underwriter1": {
                            username = "underwriter1";
                            password = "underwriter1";
                            brokerNumber = "0";
                        }
                        break;
                        case "Underwriter2": {
                            username = "underwriter2";
                            password = "underwriter2";
                            brokerNumber = "0";
                        }
                        break;
                        case "Analyst": {
                            username = "analyst";
                            password = "analyst";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSA1": {
                            username = "uwservicesassociate1";
                            password = "uwservicesassociate1";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSA2": {
                            username = "uwservicesassociate2";
                            password = "uwservicesassociate2";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSSA": {
                            username = "uwservicesseniorassociate";
                            password = "uwservicesseniorassociate";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWSRM": {
                            username = "uwservicesregionalmanager";
                            password = "uwservicesregionalmanager";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUWManagementRole": {
                            username = "senioruwmanagement";
                            password = "senioruwmanagement";
                            brokerNumber = "0";
                        }
                        break;
                        case "UWManagerRole": {
                            username = "uwmanager";
                            password = "uwmanager";
                            brokerNumber = "0";
                        }
                        break;
                        case "UnderwriterRole": {
                            username = "underwriter";
                            password = "underwriter";
                            brokerNumber = "0";
                        }
                        break;
                        case "UnderwritingTechnicianRole": {
                            username = "underwritingtechnician";
                            password = "underwritingtechnician";
                            brokerNumber = "0";
                        }
                        break;
                        case "SeniorUWTechnicianRole": {
                            username = "senioruwtechnician";
                            password = "senioruwtechnician";
                            brokerNumber = "0";
                        }
                        break;
                        case "AgencyMarketingDirector": {
                            username = "agencymarketingdirector";
                            password = "agencymarketingdirector";
                            brokerNumber = "0";
                        }
                        break;
                        case "SurplusUW": {
                            username = "surplusuw";
                            password = "surplusuw";
                            brokerNumber = "0";
                        }
                        break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + subrole);
                    }
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                clickHome();
            }
            break;
            case "TRUEUP_STG":
            case "TRUEUP_DEV": {
                if (subrole.charAt(0) == 'Q' && Character.isDigit(subrole.charAt(1))) {
                    username = "qa_sum_" + String.format("%03d", Integer.valueOf(subrole.substring(1)));
                    brokerNumber = "0";
//                    password = "qa_sum_001" + subrole.substring(1);
                } else if (subrole.charAt(0) == 'P' && Character.isDigit(subrole.charAt(1))) {
                    Random r = new Random();
                    int low = 1;
                    int high = 22;
                    int randomNum = r.nextInt(high - low) + low;
                    username = "qa_sum_" + String.format("%03d", randomNum);
                    brokerNumber = "0";
                } else {
                    switch (subrole) {
                        case "Agent1": {
                            username = "vpetrovic123";
                            password = "Pure1234";
                            brokerNumber = "14673900";
                        }
                        break;
                        case "Agent2": {
                            username = "iantonijevic";
                            password = "iantonijevic";
                            brokerNumber = "800391600";
                        }
                        break;
                        case "Field": {
                            username = "Automation1";
                            password = "581826047019"; //updated on 11/17/2022
                            brokerNumber = "0";
                        }
                        break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + subrole);
                    }
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(username); //TODO pass is same as username USER
                clickLoginButton();
                clickHome();
            }
            break;
            case "PROD": {
                switch (subrole) {
                    case "Field": {
                        username = "automationuw1";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Zonal": {
                        username = "automationuw2";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "RUM": {
                        username = "automationuw3";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist1": {
                        username = "automationuw4";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Specialist2": {
                        username = "automationuw5";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "SeniorUnderwriter": {
                        username = "automationuw6";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter1": {
                        username = "automationuw7";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Underwriter2": {
                        username = "automationuw8";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "Analyst": {
                        username = "automationuw9";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA1": {
                        username = "automationuw10";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSA2": {
                        username = "automationuw11";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSSA": {
                        username = "automation2";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "UWSRM": {
                        username = "automationuw19";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    case "A0": {
                        username = "automation0";
                        password = "TestPass123!";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                secureLogin();
            }
            break;
            case "DR_PROD": {
                switch (subrole) {
                    case "P1": {
                        username = "Performance1";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P2": {
                        username = "Performance2";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P3": {
                        username = "Performance3";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P4": {
                        username = "Performance4";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P5": {
                        username = "Performance5";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P6": {
                        username = "Performance6";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P7": {
                        username = "Performance7";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P8": {
                        username = "Performance8";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P9": {
                        username = "Performance9";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P10": {
                        username = "Performance10";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P11": {
                        username = "Performance11";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P12": {
                        username = "Performance12";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P13": {
                        username = "Performance13";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P14": {
                        username = "Performance14";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P15": {
                        username = "Performance15";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P16": {
                        username = "Performance16";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P17": {
                        username = "Performance17";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P18": {
                        username = "Performance18";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P19": {
                        username = "Performance19";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P20": {
                        username = "Performance20";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P21": {
                        username = "Performance21";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P22": {
                        username = "Performance22";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P23": {
                        username = "Performance23";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P24": {
                        username = "Performance24";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P25": {
                        username = "Performance25";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P26": {
                        username = "Performance26";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P27": {
                        username = "Performance27";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P28": {
                        username = "Performance28";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P29": {
                        username = "Performance29";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P30": {
                        username = "Performance30";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P31": {
                        username = "Performance31";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P32": {
                        username = "Performance32";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P33": {
                        username = "Performance33";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P34": {
                        username = "Performance34";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P35": {
                        username = "Performance35";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P36": {
                        username = "Performance36";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P37": {
                        username = "Performance37";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P38": {
                        username = "Performance38";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P39": {
                        username = "Performance39";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P40": {
                        username = "Performance40";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P41": {
                        username = "Performance41";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P42": {
                        username = "Performance42";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P43": {
                        username = "Performance43";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P44": {
                        username = "Performance44";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P45": {
                        username = "Performance45";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P46": {
                        username = "Performance46";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P47": {
                        username = "Performance47";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P48": {
                        username = "Performance48";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P49": {
                        username = "Performance49";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P50": {
                        username = "Performance50";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P51": {
                        username = "Performance51";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P52": {
                        username = "Performance52";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P53": {
                        username = "Performance53";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P54": {
                        username = "Performance54";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P55": {
                        username = "Performance55";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P56": {
                        username = "Performance56";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P57": {
                        username = "Performance57";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P58": {
                        username = "Performance58";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P59": {
                        username = "Performance59";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P60": {
                        username = "Performance60";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P61": {
                        username = "Performance61";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P62": {
                        username = "Performance62";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P63": {
                        username = "Performance63";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P64": {
                        username = "Performance64";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P65": {
                        username = "Performance65";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P66": {
                        username = "Performance66";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P67": {
                        username = "Performance67";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P68": {
                        username = "Performance68";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P69": {
                        username = "Performance69";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P70": {
                        username = "Performance70";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P71": {
                        username = "Performance71";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P72": {
                        username = "Performance72";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P73": {
                        username = "Performance73";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P74": {
                        username = "Performance74";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P75": {
                        username = "Performance75";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P76": {
                        username = "Performance76";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P77": {
                        username = "Performance77";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P78": {
                        username = "Performance78";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P79": {
                        username = "Performance79";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P80": {
                        username = "Performance80";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P81": {
                        username = "Performance81";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P82": {
                        username = "Performance82";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P83": {
                        username = "Performance83";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P84": {
                        username = "Performance84";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P85": {
                        username = "Performance85";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P86": {
                        username = "Performance86";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P87": {
                        username = "Performance87";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P88": {
                        username = "Performance88";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P89": {
                        username = "Performance89";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P90": {
                        username = "Performance90";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P91": {
                        username = "Performance91";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P92": {
                        username = "Performance92";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P93": {
                        username = "Performance93";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P94": {
                        username = "Performance94";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P95": {
                        username = "Performance95";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P96": {
                        username = "Performance96";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P97": {
                        username = "Performance97";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P98": {
                        username = "Performance98";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P99": {
                        username = "Performance99";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P100": {
                        username = "Performance100";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P101": {
                        username = "Performance101";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P102": {
                        username = "Performance102";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P103": {
                        username = "Performance103";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P104": {
                        username = "Performance104";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P105": {
                        username = "Performance105";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P106": {
                        username = "Performance106";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P107": {
                        username = "Performance107";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P108": {
                        username = "Performance108";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P109": {
                        username = "Performance109";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P110": {
                        username = "Performance110";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P111": {
                        username = "Performance111";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P112": {
                        username = "Performance112";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P113": {
                        username = "Performance113";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P114": {
                        username = "Performance114";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P115": {
                        username = "Performance115";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P116": {
                        username = "Performance116";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P117": {
                        username = "Performance117";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P118": {
                        username = "Performance118";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P119": {
                        username = "Performance119";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P120": {
                        username = "Performance120";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P121": {
                        username = "Performance121";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P122": {
                        username = "Performance122";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P123": {
                        username = "Performance123";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P124": {
                        username = "Performance124";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P125": {
                        username = "Performance125";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P126": {
                        username = "Performance126";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P127": {
                        username = "Performance127";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P128": {
                        username = "Performance128";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P129": {
                        username = "Performance129";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P130": {
                        username = "Performance130";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P131": {
                        username = "Performance131";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P132": {
                        username = "Performance132";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P133": {
                        username = "Performance133";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P134": {
                        username = "Performance134";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P135": {
                        username = "Performance135";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P136": {
                        username = "Performance136";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P137": {
                        username = "Performance137";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P138": {
                        username = "Performance138";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P139": {
                        username = "Performance139";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P140": {
                        username = "Performance140";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P141": {
                        username = "Performance141";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P142": {
                        username = "Performance142";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P143": {
                        username = "Performance143";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P144": {
                        username = "Performance144";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P145": {
                        username = "Performance145";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P146": {
                        username = "Performance146";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P147": {
                        username = "Performance147";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P148": {
                        username = "Performance148";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P149": {
                        username = "Performance149";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P150": {
                        username = "Performance150";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P151": {
                        username = "Performance151";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P152": {
                        username = "Performance152";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P153": {
                        username = "Performance153";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P154": {
                        username = "Performance154";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P155": {
                        username = "Performance155";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P156": {
                        username = "Performance156";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P157": {
                        username = "Performance157";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P158": {
                        username = "Performance158";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P159": {
                        username = "Performance159";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P160": {
                        username = "Performance160";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P161": {
                        username = "Performance161";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P162": {
                        username = "Performance162";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P163": {
                        username = "Performance163";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P164": {
                        username = "Performance164";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P165": {
                        username = "Performance165";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P166": {
                        username = "Performance166";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P167": {
                        username = "Performance167";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P168": {
                        username = "Performance168";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P169": {
                        username = "Performance169";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P170": {
                        username = "Performance170";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P171": {
                        username = "Performance171";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P172": {
                        username = "Performance172";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P173": {
                        username = "Performance173";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P174": {
                        username = "Performance174";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P175": {
                        username = "Performance175";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P176": {
                        username = "Performance176";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P177": {
                        username = "Performance177";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P178": {
                        username = "Performance178";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P179": {
                        username = "Performance179";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P180": {
                        username = "Performance180";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P181": {
                        username = "Performance181";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P182": {
                        username = "Performance182";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P183": {
                        username = "Performance183";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P184": {
                        username = "Performance184";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P185": {
                        username = "Performance185";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P186": {
                        username = "Performance186";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P187": {
                        username = "Performance187";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P188": {
                        username = "Performance188";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P189": {
                        username = "Performance189";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P190": {
                        username = "Performance190";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P191": {
                        username = "Performance191";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P192": {
                        username = "Performance192";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P193": {
                        username = "Performance193";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P194": {
                        username = "Performance194";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P195": {
                        username = "Performance195";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P196": {
                        username = "Performance196";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P197": {
                        username = "Performance197";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P198": {
                        username = "Performance198";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P199": {
                        username = "Performance199";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    case "P200": {
                        username = "Performance200";
                        password = "test";
                        brokerNumber = "0";
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + subrole);
                }
                setBrokerNumber(brokerNumber);
                setUsername(username);
                setPassword(password);
                clickLoginButton();
                secureLogin();
            }
            break;
        }
        pause(3000);
        DataManager.getInstance().getData().put("SESSION_ID", getUserSessionId());
    }

    public void clickHome() {
        new CommonComponentsAndActions(driver).navigateToHomePage();
    }

    public void setLoggingLevel(String level) throws InterruptedException {
        if (hasValue(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PGActions")) &&
                Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PGActions").equalsIgnoreCase("Yes")) {
            Actions actions = new Actions(driver);
            actions.moveToElement(footer).click().keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("L").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
            pause(2000);
            driver.findElement(By.xpath("//input[@id='diagnosGridDbLoggingLevels-inputEl']")).clear();
            driver.findElement(By.xpath("//input[@id='diagnosGridDbLoggingLevels-inputEl']")).sendKeys(level);
            pause(500);
            driver.findElement(By.xpath("//span[text()='Set Logging Level']")).click();
            pause(500);
            driver.findElement(By.xpath("//span[text()='OK']")).click();
            pause(500);
            driver.findElement(By.xpath("(//div[@class='x-tool-tool-el x-tool-img x-tool-close '])[1]")).click();
            pause(500);
        }
        // TODO MOVE ELEMENTS, CREATE METHODS IN COMMON COMPONENTS AND ACTIONS add log
    }

    public void secureLogin() throws Throwable {
        clickElement(secureLogin.get(0), "Secure login");
    }

    public void openApplication(String env) {
        switch (env) {
            case "DEV": {
                driver.get("https://privdev2.purehnw.com/oneshield/index.jsp");
            }
            break;
            case "DEV2": {
                driver.get("https://dragon2.aws.purehnw.dev/oneshield/index.jsp");
            }
            break;
            case "QA": {
                driver.get("https://privqa2.purehnw.com/oneshield/index.jsp");
            }
            break;
            case "QA2": {
                driver.get("https://dragonqa2.aws.purehnw.app/oneshield/index.jsp");
            }
            break;
            case "STG": {
                driver.get("https://corestaging.purehnw.com/");
            }
            break;
            case "AWS_DEV": {
                driver.get("https://dragondev.aws.purehnw.com/");
            }
            break;
            case "AWS_QA": {
                driver.get("https://dragonqa.aws.purehnw.app/oneshield/index.jsp");
            }
            break;
            case "AWS_STG": {
                driver.get("https://dragonstg.aws.purehnw.online");
            }
            break;
            case "TRUEUP_DEV": {
                driver.get("https://dragon2.aws.purehnw.dev/oneshield/index.jsp");
            }
            break;
            case "TRUEUP_STG": {
                driver.get("https://dragonstg2.aws.purehnw.online/oneshield/index.jsp");
            }
            break;
            case "PROD": {
                driver.get("https://www.purehnw.com/");
            }
            break;
            case "DR_PROD": {
                driver.get("https://rehearse.purehnw.com/oneshield/index.jsp");
            }
            break;
            case "PRE_PROD": {
                driver.get("https://www.purehnw.blue/");
            }
        }

        infoLog("Navigated to " + env);
    }

    public void clickLoginButton() {
        clickElement(loginButton.get(0), "Login button");
    }

    public void setBrokerNumber(String value) {
        typeText(brokerNumberInput.get(0), value, "Broker number");
    }

    public void setUsername(String value) {
        typeText(usernameInput.get(0), value, "Username");
    }

    public void setPassword(String value) {
        typeTextEnter(passwordInput.get(0), value, "Password");
    }

}