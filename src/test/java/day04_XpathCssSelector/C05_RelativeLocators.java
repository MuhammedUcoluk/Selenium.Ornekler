package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //Önce üzerlerinden tarif yapacağımız web elementlerini locate edelim.

        //WebElement sailor= driver.findElement(By.id());
        //2. Berlin i 3 farklı relative locator ile locate edin.
        //3. Relative Locators
    }
}
