package day7;

import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;


public class TakeAScreenShot {

    public static void main(String[] args)  throws InterruptedException, IOException{


        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jsfiddle.net/daulet2030/eLy027xg/");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.switchTo().frame("result");
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#test1")));
        System.out.println(webElement.getTagName());
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./test.png");
//        FileUtils.copyFile(file, DestFile);


    }
}