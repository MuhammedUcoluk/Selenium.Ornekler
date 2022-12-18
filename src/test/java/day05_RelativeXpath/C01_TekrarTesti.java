package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. amazon sayfasına gidin.
        driver.navigate().to("https://www.amazon.com");

        //2. browseri tam sayfa açın
        driver.manage().window().fullscreen();

        //3. sayfayı refresh yapın

        driver.navigate().refresh();

        //4. sayfa başlangıcının spendless içerdiğini test edin.
        String sayfaBasligi= driver.getTitle();
        System.out.println(sayfaBasligi);
        if (sayfaBasligi.contains("Spend less")){
            System.out.println("sayfa başlığı testi PASS");
        }else{
            System.out.println("sayfa başlığı testi FAİLED");
        }

        //5. Gift Cards sekmesine basın
       WebElement giftCardSekmesi= driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
        giftCardSekmesi.click();

        //6. Birthday butonuna basın
        WebElement birthdayButonu= driver.findElement(By.xpath("(//div[@class='bxc-grid__image   bxc-grid__image--light'])[3]"));
        birthdayButonu.click();

        //7. Best Seller bölümünden ilk ürüne tıklayın

        WebElement ilkUrun= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]"));
        ilkUrun.click();

        //8. Gift Card details den 25 $ ı seçin.

        WebElement details=driver.findElement(By.xpath("//button[@value='25']"));
        details.click();

        //9. ürün ücretinin 25 $ olduğunu test ediniz.

        WebElement ücretTesti= driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        ücretTesti.isDisplayed();

        if (ücretTesti.isDisplayed()){
            System.out.println("ücret testi PASS");
        }else {
            System.out.println("ücret testi FAİLED");

        }
        //10. Sayfayı kapatın
        driver.close();
    }
}
