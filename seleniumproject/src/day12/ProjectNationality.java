package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProjectNationality {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://test-basqar.mersys.io");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);

 driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-13 ng-star-inserted']")).click();

        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-14 ng-star-inserted']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

        driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

        driver.findElement(By.xpath("//span[text()='Nationalities']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();


        driver.findElement(By.xpath("//input[@id='ms-text-field-1']")).sendKeys("Genius1");

        Thread.sleep(2000);

 driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")).click();

        Thread.sleep(2000);

        List<WebElement> names = driver.findElements(By.xpath("//tbody//tr/td[2]"));

 List<WebElement> edit = driver.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-accent ng-star-inserted']"));

        for (int i = 0; i < names.size(); i++) {

            names.get(i).getText();

            if (names.get(i).getText().contains("Genius1") ) {

                edit.get(i).click();

            }

            driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).clear();
        }

  driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).sendKeys("Genius1");

 driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
                .click();

driver.findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();


  driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();
            }
        }

