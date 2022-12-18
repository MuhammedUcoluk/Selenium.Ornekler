package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement bayArealocate = driver.findElement(By.id("pid8_thumb"));
        WebElement bostonlocate = driver.findElement(By.id("pid6_thumb"));
        WebElement nyclocate = driver.findElement(By.id("pid3_thumb"));
        WebElement sailorlocate = driver.findElement(By.id("pid11_thumb"));

        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonlocate));

        System.out.println(berlin1.getAttribute("id"));


        WebElement berlin= driver.findElement(RelativeLocator.with(By.name("img")).above(sailorlocate).toLeftOf(bayArealocate));
        WebElement berlin2= driver.findElement(RelativeLocator.with(By.name("img")).toRightOf(bostonlocate).toLeftOf(bayArealocate));
        WebElement berlin3= driver.findElement(RelativeLocator.with(By.name("img")).below(nyclocate).above(sailorlocate));


    }
}