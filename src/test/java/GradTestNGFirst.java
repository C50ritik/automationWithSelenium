import org.testng.annotations.Test;

public class GradTestNGFirst extends BaseClass {
    @Test
    public void launchFB_Application() throws InterruptedException {
        driver.get("https://www.morningstar.com");
        Thread.sleep(200);
    }

    @Test
    public void launchFK_Application() throws InterruptedException {
        driver.get("https://www.flipkart.com");
        Thread.sleep(200);

    }
}
