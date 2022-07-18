package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
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

        WebElement elpushDenied=driver.findElement(By.id("pushDenied"));
        elpushDenied.click();

        Bekle(1);

        WebElement elara= driver.findElement(By.id("inputValEnter"));
        elara.sendKeys("teddy bear");

        Bekle(1);

        WebElement elbul= driver.findElement(By.className("sd-icon-search-under-catagory"));
        elbul.click();

        Bekle(1);

        WebElement elsonuc= driver.findElement(By.className("nnn"));

        if (elsonuc.getText().contains("We've got 295 results for 'teddy bear'"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();
    }
}
