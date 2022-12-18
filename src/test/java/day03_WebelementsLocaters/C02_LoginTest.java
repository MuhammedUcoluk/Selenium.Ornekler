package day03_WebelementsLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("https://a.testaddressbook.com/");

        //b. Sign in butonuna basın
        WebElement signInLinki= driver.findElement(By.id("sign-in"));//sadece locate edip bir variable ya assign ettik
        signInLinki.click();

        //c. email textbox,password textbox, and signin elementlerini locate ediniz.
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

        //d. Kullanıcı adı ve şifreyi aşağıya girin ve oturum aç(sign in) butonuna tıklayın.
        //      i. Username : testtechproec@gmail.com
        //      ii.Password : Test1234!

        emailTextBox.sendKeys("testtechproec@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayın (Verify)

        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualGirisYazisi= girisYazisiElementi.getText();
        String expectedGirisYazisi="Welcome to Address Book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya giriş testi PASS");
        }else{
            System.out.println("Sayfaya giriş testi FAİLED");
        }

        //f. "Addresses ve "Sign Out" textlerinin görüntülendiğini (displayed) doğrulayın(Verify)
        WebElement addressWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signoutElementi=driver.findElement(By.linkText("Sign out"));

        System.out.println(addressWebElementi.isDisplayed());//true ve ya false döndürecek.

        if (addressWebElementi.isDisplayed()){
            System.out.println("Address elementi görüntüleme testi PASS");
        }else {
            System.out.println("Address elementi görüntüleme testi FAİLED");
        }
        if (signoutElementi.isDisplayed()){
            System.out.println("Sign Out elementi görüntüleme testi PASS");
        }else {
            System.out.println("Sign Out elementi görüntüleme testi FAİLED");
        }


        //g. Sayfada kaç tane link olduğunu bulun.

        List<WebElement> LinklerListesi=driver.findElements(By.tagName("a"));

        System.out.println("sayfada" + LinklerListesi.size() + "adet link bulunmaktadır.");
        driver.close();

    }
}
