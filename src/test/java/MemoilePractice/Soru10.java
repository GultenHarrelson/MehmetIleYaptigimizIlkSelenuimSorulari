package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Soru10 {
    public static void main(String[] args) throws InterruptedException {

        /*1- bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        11-Sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
       // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String  expectedContent="Spend less";
        String actualContent=driver.getTitle();
        Thread.sleep(3000);
        if(actualContent.contains(expectedContent)){
            System.out.println("Spend less testi PASSED");
        }else {
            System.out.println("Spend less testi FAILED");
        }
       // 6- Gift Cards sekmesine basin
        WebElement giftCards= driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftCards.click();
        Thread.sleep(3000);
        //7- Birthday butonuna basin
        WebElement birthdayButonu=driver.findElement(By.xpath("//*[text()='Birthday']"));
        birthdayButonu.click();
       // 8- Best Seller bolumunden ilk urunu tiklayin

        List<WebElement> bestSeller=driver.findElements(By.xpath("//img[@alt='Amazon.com eGift Card']"));
        bestSeller.get(0).click();
        //9- Gift card details’den 25 $’i secin
        WebElement cardDetails=driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        cardDetails.click();

        // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunucreti=driver.findElement(By.xpath("(//*[text()='$25.00'])[1]"));
        String expectedUcret="$25.00";
        String actualUcret=urunucreti.getText();
        if(actualUcret.equals(expectedUcret)){
            System.out.println("Urun ucret testi PASSED");
        }else {
            System.out.println("Urun ucret testi FAILED");

        }
        driver.close();











    }
}
