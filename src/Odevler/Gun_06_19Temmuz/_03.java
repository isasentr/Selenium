package Odevler.Gun_06_19Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03 extends BaseStaticDriver {
    /*
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve  Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

     */
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        Bekle(1);
        WebElement notnow= driver.findElement(By.xpath("//*[@class='btn col-xs-8 btn-line-skyblue push-deny']"));
        notnow.click();

        Bekle(1);
        WebElement write= driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
        write.sendKeys("teddy bear");

        Bekle(3);
        WebElement search= driver.findElement(By.xpath("//button[contains(@onclick,'submitSearch')]"));
        search.click();

        WebElement check= driver.findElement(By.xpath("(//span[contains(@style,'color: #212121')])[1]"));

        Assert.assertTrue(check.getText().contains("We've got 294 results for 'teddy bear'"));

        BekleKapat();
    }
}
