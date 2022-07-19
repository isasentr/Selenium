package Gun_06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEbay extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");

        WebElement menu = driver.findElement(By.id("gh-cat"));
        Select ddmenu = new Select(menu);

        ddmenu.selectByValue("20081");

        Bekle(1);

        WebElement srcbutton = driver.findElement(By.id("gh-btn"));
        srcbutton.click();

        Bekle(2);

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("ebay"));

        Bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        Bekle(2);

        BekleKapat();
    }
}
