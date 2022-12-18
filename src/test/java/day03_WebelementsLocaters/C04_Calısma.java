package day03_WebelementsLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Calısma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://tvplus.com.tr/");

        WebElement signInButonu= driver.findElement(By.className("register"));
        signInButonu.click();

        WebElement cepTelefonuTextBox= driver.findElement(By.id("__JSBridgeIframe_1.0__"));
        WebElement sifreTextBox= driver.findElement(By.tagName("password"));
        WebElement girisYapTextBox=driver.findElement(By.id("__JSBridgeIframe_SetResult_1.0__"));

        cepTelefonuTextBox.sendKeys("5414542930");
        sifreTextBox.sendKeys("Ataturk.1283");
        girisYapTextBox.click();
    }
}
