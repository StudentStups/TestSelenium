import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.concurrent.TimeUnit;

/**
 * Created by student on 27.03.2017.
 */
public class TestSel {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\student.STEP\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        WebElement newAccountElement = driver.findElement(By.id("nav-flyout-ya-newCust"));
        WebElement newAccountLinkElement = newAccountElement.findElement(By.tagName("a"));
        String newAccountLink = newAccountLinkElement.getAttribute("href");
        driver.get(newAccountLink);

        WebElement inputNameField = driver.findElement(By.id("ap_customer_name"));
        inputNameField.sendKeys("AibAibaaaaa");

        WebElement inputEmailField = driver.findElement(By.id("ap_email"));
        inputEmailField.sendKeys("asdfgjJJWlsM@gmail.com");

        WebElement inputPassField = driver.findElement(By.id("ap_password"));
        inputPassField.sendKeys("Papspdasdk");

        WebElement inputPassCheckField = driver.findElement(By.id("ap_password_check"));
        inputPassCheckField.sendKeys("Papspdasdk");

        try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement regBtn = driver.findElement(By.id("continue"));
        regBtn.click();

        String logginedPageLink = driver.getCurrentUrl();

        



        driver.quit();

    }

}
