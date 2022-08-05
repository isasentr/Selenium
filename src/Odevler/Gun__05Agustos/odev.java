package Odevler.Gun__05Agustos;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class odev extends BaseStaticDriver {
    public static void main(String[] args) {
        System.out.println(" Test Başladı. ");
        driver.get("http://demowebshop.tricentis.com");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup17@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
        Assert.assertEquals("Log out", driver.findElement(By.linkText("Log out")).getText());
        driver.findElement(By.linkText("Log out")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup177@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='validation-summary-errors']>span")).getText().contains("unsuccessful"));
        driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("grup17@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
        driver.findElement(By.linkText("14.1-inch Laptop")).click();
        driver.findElement(By.cssSelector("[id^='add-to-cart-button']")).click();
        driver.findElement(By.cssSelector("[class='ico-cart']")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.id("PickUpInStore")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='Shipping.save()']")));
        driver.findElement(By.cssSelector("input[onclick='Shipping.save()']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='PaymentMethod.save()")));
        driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='PaymentInfo.save()")));
        driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[onclick='ConfirmOrder.save()")));
        driver.findElement(By.cssSelector("input[onclick='ConfirmOrder.save()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='title']")));
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='title']")).getText().contains("successfully"));
        BekleKapat();
        for (int i = 3; i > -1; i--) {
            Bekle(1);
            System.out.println("Kapanıyor..." + i);
        }
        Bekle(1);
        System.out.println(" Test Bitti ");
    }
}
