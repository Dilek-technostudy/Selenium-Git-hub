package day9.homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Open "https://ultimateqa.com/complicated-page/"
 * find "Skills Improved:" using css selectors and validate text
 * find "How to deal with a large page that has many elements and divisions?" using css selector and validate it
 * find "Properly structuring your page objects" using css selector and validate it
 * */

public class CSSSelector2 {
    public static void main(String[] args) {


        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://ultimateqa.com/complicated-page/" );

        String textToValidate1 = "Skills Improved:";
        String textToTest1 = driver.findElement( By.cssSelector( "#Skills_Improved" ) ).getText();
        System.out.println( textToValidate1.equals( textToTest1 ) ? "Success!" : "Failure" );

        String textToValidate2 = "How to deal with a large page that has many elements and divisions?";
        String textToTest2 = driver.findElement( By.cssSelector( ".et_pb_text_inner > ul > li:first-child" ) ).getText();
        System.out.println( textToValidate2.equals( textToTest2 ) ? "Success!" : "Failure" );

        String textToValidate3 = "Properly structuring your page objects";
        String textToTest3 = driver.findElement( By.cssSelector( ".et_pb_text_inner > ul > li:last-child" ) ).getText();
        System.out.println( textToValidate3.equals( textToTest3 ) ? "Success!" : "Failure" );

        driver.quit();
    }
}
