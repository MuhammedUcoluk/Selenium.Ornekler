package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more. sayfanın title ı

        System.out.println(driver.getCurrentUrl()); //https://www.amazon.com/ sayfanın urlsi

        System.out.println(driver.getWindowHandle());// Her açılan sayfa için verilen değer CDwindow-DEC1D9C5DC1528DD50CA7BA3B98A741A

        System.out.println(driver.getPageSource()); //
    }
}
