package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru3 {
    public static void main(String[] args) {

       /* 1.Yeni bir class olusturalim (Homework)

        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
“actual” URL’i yazdirin.





        9.Browser’i kapatin

        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
              //  (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        driver.get("https://www.facebook.com");
        String expectedResult="facebook";
        String actualResult=driver.getTitle();
        if(expectedResult.equals(actualResult)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED"+driver.getTitle());


        }
        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
       // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedContent="Walmart.com";
        String actualContent=driver.getTitle();
        if(actualContent.contains(expectedContent)){
            System.out.println("Page title test PASSED");
        }else {
            System.out.println("Page title test FAILED");

        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
       // 7. Sayfayi yenileyin
        driver.navigate().refresh();
       // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();


    }
}
