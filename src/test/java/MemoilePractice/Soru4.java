package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru4 {
    public static void main(String[] args) {
       /* 1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        doğru URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
                Yoksa doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        doğru URL'yi yazdırın
        11.Sayfayi kapatin

        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
       // doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedResult="youtube";
        String actualResult=driver.getTitle();
        if(expectedResult.equals(actualResult)){
            System.out.println("Sayfa basligi testi PASSED");
        }else {
            System.out.println("Sayfa basligi testi FAILED" +driver.getTitle());

        }
       // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
       // doğru URL'yi yazdırın.
        String expectedUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("Sayfa Url testi PASSED");
        }else {
            System.out.println("Sayfa Url testi FAILED"+driver.getCurrentUrl());

        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get(" https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //  9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //                Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedContent="Amazon";
        String actualContent=driver.getTitle();
        if(actualContent.contains(expectedContent)){
            System.out.println("Amazon title test PASSED");
        }else {
            System.out.println("Amazon title test FAILED"+driver.getTitle());

        }
       // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
       // doğru URL'yi yazdırın
         expectedUrl="https://www.amazon.com/";
        actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Sayfa Url testi PASSED");
        }else {
            System.out.println("Sayfa Url testi FAILED"+driver.getCurrentUrl());

        }
        driver.close();


    }
}
