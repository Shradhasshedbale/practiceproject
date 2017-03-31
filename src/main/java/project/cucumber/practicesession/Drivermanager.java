package project.cucumber.practicesession;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



/**
 * Created by SHRADHA on 10/02/2017.
 */

    public class Drivermanager {
        public static WebDriver driver;
        public Drivermanager(){

            PageFactory.initElements(driver,this);
        }

        public void Openbrowser() throws Throwable {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\SHRADHA\\IdeaProjects\\gmailinboxtesting\\src\\test\\resources\\features\\config.properties");
            properties.load(fileInputStream);

            FirefoxDriverManager.getInstance().setup();
            ChromeDriverManager.getInstance().setup();

            //System.setProperty("webdriver.chromedriver.driver", "cromedriver.exe");
            //System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

            String url = properties.getProperty("url");
            String browser = properties.getProperty("browser");
           /* DesiredCapabilities capabilities = new DesiredCapabilities();
            WebDriver driver = new RemoteWebDriver(capabilities);
            Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();*/



            if ("chrome".matches(browser)) {
                driver = new ChromeDriver();
            } else if ("firefox".matches(browser)) {
                driver = new FirefoxDriver();
            }/*else if ("REMOTE" .matches(browser))
            {
                driver = new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);
            }*/

            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



        }

        public void closebrowser()
        {
            driver.quit();
        }
    }


