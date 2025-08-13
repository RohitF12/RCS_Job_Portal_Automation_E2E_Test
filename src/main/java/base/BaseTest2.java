package base;

import config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import POM_Candidate.Candidate_LoginPage;


 public class BaseTest2 {
	 
	 public WebDriver admindriver;


    @Test    
    public void openAdminbrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        admindriver = new ChromeDriver(options);
        admindriver.manage().window().maximize();
        admindriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        admindriver.get(Config.getProperty("Admin_Login"));

    }

}
    