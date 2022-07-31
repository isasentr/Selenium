package Odevler.Gun_14_29Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class proje3_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com");

//SCENARIO 2:
        driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]")).click(); //-Click on 'Add to Cart' for 'Demo eBook'

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"))));//wait
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));//frame içine adım atma
        driver.findElement(By.cssSelector("button[class='Apply-Button Show-Promo-Code-Button']")).click();//-Click on
        driver.findElement(By.cssSelector("input[class='Promo-Code-Value']")).sendKeys("123456789");//enter "123456789"

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("button[class='Promo-Apply']")).click();//'Apply'


        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid promo code']")).getText().contains("Invalid promo code")); //-Validate cart item no is '1'
        driver.switchTo().defaultContent();
        BekleKapat();
    }
}
