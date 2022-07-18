package Gun_04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SendText extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Bekle(2);

        WebElement element = driver.findElement(By.partialLinkText("thanks"));
        element.click();

        Bekle(2);

        WebElement txtBox = driver.findElement(By.id("user-message"));
        txtBox.sendKeys("merhaba selenium");

        Bekle(2);

        WebElement btn = driver.findElement(By.className("btn-default"));
        btn.click();

        Bekle(2);

        WebElement msg = driver.findElement(By.id("display"));

        Bekle(2);

        if (msg.getText().contains("merhaba selenium"))
            System.out.println("test passsed");
        else
            System.out.println("test failed");

        BekleKapat();
    }
}
