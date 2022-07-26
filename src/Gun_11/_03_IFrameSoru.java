package Gun_11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {

    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
    public static void main(String[] args) {
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Japan");

        driver.switchTo().frame(0); // frame 1 in içinde frame 3 geçiş yaptık

        WebElement button= driver.findElement(By.cssSelector("b[style='color:green']~input"));
        button.click();


//       ----- Alternatif yöntem checkbox click için ama çalışmadı kontrol et------
//        Actions aksiyonlar=new Actions(driver);
//        Action aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build();
//        aksiyon.perform();
//
//        aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
//        aksiyon.perform();


        driver.switchTo().defaultContent(); // direk ana sayfaya geldik

//        driver.switchTo().parentFrame();   şu anda frame 1 geldik
//        driver.switchTo().parentFrame();şu anda ana sayfaya geldik

        driver.switchTo().frame(1);  //frame 2

        WebElement menu= driver.findElement(By.cssSelector("select[id='animals']"));
        Select ddmenu =new Select(menu);  // drop down menu
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1);

        BekleKapat();
    }
}

/*
//<body> // defaultContent
//
//    <ifram1 name="IFrame1">  0
//        <iframe  name="IFrame3"></irmae> 0
//    </irmae>
//
//    <ifram1  name="IFrame2"> 1
//    </irmae>
//
//</body>
 */



