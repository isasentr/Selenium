package Gun_13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la

 */

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");

        //todo frame in varlığı konrol edilip var ise veya yok ise her iki duruma göre çözüm yapılacak.
//        List<WebElement> list = driver.findElements()


//        driver.switchTo().frame(8); // "gdpr -consent -notice"
//        WebElement acceptAll=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
////        WebElement acceptAll= driver.findElement(By.xpath("//span[text()='Accept All']"));
//
//        acceptAll.click();
//        driver.switchTo().defaultContent();

        Robot rbt = new Robot();

        for (int i = 0; i < 13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); //tusa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); //tusa bırakıldı up
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER); //tusa basıldı down
        rbt.keyRelease(KeyEvent.VK_ENTER); //tusa bırakıldı up
        Bekle(1);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\İSA_ŞEN__İSN\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Verilen stringi clipboard a set ediyor.

        rbt.keyPress(KeyEvent.VK_CONTROL); //tusa bırakıldı up
        rbt.keyPress(KeyEvent.VK_V); //tusa bırakıldı up   CTRL+V // bu iki tuşa şua nada basılmış vaziyette hafızadaki yapıştırıldı.

        Bekle(1);

        rbt.keyRelease(KeyEvent.VK_CONTROL); //tusa bırakıldı up tuşlar serbest bırakıldı.
        rbt.keyRelease(KeyEvent.VK_V); //tusa bırakıldı up   CTRL+V


        rbt.keyPress(KeyEvent.VK_ENTER); //tusa basıldı down
        rbt.keyRelease(KeyEvent.VK_ENTER); //tusa bırakıldı up

        //or

//        for (int i = 0; i < 2; i++) {// 2 kere tab ile open butonuna ulaştık
//            rbt.keyPress(KeyEvent.VK_TAB); //tusa basıldı down
//            rbt.keyRelease(KeyEvent.VK_TAB); //tusa bırakıldı up
//            Bekle(1);
//        }

        WebElement submitbutton = driver.findElement(By.id("submitbutton")); //submit butonuna bastık
        submitbutton.click();
        Bekle(1);

//        Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded."));

        WebElement verify = driver.findElement(By.xpath("//h3[@id='res']"));
        Assert.assertTrue(verify.getText().contains("has been successfully uploaded."));

        BekleKapat();

    }
}
