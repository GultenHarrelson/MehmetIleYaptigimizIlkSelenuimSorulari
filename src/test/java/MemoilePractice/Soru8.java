package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Soru8 {
    public static void main(String[] args) {
       /* 1- https://www.amazon.com/ sayfasına gidin.
        2- Arama kutusuna “city bike” yazip aratin
        3- Görüntülenen sonuçların sayısını yazdırın
        4- Listeden ilk urunun resmine tıklayın.

        */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
      //  2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
       // 3- Görüntülenen sonuçların sayısını yazdırın
        WebElement goruntulenenSonucElement=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(goruntulenenSonucElement.getText());
       // 4- Listeden ilk urunun resmine tıklayın.
       List<WebElement> ilkUrunList= driver.findElements(By.xpath("(//*[@class='s-image'])[1]"));
        ilkUrunList.get(0).click();







        }




    }
