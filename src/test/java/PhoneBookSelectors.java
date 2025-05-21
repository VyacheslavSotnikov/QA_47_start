import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {

        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FirstTest.pause(3);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();

        FirstTest.pause(3);
        WebElement TextOfBodyAbout = driver.findElement(By.className("about_main__2Uv5W"));
        System.out.println(TextOfBodyAbout.getText());

        FirstTest.pause(3);
        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();

        FirstTest.pause(3);
        WebElement InputEmail = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        InputEmail.sendKeys("sotiga2007@gmail.com");

        FirstTest.pause(3);
        WebElement InputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        InputPassword.sendKeys("12345");

        FirstTest.pause(3);
        WebElement btnLogin1 = driver.findElement(By.cssSelector("button[name='login']"));
        btnLogin1.click();

        driver.quit();
    }
}

