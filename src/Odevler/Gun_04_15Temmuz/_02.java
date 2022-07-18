package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
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

        WebElement elname = driver.findElement(By.id("username"));
        elname.sendKeys("ttechno@gmail.com");

        Bekle(1);

        WebElement elpassword = driver.findElement(By.id("password"));
        elpassword.sendKeys("techno123");

        Bekle(1);

        WebElement elsignIn = driver.findElement(By.className("btn-primary"));
        elsignIn.click();

        Bekle(1);

        WebElement elyazi = driver.findElement(By.id("time"));

       Bekle(1);

        if (elyazi.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();
    }
}
