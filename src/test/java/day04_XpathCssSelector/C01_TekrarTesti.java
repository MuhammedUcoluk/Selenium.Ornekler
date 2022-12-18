package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //a. Amazon web sayfasına gidin
        driver.get("https://www.amazon.com");

        //b. Search kutusuna "city bike" yazıp arattırın.
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER); // aratmak için ister bu
        //aramaKutusu.submit(); // istersen bunu kullan

        //c. Amazonda görüntülenen ilgili sonuçların sayısını yazdırın
       WebElement sonucYazısıElementi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazısıElementi.getText()); //1-16 of 119 results for "city bike" get text olmasa referans yazar


        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın

       // WebElement ilkUrunResmi= driver.findElement(By.className("a-section aok-relative s-image-fixed-height"));
       // ilkUrunResmi.click();
        WebElement ilkUrunResmi= driver.findElement(By.xpath("//img[@alt='6KU Track Fixed Gear Bicycle']"));
        ilkUrunResmi.click();
        // sadece click gibi basit bir işlemde kullanacağımız webelementler için.
        // variable oluşturmadan direk locate edip istediğimiz işlemi yapabiliriz.
        //ÖRNEK========>>>>>>>>
        //driver.findElement(By.className("a-section aok-relative s-image-fixed-height")).click();

    }
}
