package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru5 {
    public static void main(String[] args) {

        /*Amazon Arama Testi
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.amazon.com adresine gidin
        3- amazon arama kutusunu locate edin
        4- arama kutusuna “Nutella” yazdirin
        5- arama islemini yapabilmek icin ENTER tusuna basin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com adresine gidin
        driver.get(" https://www.amazon.com");
       // 3- amazon arama kutusunu locate edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        driver.close();





    }
}
