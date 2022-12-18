package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //2. Youtube anasayfasına gidelim.
        driver.navigate().to("https://www.youtube.com");

        //3. Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");

        //4. Tekrar youtube sayfasına gidelim
        driver.navigate().back();

        //5. Yeniden Amazon sayfasına gidelim
        driver.navigate().forward();

        //6. SAyfayı refresh yapalım
        driver.navigate().refresh();

        //7. Sayfayı kapatalım
        driver.quit(); // quit bizim driver ımızın açtığı tüm sayfaları kapatır.
    }                  // close driver ın son bulunduğu sayfayı kapatır.
}
