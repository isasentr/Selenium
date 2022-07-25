package Odevler.Gun_07_20Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03 extends BaseStaticDriver {
    /*
    Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
             buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
     */
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions aksiyonlar = new Actions(driver);
        List<WebElement> cities = driver.findElements(By.cssSelector("#allItems>li"));
        List<WebElement> country = driver.findElements(By.cssSelector("#dhtmlgoodies_mainContainer>div"));


        for (WebElement a : cities) {
            for (WebElement b : country) {
                aksiyonlar.clickAndHold(a).moveToElement(b).release(b).build().perform();
                Bekle(1);
//                System.out.println(cities.get(i).getCssValue("background-color"));
                if ((a.getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))) {
                    break;
                }
            }

        }
        BekleKapat();
    }
}
