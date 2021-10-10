import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    @BeforeTest
    public void setupApplication() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver .manage() .timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(200);
        driver.close();
    }

}