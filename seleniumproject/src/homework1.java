import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
            driver.findElement(By.className("dropdown-toggle")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();
            driver.findElement(By.id("isAgeSelected")).click();

            String text=driver.findElement(By.id("txtAge")).getText();

            if(text.equals("Success - Check box is checked")) {
                System.out.println("Pass");
            }else {
                System.out.println("fail");
            }

        }

    }




