import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookIlCarroxPath{

    WebDriver driver = new ChromeDriver();

    @Test
    public void xpathText(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement div = driver.findElement(By.xpath("//div[@id='root']")); // div[@id='root']
        System.out.printf(div.getText());

        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);

        System.out.println("==================");

        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();

        FirstTest.pause(2);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("sotiga2015@gmail.com");

        FirstTest.pause(2);
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Sh12345!@");

        FirstTest.pause(2);
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();

       driver.quit();
    }

    @Test
    public void ilCarroXPath(){
    driver.get("https://ilcarro.web.app/search");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
    btnSignUp.click();

    FirstTest.pause(1);
    WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
    inputName.sendKeys("Slava");

    FirstTest.pause(1);
    WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
    inputLastName.sendKeys("Sotsot");

    FirstTest.pause(1);
    WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
    inputEmail.sendKeys("sotiga2018@gmail.com");

    FirstTest.pause(1);
    WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
    inputPassword.sendKeys("Bilbo12345@");

    FirstTest.pause(1);
        WebElement checkbox = driver.findElement(By.id("terms-of-use"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);

    FirstTest.pause(1);
    WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
    btnYalla.click();

    FirstTest.pause(2);
    WebElement btnOk = driver.findElement(By.xpath("//div[@id='cdk-overlay-0']//button[@class='positive-button ng-star-inserted']"));
    btnOk.click();
    }

    @Test
    public void xPathPhonebookHW(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btnLogin = driver.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']//a[@href='/login']"));
        btnLogin.click();

        FirstTest.pause(1);
        WebElement inputAddEmail = driver.findElement(By.xpath("//div[@class='login_login__3EHKB']//form/input[1]"));
        inputAddEmail.sendKeys("sotiga2009@gmail.com");
        FirstTest.pause(2);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys("Sh12345!@");

        FirstTest.pause(2);
        WebElement btnLogin1 = driver.findElement(By.xpath("//button[text()='Login']"));
        btnLogin1.click();

        FirstTest.pause(2);
        WebElement btnAdd = driver.findElement(By.xpath("//a[@href='/add']"));
        btnAdd.click();

        FirstTest.pause(1);
        WebElement inputAddName = driver.findElement(By.xpath("//div[@class='add_form__2rsm2']/input[1]"));
        inputAddName.sendKeys("Slava");

        FirstTest.pause(1);
        WebElement inputAddLastName = driver.findElement(By.xpath("//div[@class='add_form__2rsm2']/input[2]"));
        inputAddLastName.sendKeys("Slavasot");

        FirstTest.pause(1);
        WebElement inputPhone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
        inputPhone.sendKeys("0539588764");

        FirstTest.pause(1);
        WebElement inputAddEmail1 = driver.findElement(By.xpath("//div[@class='add_form__2rsm2']/input[4]"));
        inputAddEmail1.sendKeys("sotiga2009@gmail.com");

        FirstTest.pause(1);
        WebElement inputAddAddress = driver.findElement(By.xpath("//div[@class='add_form__2rsm2']/input[5]"));
        inputAddAddress.sendKeys("Bat Yam");

        FirstTest.pause(1);
        WebElement inputAddDescription = driver.findElement(By.xpath("//input[@placeholder='description']"));
        inputAddDescription.sendKeys("Eli Cohen");

        FirstTest.pause(2);
        WebElement btnSave = driver.findElement(By.xpath("//div[@class='add_form__2rsm2']/button/b[text() = 'Save']"));
        btnSave.click();

        FirstTest.pause(2);
        WebElement contact1 = driver.findElement(By.xpath("//div[@class='contact-page_contactspage__2TPwe']//div[@class='contact-item_card__2SOIM']"));
        contact1.click();

        FirstTest.pause(2);
        WebElement btnSignOut = driver.findElement(By.xpath("//*[text()='Sign Out']"));
        btnSignOut.click();

        driver.quit();
    }

    @Test
    public void ilCarroXPathHW(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FirstTest.pause(2);
        WebElement btnLogin1 = driver.findElement(By.xpath("//div[@class='header']/a[@href='/login?url=%2Fsearch']"));
        btnLogin1.click();

        FirstTest.pause(2);
        WebElement btnEmail1 = driver.findElement(By.xpath("//div[@class='input-container']/input[@id='email']"));
        btnEmail1.sendKeys("sotiga2018@gmail.com");

        FirstTest.pause(2);
        WebElement btnPassword1 = driver.findElement(By.xpath("//div[@class='input-container']/input[@id='password']"));
        btnPassword1.sendKeys("Bilbo12345@");

        FirstTest.pause(3);
        WebElement btnYalla1 = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla1.click();

        FirstTest.pause(2);
        WebElement btnOK = driver.findElement(By.xpath("//div[@id='cdk-overlay-0']//button[@class='positive-button ng-star-inserted']"));
        btnOK.click();

        driver.quit();
    }
}





