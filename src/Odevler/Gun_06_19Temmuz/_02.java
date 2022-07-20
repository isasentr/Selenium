package Odevler.Gun_06_19Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02 extends BaseStaticDriver {
    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/
        2) Username kısmına "ttechno@gmail.com" girin.
        3) Password kısmına "techno123." girin.
        4) "Sign in" buttonunan tıklayınız.
        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
     */
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        Bekle(1);
        WebElement Username= driver.findElement(By.xpath("(//*[@placeholder])[1]"));
        Username.sendKeys("ttechno@gmail.com");

        Bekle(1);
        WebElement Password= driver.findElement(By.xpath("//*[contains(@type,'password')]"));
        Password.sendKeys("techno123.");

        Bekle(1);
        WebElement button= driver.findElement(By.xpath("//*[contains(@href,'app.html')]"));
        button.click();

        Bekle(1);

        WebElement check= driver.findElement(By.xpath("//*[contains(@style,'text-align')]"));
        Bekle(1);
        Assert.assertTrue(check.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();



    }
}
