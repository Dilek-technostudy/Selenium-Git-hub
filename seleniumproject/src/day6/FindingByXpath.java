package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingByXpath {

    // https://www.seleniumeasy.com/test/input-form-demo.html
    // fill in the form using xpath by attribute,
    // by contains(),
    // by index,
    // also by child
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Dilek");
        driver.findElement( By.xpath("//* [@name='last_name'] ") ).sendKeys( "Yildirim" );
        WebElement email=driver.findElement( By.xpath( "//*[@placeholder='E-Mail Address']" ) );
        email.sendKeys( "dileknuranyildirim@gmail.com" );


        // using index
        WebElement phone = driver.findElement( By.xpath( "//div[@class='form-group'][4]//input[@type='text']" ) );
        phone.sendKeys( "7146975196" );

        // using child
        WebElement address = driver.findElement( By.xpath( "//div[@class='form-group'][5]//child::input" ) );
        address.sendKeys( "My Address" );



        // by contains
//        List<WebElement> list1 = driver.findElements( By.xpath( "//*[contains(@name,'name')]" ) );
//        for(WebElement element : list1) {
//            element.sendKeys( "Name" );
//        }

    }
}
