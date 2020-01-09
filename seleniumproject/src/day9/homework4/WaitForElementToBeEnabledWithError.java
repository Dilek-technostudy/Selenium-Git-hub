package day9.homework4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class WaitForElementToBeEnabledWithError {


    /**
     * Open "http://the-internet.herokuapp.com/dynamic_controls"
     *
     * click on "Enable" button
     * wait for <input> of type="text" to be enabled within 2 seconds
     * if <input> of type="text" is still disabled print "Failure"
     * if test failed, take a screenshot and store it in homework4 folder
     *
     **/
    public static void main(String[] args){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_controls" );

        WebDriverWait wait = new WebDriverWait( driver, 2 );
        driver.findElement( By.cssSelector( "#input-example input[type='text']" ) ); //check the element is present

        driver.findElement( By.xpath( "//button[contains(text(), 'Enable')]" ) ).click();

        try {
            wait.until( ExpectedConditions.invisibilityOfElementLocated( By.cssSelector( "#input-example input[type='text'][disabled]")) );
            System.out.println( "Success!" );
        } catch(TimeoutException e) {
            System.out.println( "Failure, textInput was not enabled in 5 seconds!" );
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File(System.getProperty( "user.dir" ) + "/src/day9/homework/homework4/enabledFailed.png");
//            FileUtils.copyFile(file, DestFile);
        }

        driver.quit();
    }
}
