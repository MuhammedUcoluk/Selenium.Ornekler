package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//===================================BU WEB SAYFASI KULLANILMIYOR==========================================
public class C04_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. verilen web sayfasına gidin http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //b. Locate email textbox
        WebElement emailTextBox= driver.findElement(By.cssSelector("input[id='session_email']"));

        //c. Locate password textbox ve
        WebElement passwordTextBox= driver.findElement(By.cssSelector("input[placeholder='Password']"));

        //d. Locate signin button
        WebElement signInButton= driver.findElement(By.cssSelector("input[name='commit']"));
        //e. Aşağıdaki kullanıcı adı ve şifresyi girin ve sign in düğmesini tıklayın


        //      i. Username= testtechproed@gmail.com
        //      ii.Password= Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        // CSS İN AVANTAJI İD KULLANACAKSAK # YAZIP İD VALUESİ
        // . KOYUP CLASS VALUESİ YAZILABİLİR. PRATİK YÖNTEM FAKAT GENELLİKLE XPATH TERCİH EDİLİR.
    }
}
