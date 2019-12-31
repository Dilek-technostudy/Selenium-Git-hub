package day9.homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    /**
     * Open "http://the-internet.herokuapp.com/login"
     *
     * using XPath:
     *      grab username from first <em> tag and store inside a String
     *      grab password from second <em> tag and store inside a String
     *      fill in username and password inputs with above username and password
     *      find <button> with type="submit" and click it
     *      find and verify text "Welcome to the Secure Area. When you are done click logout below."
     *      find "Log out" button and click it
     *      find and verify text "You logged out of the secure area!"
     *
     * */
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dilek\\IdeaProjects\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/login" );

        String username = driver.findElement( By.xpath("//em[1]") ).getText();
        String password = driver.findElement( By.xpath("//em[2]") ).getText();

        driver.findElement( By.xpath( "//input[@id='username']" ) ).sendKeys( username );
        driver.findElement( By.xpath( "//input[@id='password']" ) ).sendKeys( password );

        driver.findElement( By.xpath( "//button[@type='submit']//*[contains(text(), 'Login')]" ) ).click();
        validateFlashText( driver, "You logged into a secure area!" );

        driver.findElement( By.xpath( "//*[contains(text(), 'Logout')]" ) ).click();
        validateFlashText( driver, "You logged out of the secure area!" );

        driver.quit();
    }

    private static void validateFlashText(WebDriver driver, String testText) {
        String flashText = driver.findElement( By.xpath( "//div[@id='flash']" ) ).getText();
        String xButton = driver.findElement( By.xpath( "//div[@id='flash']/a" ) ).getText();
        String actualText = flashText.replaceAll( xButton, "" ).trim();
        System.out.println(actualText.equals( testText ) ? "Success!": "Failure!");
    }
}
