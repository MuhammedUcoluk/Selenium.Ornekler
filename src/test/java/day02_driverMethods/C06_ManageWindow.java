package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //3. Sayfanın konumunu ve boyutlarını yazdıralım
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayı simge durumuna getirelim
        driver.manage().window().minimize();

        //5. Simge durumunda 3 sn bekleyip sayfayı maximize yapalım
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanın konumunu ve boyutlarını max durumunda yazdıarılm.
        System.out.println("Maximize durumunda pozisyon :"+driver.manage().window().getPosition());
        System.out.println("Maximize durumunda size :" +driver.manage().window().getSize());

        //7. Sayfayı fullscreen yapalım
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //8. Sayfanın konumunu ve boyutlarını fullscreen durumunda yadıralım
        System.out.println("Fullscreen durumunda pozisyon :"+driver.manage().window().getPosition());
        System.out.println("Fullscreen durumunda size :" +driver.manage().window().getSize());
        Thread.sleep(3000); // görelim diye zamanladık

        //9. Sayfayı kapatalım
        driver.close();

    }
}
