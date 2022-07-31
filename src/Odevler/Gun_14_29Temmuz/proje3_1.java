package Odevler.Gun_14_29Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class proje3_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://shopdemo.e-junkie.com");

//SCENARIO 1:
        driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]")).click(); //-Click on 'Add to Cart' for 'Demo eBook'

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"))));//wait
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));//frame içine adım atma
        Assert.assertEquals("1", driver.findElement(By.cssSelector("input[class='Product-Quantity-Value readOnly']")).getAttribute("value")); //-Validate cart item no is '1'

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("button[class='Product-Remove']")).click(); //-Click on 'Remove' button to remove item from your cart
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button[class='Continue-Button Close-Cart']"))));//wait
        driver.findElement(By.cssSelector("button[class='Continue-Button Close-Cart']")).click();//-Click on 'Continue Shopping'
        driver.switchTo().defaultContent();

        Bekle(2); //adımı görmek için

        Assert.assertEquals("0", driver.findElement(By.xpath("(//span[@id='cart_item_nos'])[1]")).getText());//-Validate cart item no is '0'

        BekleKapat();
    }
}