import org.apache.xerces.util.SynchronizedSymbolTable;
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

    public static String getSearchURL(){
        String searchUrl = "";

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\student.STEP\\Downloads\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        WebElement findField = driver.findElement(By.id("twotabsearchtextbox"));
        findField.sendKeys("toys");

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.quit();
            getSearchURL();
        }

        WebElement searchBtnBlock = driver.findElement(By.id("nav-search-submit-text"));

        searchBtnBlock.click();


        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.quit();
            getSearchURL();
        }
        driver.getCurrentUrl();

        WebElement nextPage = driver.findElement(By.id("pagnNextString"));
        nextPage.click();


        searchUrl = driver.getCurrentUrl();

        try {
            Thread.sleep(1000*15);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.quit();
            getSearchURL();
        }

        System.out.printf(searchUrl);
        driver.quit();
        return searchUrl;

    }




    public static void main(String[] args) throws InterruptedException{

    getSearchURL();







        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\student.STEP\\Downloads\\Selenium\\geckodriver.exe");
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
        */


    }



}
