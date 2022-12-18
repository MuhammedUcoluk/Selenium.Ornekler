package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Normalde selenium un kendi IDEsi var fakat biz daha kullanışlı olması için İntellij kullanıyoruz.
    // İntellij de yeni bir proje açtığımızda öncelikle selenium kütüphanelerini projeye eklememiz gerekir.
    // Biz en ilkel haliyle projemize kütüphaneleri jar dosyası olarak yükledik.
    // Bu eklediğimiz dosyalarla artık driver ların ayarlarını yapabiliriz.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // setProperty 2 parametre ister.
        //ilki kullanacağımız browser a ait driver.
        // ikincci selenium sitesinden indirip projemize eklediğimzi chromedriver ın path i.
        // windows kullanıcıları sona exe ekler apple eklemez.

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // java dan gelir içine yazılan milisaniye kadar kodların çalışmasını durdurur.
        driver.close();
        // class ın sonuna yazılır. Bu kod çalışınca driver kapanır. Yeniden bir browser açmak istiyorsak
        // driver a yeni değer atamalıyız.
        driver=new ChromeDriver();
    }
}
