package Odevler.Gun_07_20Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01 extends BaseStaticDriver {
    /*
     Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
          buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
      */
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions aksiyonlar = new Actions(driver);
        List<WebElement> listcountry = driver.findElements(By.cssSelector("div[id='questionDiv']>div[class='destinationBox']"));
        List<WebElement> listcity = driver.findElements(By.cssSelector("div[id='answerDiv']>div[class='dragDropSmallBox']"));

        for (WebElement a : listcity) {
            for (WebElement b : listcountry) {

              Action aksiyon=  aksiyonlar.clickAndHold(a).moveToElement(b).release(b).build();
              aksiyon.perform();
                Bekle(1);
           //     System.out.println(a.getCssValue("background-color"));
                if (a.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                    break;
                }
            }
        }
        BekleKapat();
    }
}
