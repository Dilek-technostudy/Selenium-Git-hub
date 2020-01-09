package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTestWithException {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void init(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html" );
        wait = new WebDriverWait( driver, 5 );

    }

    @Test
    public void test(){
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.id("asdfjnafdgn") ) );
    }
}
