package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06 extends BaseStaticDriver {
    /*
        Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
     */
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html ");
        WebElement FakeAlert= driver.findElement(By.id("fakealerttest"));
        FakeAlert.click();

        Bekle(1);

        WebElement showModel=driver.findElement(By.className("styled-click-button"));
        showModel.click();

        Bekle(1);

        WebElement okclick=driver.findElement(By.id("dialog-ok"));
        okclick.click();

        try {
            okclick.click();
            System.out.println("test failed");

        }catch (Exception e){
            System.out.println("test passed");
        }

        BekleKapat();
    }
}
