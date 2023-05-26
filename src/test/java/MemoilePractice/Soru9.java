package MemoilePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru9 {
    public static void main(String[] args) throws InterruptedException {


        /*1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       // 2- Add Element butonuna basin
        WebElement addElement=driver.findElement(By.xpath("//*[text()='Add Element']"));
        addElement.click();
        Thread.sleep(3000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("Delete Butonu test PASSED");
        }else {
            System.out.println("Delete Butonu test FAILED");
        }
        Thread.sleep(3000);
        //  4- Delete tusuna basin
        WebElement delete=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        delete.click();

       // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements=driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if(addRemoveElements.isDisplayed()){
            System.out.println("AddRemove Test PASSED");
        }else {
            System.out.println("AddRemove Test FAILED");

        }

        driver.close();



    }
}
