package Odevler.Gun_14_29Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class proje3_4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com");

//SCENARIO 4:
        driver.findElement(By.cssSelector("[onclick=\"return EJProductClick('1595015')\"]")).click(); //-Click on 'Add to Cart' for 'Demo eBook'

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"))));//wait
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));//frame içine adım atma

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("button[class='Payment-Button CC']")).click();//-Click on 'Pay using Debit Card'

        Bekle(2); //adımı görmek için

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ali@gmail.com");//--Fill the Billing Details Form (use fake data)
        Bekle(1); //adımı görmek için
        driver.findElement(By.cssSelector("input[placeholder='Confirm Email']")).sendKeys("ali@gmail.com");//--Fill the Billing Details Form (use fake data)
        Bekle(1); //adımı görmek için

        driver.findElement(By.cssSelector("input[placeholder='Name On Card']")).sendKeys("ali");//--Fill the Billing Details Form (use fake data)
        Bekle(1); //adımı görmek için

        driver.findElement(By.cssSelector("p[class='Billing-Phone Inline']>:nth-child(2)")).sendKeys("987456123");//--Fill the Billing Details Form (use fake data)
        Bekle(1); //adımı görmek için

        driver.findElement(By.cssSelector("p[class='Billing-Company']>:nth-child(2)")).sendKeys("ali@gmail.com");//--Fill the Billing Details Form (use fake data)
        Bekle(1); //adımı görmek için

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div[class='__PrivateStripeElement']"))));//wait
        driver.switchTo().frame(2);//frame içine adım atma

        driver.findElement(By.cssSelector("input[name='cardnumber']")).sendKeys("1111 1111 1111 1111");//-Enter Card number as "4242 4242 4242 4242"
        driver.switchTo().parentFrame(); // geldiği yere geri dön(1 basamak geri git)

        Assert.assertTrue(driver.getPageSource().contains("Kart numaranız geçersiz.")); //-Validate cart item no is '1'
        BekleKapat();

    }
}
