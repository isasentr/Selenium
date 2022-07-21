package Gun_08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme2 = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickme2.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().sendKeys(" isa");
        Bekle(2);

        driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi ve tamam  butonuna basıldı.
        Bekle(2); // Kapatıldığında sayfaya dönmüş oluyorsun.

        WebElement txtactual= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtactual.getText().contains("isa"));

        BekleKapat();

    }
}
