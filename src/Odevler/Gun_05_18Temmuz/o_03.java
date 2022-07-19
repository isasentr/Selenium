package Odev;

import Utils_.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class o_03 extends BaseStaticDriver {
    /*
1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve  Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 296 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        Bekle(1);
        WebElement iptal = driver.findElement(By.cssSelector("div[class='col-xs-11 rfloat marT15']>:nth-child(1)"));
        iptal.click();

        Bekle(2);

        WebElement yazdir = driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper']>input[type='text']"));
        yazdir.sendKeys("teddy bear");

        Bekle(2);

        WebElement Search1= driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper']>button"));
        Search1.click();

        Bekle(2);

        WebElement esitmi= driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div[class='search-result-txt-section  marT12']>:nth-child(1)"));
        System.out.println(esitmi.getText());

        if (esitmi.getText().contains("We've got 296 results for 'teddy bear'"))
            System.out.println("Test Passed");
        else
            System.out.println("Test failed");

        BekleKapat();
    }
}
