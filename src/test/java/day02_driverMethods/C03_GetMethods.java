package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    //1. yeni bir package oluşturalım
    //2. yeni bir class oluşturalım C01_GetMethods

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //3. Amazon sayfasına gidelim
        driver.get("https://www.amazon.com/");

        //4. sayfa başlığını(title) yazdırın
        System.out.println(driver.getTitle());

        //5. sayfa başlığının Amazon içerdiğini test edin.
        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASS");
        }else{
            System.out.println("Title testi FAİLED");
            System.out.println("Sayfanın title i : " + actualTitle);
        }

        //6. sayfa adresini(url) yazdırın.
        System.out.println(driver.getCurrentUrl());

        //7. sayfa url sinin amazon içerdiğini test edin.
        String actualUrl= driver.getCurrentUrl();
        String arananUrl="amazon";
        if (actualUrl.contains(arananUrl)){
            System.out.println("Url Testi PASS");
        }else{
            System.out.println("Url Testi FAİLED");
            System.out.println("Actual Url si :" + actualUrl);
        }

        //8. sayfa handle değerini yazdırın.
        System.out.println(driver.getWindowHandle());

        //9. sayfa html kodlarında alışveriş kelimesi geçtiğini test edin.
        String actualPageSource= driver.getPageSource();
        String arananKelime1="alışveriş";
        if (actualPageSource.contains(arananKelime1)){
            System.out.println("page source testi PASS ");
        }else{
            System.out.println("page source testi FAİLED");
        }

        //10. sayfayı kapatın.
        driver.close();
    }
}
