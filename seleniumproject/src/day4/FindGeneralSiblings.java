package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindGeneralSiblings {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/input-form-demo.html" );
        // finds general siblings of the first element that has "tree-branch"  class
        List<WebElement> siblingElements = driver.findElements( By.cssSelector( ".tree-branch ~ li" ) );
        for(WebElement e: siblingElements) {
            System.out.println( e.getText() );
            System.out.println( "---------------------------------------" );
        }
        driver.quit();
    }
}
