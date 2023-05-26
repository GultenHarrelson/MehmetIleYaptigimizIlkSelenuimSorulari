package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru1 {
    public static void main(String[] args) {

         /* 1. Yeni bir package olusturalim : day01
2. Yeni bir class olusturalim : C03_GetMethods
3. Amazon sayfasina gidelim. https://www.amazon.com/
            4. Sayfa basligini(title) yazdirin




9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
10. Sayfayi kapatin.

    */
   System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //3. Amazon sayfasina gidelim. https://www.amazon.com/
   driver.get("https://www.amazon.com/");
       // 4. Sayfa basligini(title) yazdirin
        System.out.println("title" +driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedResult="Amazon";
        String actualResult=driver.getTitle();
        if(actualResult.contains(expectedResult)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
        }

       // 6. Sayfa adresini(url) yazdirin
        System.out.println("page"+driver.getCurrentUrl());
       // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedurl="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedurl)) {
            System.out.println("Url test PASSED");

        }else {
            System.out.println("Url test FAILED");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        System.out.println("Page's handle value: " +driver.getWindowHandle());
       // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        //driver.getPageSource()
        String expectedKelime="shopping";
        String actualKelime=driver.getPageSource();
        if(actualKelime.contains(expectedKelime)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");


        }
        driver.close();

    }


















}
