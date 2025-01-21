package login;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void makeLogin() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Bruno\\Downloads\\firefoxdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("localhost:8080/login");
        driver.findElement(By.id("username")).sendKeys("fulano");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("login-form")).submit();


        Assert.assertFalse(driver.getCurrentUrl().equals("localhost:8080/login"));
        Assert.assertEquals("fulano", driver.findElement(By.id("user")).getText());

        driver.quit();
    }
}
