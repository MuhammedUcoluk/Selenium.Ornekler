package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. Selenium: Web sitelerini otomasyon ile ttest etmemize imkan veren bir suit of tool dur.
// 2. Artı Yanları: -Ücretsiz açık kaynak
    //          - birçok kodlama dili ile çalışır(Javayı selenium için öğrendik)
//              - geniş bir kullanıcı kitlesi var. Yaşadığımız sorunlara cevap bulabileceğimiz sadık bir topluluk var
//              - Şuan piyasada en çok kullanılan otomasyon toolu dur.
// Eksi Yanları: - Sadece web uyg için kullanılabilir. Mobil uyg için Appium kullanılarak test yapılabilir.
             //   - capthca yı aşamaz (ben robot değilim)
// 3. WebDriver : bir interface dir. dolayısı  ısı ile obje üretemeyiz. Browser ların bir driver oluşturabilmesi
// için bir kalıp gibi çalışır. Biz hangi browser i kullanmak istersek driver oluştururken o brows a ait constructur u kullanırız.
// 4. Driver insan olarak yaptığımız veya gördüğümüz tüm işlemleri otomasyon yapmamıza yardımcı olur.

public class day01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //BİZ DRİVER OBJESİ OLUŞTURDUĞUMUZDA BOŞ BİR CHROME BROWSER AÇILIR!!!

       driver.get("https://www.ebay.com");
       //driver.get methodu drivera gideceği web adresini girmemizi sağlar.

        Thread.sleep(3000); // sayfanın ne kadar açık kalacağı komutu verdim
       driver.close(); // sayfayı kapattım.
    }
}
