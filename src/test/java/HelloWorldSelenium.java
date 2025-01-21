import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldSelenium {

    @Test
    public void Hello() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Bruno\\Downloads\\firefoxdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://localhost:8080/leiloes");
        driver.quit();
    }
}
