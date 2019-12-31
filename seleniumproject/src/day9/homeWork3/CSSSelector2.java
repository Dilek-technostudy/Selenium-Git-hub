package day9.homeWork3;

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

    }
}
