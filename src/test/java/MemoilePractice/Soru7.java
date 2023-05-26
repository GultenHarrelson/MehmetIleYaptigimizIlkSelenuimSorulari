package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Soru7 {
    public static void main(String[] args) throws InterruptedException {
       /* Automation Exercise Link Testi
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Sayfada 147 adet link bulundugunu test edin.
        4- Products linkine tiklayin
        5- special offer yazisinin gorundugunu test edin
        6- Sayfayi kapatin

        */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //  3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        int expectedResult=147;
        int actualResult=linkList.size();
        if(expectedResult==actualResult){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(3000);
        //4- Products linkine tiklayin
        WebElement products= driver.findElement(By.xpath("//a[@ href=\"/products\"]"));
        Thread.sleep(2000);
        products.click();
        //5- special offer yazisinin gorundugunu test edin
     WebElement specialOffer=driver.findElement(By.xpath("//*[@id='sale_image']"));
     if(specialOffer.isDisplayed()){
         System.out.println("Special Offer yazisi test PASSED");
     }else {
         System.out.println("Special Offer yazisi test FAILED");

     }

       driver.close();

        }











    }

