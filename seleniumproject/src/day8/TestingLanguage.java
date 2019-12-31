package day8;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestingLanguage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/en");
        driver.manage().window().maximize();

        int size = driver.findElements(By.xpath("//a[@class='dropdown-item']")).size();

        for (int i = 0; i < size; i++) {
            WebElement button = driver.findElement(By.id("dropdownLangauge"));
            List<WebElement> language = driver.findElements(By.xpath("//a[@class='dropdown-item']"));

            button.click();

            String myLanguage = language.get(i).getText();

            language.get(i).click();

            Thread.sleep(3000);

            String myUrl = driver.getCurrentUrl();

            eachLanguage(myUrl, myLanguage);

        }
        System.out.println("We passed");
    }

    public static void eachLanguage(String url, String language) {

        if (language.equals("English")) {
            junit.framework.Assert.assertTrue(url.contains("en"));
        }

        else if (language.equals("Russian")) {

            junit.framework.Assert.assertTrue(url.contains("ru"));

        } else if (language.equals("Farsi")) {

            junit.framework.Assert.assertTrue(url.contains("fa"));

        } else if (language.equals("German")) {
            junit.framework.Assert.assertTrue(url.contains("de"));

        } else if (language.equals("Vietnamese")) {

            junit.framework.Assert.assertTrue(url.contains("vi"));

        } else if (language.equals("French")) {

            junit.framework.Assert.assertTrue(url.contains("fr"));

        } else if (language.equals("Turkish")) {

            junit.framework.Assert.assertTrue(url.contains("tr"));

        } else if (language.equals("Arabic")) {

            junit.framework.Assert.assertTrue(url.contains("ar"));

        } else if (language.equals("Spanish")) {

            junit.framework.Assert.assertTrue(url.contains("es"));

        } else {


        }
    }

}



