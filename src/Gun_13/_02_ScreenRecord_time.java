package Gun_13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class _02_ScreenRecord_time extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin1231");

        WebElement submitbutton = driver.findElement(By.id("btnLogin"));
        submitbutton.click();

        Calendar da=Calendar.getInstance();
        Date time=da.getTime();
        System.out.println(time);

        String instancetime=time.toString().replace(":","_");
        Bekle(1);

        List<WebElement> spanMessage = driver.findElements(By.id("spanMessage"));
        if (spanMessage.size() > 0) { // login olamadın ekran görüntüsünü saklayalım

            System.out.println("Login olamadı. Hata mesajı gözüktü.");
        }
            TakesScreenshot ts = (TakesScreenshot) driver;//1. aşama ekran görüntüsü alma değişkenini tanımladım.
            File hafizadakihali = ts.getScreenshotAs(OutputType.FILE); //2. aşama saklama tipi seçildi (dosya) şuan hafızada bekliyor                ,data(veritabanı) (byte)

            FileUtils.copyFile(hafizadakihali, new File("ekrangoruntuleri/LoginKontrol/"+instancetime+".jpeg"));  //String.valueOf(dt))

            BekleKapat();
        }
    }
