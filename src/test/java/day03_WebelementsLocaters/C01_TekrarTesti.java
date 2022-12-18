package day03_WebelementsLocaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Youtube a gidin sayfa başlığının youtebe olup olmadığını doğrulayın.Eğer değilse doğru başlığı
        //konsolda yazdırın
        driver.navigate().to("https://www.youtube.com");
        String actualtitleYoutube= driver.getTitle();
        String expectedYoutubeTitle="youtube";

        if (actualtitleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("Youtube title testi PASS");
        }else {
            System.out.println("Youtube title testi FAİLED\nactual sayfa başlığı :" + actualtitleYoutube);
        }
        //3. Sayfa url sinin "youtube" içerip içermediğini doğrulayın.Eğer içermiyorsa doğru url yi yazdırın.
        String actualYoutubeUrl= driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";

        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("Youtube url testi PASS");
        }else {
            System.out.println("Youtube url testi FAİLED\nactual url :"+actualYoutubeUrl);
        }

        //4. Daha sonra amazon sayfasına gidin
        driver.navigate().to("https://www.amazon.com");

        //5. Youtube ye geri dönün
        driver.navigate().back();

        //6. Sayfayı yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasına dönün.
        driver.navigate().forward();

        //8. Sayfayı tamsayfa yapın
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğğini doğrulayın.Yoksa doğru başlığı yazdırın
        String actualAmazonTitle=driver.getTitle();
        String amazonArananKelime="Amazon";
        if (actualAmazonTitle.contains(amazonArananKelime)){
            System.out.println("Amazon title testi PASS");
        }else {
            System.out.println("Amazon title testi FAİLED\nactual title : " + actualAmazonTitle);
        }

        //10. Sayfa url sinin https://www.amazon.com/ olup olmadığını doğrulayın. Değilse doğru url yi yazdırın
        String expectedAmazonUrl=driver.getCurrentUrl();
        String amazonArananUrl="https://www.amazon.com/";
        if (expectedAmazonUrl.equals(amazonArananUrl)){
            System.out.println("Amazon Url Testi PASS");
        }else {
            System.out.println("Amazon Url Testi FAİLED\nActula Amazon Url : " + expectedAmazonUrl);
        }

        //11. Sayfayı kapatın
        driver.close();
    }
}
