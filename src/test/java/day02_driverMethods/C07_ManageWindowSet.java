package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Amazon sayfasına gidelim.
        driver.get("https://www.amazon.com/");

        //3. Sayfanın konum ve boyutlarını yazdıralım.
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfanın konum ve boyutunu istediğimiz şekilde ayarlayalım.
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(300,500));

        //5. Sayfanın sizin istediğiniz konum ve boyuta geldiğini test edelim.
        int xKoordinatı=driver.manage().window().getPosition().getX();
        int yKoordinatı=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yükseklik=driver.manage().window().getSize().getHeight();

        if (xKoordinatı==0&& yKoordinatı==0&&genislik==300&&yükseklik==500){
            System.out.println("Ölçeklendirme testi PASS");
        }else {
            System.out.println("Ölçeklendirme testi FAİLED");
        }
        //6. Sayfayı kapatalım.
        driver.close();
    }
}
