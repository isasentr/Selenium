package Odevler.Gun_14_29Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class proje3_3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com");

//SCENARIO 3:
        driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]")).click(); //-Click on 'Add to Cart' for 'Demo eBook'

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"))));//wait
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));//frame içine adım atma

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("button[class='Payment-Button CC']")).click();//-Click on 'Pay using Debit Card'

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("button[class='Pay-Button']")).click();//-Click on 'Pay' button without filling any information

        Bekle(2); //adımı görmek için
        driver.switchTo().defaultContent();

        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid Email']")).getText().contains("Invalid Email")); //-Validate cart item no is '1'
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid Email']")).getText().contains("Invalid Email")); //-Validate cart item no is '1'
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid Billing Name']")).getText().contains("Invalid Billing Name")); //-Validate cart item no is '1'
        driver.switchTo().defaultContent();
        BekleKapat();

    }
}
