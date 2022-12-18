package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMEthodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com"); // amazona gitti
        // driver.get ile aynı işlemi yapar. driver.get e göre daha hızlıdır.

        driver.navigate().to("https://www.techproeducation.com"); // techproya gitti

        driver.navigate().back(); // geldiği yere döndü. amazona

        driver.navigate().forward(); // techpro ya gitti.

        driver.navigate().refresh(); // sayfayı yeniler.
    }
}
