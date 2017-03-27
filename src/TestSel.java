import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.concurrent.TimeUnit;

/**
 * Created by student on 27.03.2017.
 */
public class TestSel {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\student.STEP\\Downloads\\geckodriver-v0.15.0-win64 (2)//geckodriver.exe");


        ProfilesIni profiles = new ProfilesIni();





        WebDriver webdr = new FirefoxDriver();
        webdr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webdr.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        webdr.get("https://www.ukr.net");



        webdr.quit();
    }

}
