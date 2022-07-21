package Gun_08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");


        WebElement element = driver.findElement(By.cssSelector("div[class='auto-complete__value-container css-1hwfws3']>:nth-child(2)"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar
                .moveToElement(element) // kutucuğa gittim
                .click() // içine tıklattım
                .keyDown(Keys.SHIFT) //Shift tusuna bastım
                .sendKeys("a") // kucuk a harfini gönderdim,fakat Shift basılı olduğu için a görülmedi
                .keyUp(Keys.SHIFT)//Shift tuşundan elimizi kaldırıyoruz
                .sendKeys("hmet")//kalanı küçük harf
                .build();

        System.out.println(driver.findElement(By.cssSelector("div[class='auto-complete__value-container css-1hwfws3']>:nth-child(2)")).getText());
        Bekle(2);

        aksiyon.perform();

        Bekle(2);

        BekleKapat();
    }
}
