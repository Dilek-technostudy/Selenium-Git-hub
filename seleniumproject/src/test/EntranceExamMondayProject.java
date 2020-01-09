package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EntranceExamMondayProject {


    WebDriver driver;

    @BeforeClass
    public void prepareWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(" https://https://test-basqar.mersys.io/");
        driver.manage().window().maximize();
    }

    @Test
    public void login () throws InterruptedException{

        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");

        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");

        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-16 ng-star-inserted']")).click();

        driver.findElement(By.xpath("//span[text()='Registration Approve']")).click();

        driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();

        // driver.findElement(By.xpath("//div[contains(text(),'Exam')]")).sendKeys("Senior
        // High School 12 th grade Entrance Exam1");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'Grade Level of Registration')]")).click();

        driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'11th')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='mat-option-text'][contains(text(),'11th')]")));

        driver.findElement( By.xpath( "//mat-select[@aria-label='Choose Exam']" ) ).click();

        driver.findElement(By.xpath(
                "//span[@class='mat-option-text'][contains(text(),' Senior High School Entrance Exam for 11th Grade Level Students ')]"))
                .click();
        driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();

        driver.findElement(By.xpath("(//div[@class='mat-tab-label mat-ripple ng-star-inserted'])[1]")).click();

        String firstName="Dilek";

        // firstname
        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(firstName);

        String lastName="YILDIRIM";

        // lastname
        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys(lastName);

        Thread.sleep(20);

        // gender click
        driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]")).click();
        Thread.sleep(3000);

        // female click
        driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();


        String name=firstName+" "+ lastName;

        String gender="female";
        String birth="100180 ";

        driver.findElement(By.xpath("//input[@placeholder='Date of Birth']" + "")).sendKeys(birth);


        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@placeholder='Personal ID']" + "")).sendKeys("6789");


        Thread.sleep(1500);
        // click on citizenship
        WebElement citizenship=driver.findElement(By.xpath("//div//span[@class='mat-select-placeholder ng-tns-c36-70 ng-star-inserted']"));

        citizenship.click();

        // selecting country
        driver.findElement(By.xpath("//mat-option//span[@class='mat-option-text'][contains(text(),'Turkey')]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//mat-option//span[@class='mat-option-text'][contains(text(),'Turkey')]"))) ;

        String email="dilek@gmail.com";
        driver.findElement(By.xpath("//input[@placeholder='Email']" + "")).sendKeys(email);
        Thread.sleep(3000);
        //clicking on nationality

        driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]")).click();

        //Selecting Turkish
        Thread.sleep(3000);
        driver.findElement(By.xpath("//mat-option//span[@class='mat-option-text'][contains(text(),'Turkish" + "')]")).click();


        // closing the cookies warning
//        driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();

        //click on Save button

        driver.findElement(By.xpath(" (//span[@class='mat-button-wrapper'])[11]")).click();



        //relative info
         driver.findElement (By.xpath("//div[contains(text(),'Relative Info')]")).click();
        //representative
        WebElement representative = driver.findElement(By.xpath("//span[@class='mat-select-placeholder ng-tns-c36-82 ng-star-inserted']"));
        representative.click();
        //mother
        driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),' Mother ')]")).click();
        //last name
        driver.findElement(By.xpath("//input[@id='mat-input-25']")).sendKeys("YILDIRIM");
        //name
        driver.findElement(By.xpath("//input[@id='mat-input-26']")).sendKeys("Nuran");
        //phone num
        driver.findElement(By.id ("mat-input-16")).sendKeys("714 697 5197");


        driver.findElement(By.xpath("(//mat-select[@aria-label='Country'])[1]")).click();
        driver.findElement(By.cssSelector("mat-option:nth-child(3)")).click();

          // click on Save button
//
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("mat-option:nth-child(5)")));

        driver.findElement(By.xpath("//ms-save-button[@caption='GENERAL.BUTTTON.SAVE']")).click();


    }
//    @AfterClass
//    public void quit() {
//        driver.quit();
//    }
}
