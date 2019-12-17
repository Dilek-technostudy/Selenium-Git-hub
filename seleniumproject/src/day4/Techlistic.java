package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.List;


public class Techlistic {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        driver.findElement( By.name( "firstname" ) ).sendKeys( "Dilek" );
        driver.findElement( By.name( "lastname" ) ).sendKeys( "Yildirim" );
        driver.findElement( By.id ( "sex-1" ) ).click();
        driver.findElement( By.id ( "exp-1" ) ).click();

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        driver.findElement(By.id("datepicker")).sendKeys(date1.toString()); // date

        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("profession-1")).click(); // automation tester

        driver.findElement(By.id("tool-1")).click(); // test tool
        driver.findElement(By.id("tool-2")).click(); // test tool

        Select continents=new Select(driver.findElement(By.id("continents")));
        continents.selectByVisibleText("North America");


        Select seleniumCommands =new Select(driver.findElement(By.id("selenium_commands")));

        List<WebElement> option = seleniumCommands.getOptions();

        for(int i=0;i<option.size();i++) {

            option.get(i).click();
        }
        driver .findElement(By.id("submit")).click();


    }
}