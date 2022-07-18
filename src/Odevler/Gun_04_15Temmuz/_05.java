package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05 extends BaseStaticDriver {
    /*
        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Fake Alerts' tıklayınız.
        Show Alert Box'a tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
     */
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Bekle(1);

        WebElement elfakealerttest = driver.findElement(By.id("fakealerttest"));
        elfakealerttest.click();

        Bekle(1);

        WebElement elfakealert = driver.findElement(By.id("fakealert"));
        elfakealert.click();

        Bekle(1);

        WebElement elok = driver.findElement(By.className("dialog-button"));
        elok.click();

        try {
            elok.click();
            System.out.println("test failed");
        } catch (Exception e) {
            System.out.println("test passed");
        }

        BekleKapat();


    }
}
