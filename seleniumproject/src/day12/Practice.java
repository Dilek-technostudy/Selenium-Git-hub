package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://test-basqar.mersys.io");

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }
}
