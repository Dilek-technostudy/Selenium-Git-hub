package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class FireFoxBrowser {
        public static void main(String[] args) {
            System.setProperty( "webdriver.gecko.driver", "C:\\Users\\dilek\\IdeaProjects\\Selenium\\geckodriver.exe" );
            WebDriver driver = new FirefoxDriver();
            driver.get( "https://www.techno.study/" );
        }
    }



