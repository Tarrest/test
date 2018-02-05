import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {

    public WebDriver driver;

    @BeforeTest
    public void initBrowser() {
        driver = new FirefoxDriver();
    }

    @Test
    public void testRunGoogle() {
        driver.get("https://google.com.ua");
    }

    @AfterTest
    public void stopBrowser() {
        driver.quit();
    }

}
