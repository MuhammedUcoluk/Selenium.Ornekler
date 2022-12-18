package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin.
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2. Add Elemenet butonuna basın
       driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();


        //3. Delete butonunun görünür olduğunu test edin.
        WebElement deleteButton= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("delete buttonu görünüyor testi PASS");
        }else {
            System.out.println("delete buttonu görünüyor testi FAİLED");
        }

        //4. Delete tuşuna basın
        deleteButton.click();

        //5. "Add/Remove Elements" yazısının görünür olduğunu test edin.
        WebElement addYazısıElementi= driver.findElement(By.xpath("//h3"));
        //WebElement addYazısıElementi2=driver.findElement(By.tagName("h3"));
        if (addYazısıElementi.isDisplayed()){
            System.out.println("add yazısı görünüyor testi PASS");
        }else {
            System.out.println("add yazısı görünüyor testi FAİLED");
        }
            driver.close();

    }
}
