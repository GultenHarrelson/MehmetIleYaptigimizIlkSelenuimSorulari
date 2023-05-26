package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Soru6 {
    public static void main(String[] args) throws InterruptedException {
      /*  Automation Exercise Category Testi
        1- Bir test class’i olusturun ilgili ayarlari yapin




        6- Sayfayi kapatin

       */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 2- https://www.automationexercise.com/ adresine gidin
        driver.get(" https://www.automationexercise.com/");
       // 3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementler=driver.findElements(By.className("panel-title"));
       // 4- Category bolumunde 3 element oldugunu test edin
        int expectedElement=3;
        int  actualElement=categoryElementler.size();
        if(expectedElement==actualElement){
            System.out.println("Element testi PASSED");
        }else {
            System.out.println("Element testi FAILED");
        }
       // 5- Category isimlerini yazdirin
        for (WebElement eachElement:categoryElementler
             ) {
            System.out.println(eachElement.getText());

        }
        Thread.sleep(3000);
        driver.close();



    }
}
