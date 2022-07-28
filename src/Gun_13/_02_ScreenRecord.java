package Gun_13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _02_ScreenRecord extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin1231");

        WebElement submitbutton = driver.findElement(By.id("btnLogin"));
        submitbutton.click();

//        driver.findElement(By.id("welcome")).click();

        List<WebElement> spanMessage = driver.findElements(By.id("spanMessage"));
        if (spanMessage.size() > 0) { // login olamadın ekran görüntüsünü saklayalım
            //Hata ekranının ScreenShotı alınması

            System.out.println("Login olamadı. Hata mesajı gözüktü.");

            //ekran görüntüsü alalım.

            LocalDateTime dt=LocalDateTime.now();

            TakesScreenshot ts = (TakesScreenshot) driver;//1. aşama ekran görüntüsü alma değişkenini tanımladım.
            File hafizadakihali = ts.getScreenshotAs(OutputType.FILE); //2. aşama saklama tipi seçildi (dosya) şuan hafızada bekliyor                ,data(veritabanı) (byte)
            //Hafızadakihali -> dosya olarak (jpg,png,bmg) kaydedeceğiz.
            FileUtils.copyFile(hafizadakihali, new File("ekrangoruntuleri/LoginKontrol"+String.valueOf(dt)+".png"));
            //hafızadaki ekrandosyasi nı al bunu verdiğim yola ve isme kaydet
            //jpg,bmp,gif...
            //sistemden tarihi okuyabiliyoruz
            //yıl
            //todo : ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin.
            //mesela 20220728192058.jpg gibi*/

            BekleKapat();
        }
    }
}
