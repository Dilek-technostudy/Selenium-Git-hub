package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homework2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.findElement(By.className("dropdown-toggle")).click();

        driver.findElement(By.linkText("Checkbox Demo")).click();

        List<WebElement> option = driver.findElements(By.className("cb1-element"));

        for (int i = 0; i < option.size(); i++) {

            option.get(i).click();

        }
        String text = driver.findElement(By.id("check1")).getAttribute("value");

        if (text.equals("Uncheck All")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        for (int i = 0; i < option.size(); i++) {

            option.get(i).click();

            text = driver.findElement(By.id("check1")).getAttribute("value");

            if (text.equals("Check All")) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }

    }
}

