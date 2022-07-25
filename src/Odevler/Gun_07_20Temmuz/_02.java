package Odevler.Gun_07_20Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/*
Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
 */
public class _02 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions aksiyonlar = new Actions(driver);
        List<WebElement> students = driver.findElements(By.cssSelector("#allItems>li"));
        List<WebElement> team = driver.findElements(By.cssSelector("#dhtmlgoodies_mainContainer>div"));

        int student = 0;

        for (int i = 0; i <students.size() ; i++) {
            for (int j = student; j <team.size() ; j++) {
                aksiyonlar.clickAndHold(students.get(i)).moveToElement(team.get(j)).release(team.get(j)).build().perform();
                Bekle(1);
                if (team.get(j).getText().contains(students.get(i).getText())){
                    break;
                }else{
                    student++;}
            }
        }
        BekleKapat();
    }
}
