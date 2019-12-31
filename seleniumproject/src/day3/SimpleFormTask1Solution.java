package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SimpleFormTask1Solution {
    public static void main(String[] args) {

        System.setProperty( "webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage() .window().maximize();
        WebElement message = driver.findElement(By.id("user-message"));
        String mymessage="Testing message box";
        message.sendKeys(mymessage);
        List<WebElement > buttons=driver.findElements(By.tagName("button")) ;
        for(WebElement button:buttons){
        if(button.getText().equals( "Show Message" )) {
            button.click();
        }
        }
        WebElement display = driver.findElement( By.id( "display" ) );
        String text = display.getText();

        if(text.equals( mymessage )){
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");

        }
//      driver.quit();
    }



}
