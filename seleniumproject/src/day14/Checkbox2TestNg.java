package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Checkbox2TestNg {

    WebDriver driver;

    @BeforeClass
        public void prepareWebDriver(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

    }
    @AfterClass
    public void quit() {
        driver.quit();
    }
    @Test public void firstTestCase(){
        List<WebElement> elements = driver.findElements( By.className( "cb1-element" ) );
        for(WebElement element : elements) {
            element.click();
        }
        String actualButtonText = driver.findElement( By.id( "check1" ) ).getAttribute( "value" );
        Assert.assertEquals( actualButtonText, "Uncheck All" );
    }
    @Test
    public void secondTestCase() {
        driver.findElement(By.className("cb1-element")).click();
        String actualButtonText = driver.findElement(By.id("check1")).getAttribute("value");
        Assert.assertEquals(actualButtonText, "Check All");


    }
}
