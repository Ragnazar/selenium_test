import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
