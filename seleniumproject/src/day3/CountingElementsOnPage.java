package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElementsOnPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\dilek\\IdeaProjects\\Seleniumgit\\seleniumproject\\src\\day3\\form.html");

        List<String> list = Arrays.asList("h1", "h2", "h3", "p", "input", "option", "br", "select");
        List<String> tagsForTesting = new ArrayList<>(list);
        tagsForTesting.add("form");
        for (String tag : tagsForTesting) {
            printNumberOfElementsOnAPage(driver, tag);
        }

        driver.quit();
    }

    static void printNumberOfElementsOnAPage(WebDriver driver, String tagName) {
        List<WebElement> elements = driver.findElements(By.tagName(tagName));
        System.out.println("There is(are) " + elements.size() + " " + tagName + " tag(s) on page!");
    }
}