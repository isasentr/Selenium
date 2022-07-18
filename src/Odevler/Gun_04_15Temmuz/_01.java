package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
    1) Bu siteye gidin. ->  http://demoqa.com/text-box
    2) Full Name kısmına "Automation" girin.
    3) Email kısmına "Testing@gmail.com" girin.
    4) Current Address kısmına "Testing Current Address" girin.
    5) Permanent Address kısmına "Testing Permanent Address" girin.
    6) Submit butonuna tıklayınız.
    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
         */

        driver.get("http://demoqa.com/text-box");

        WebElement elname = driver.findElement(By.id("userName"));
        elname.sendKeys("Automation");

        Bekle(1);

        WebElement elemail = driver.findElement(By.id("userEmail"));
        elemail.sendKeys("Testing@gmail.com");

        Bekle(1);

        WebElement eladres = driver.findElement(By.id("currentAddress"));
        eladres.sendKeys("Testing Current Address");

        Bekle(1);

        WebElement elperadres = driver.findElement(By.id("permanentAddress"));
        elperadres.sendKeys("Testing Permanent Address");

        Bekle(1);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Bekle(1);

        WebElement namecont=driver.findElement(By.id("name"));

        if (namecont.getText().contains("Automation"))
            System.out.println("name test passsed");
        else
            System.out.println("name test failed");

        WebElement Emailcont=driver.findElement(By.id("email"));

        if (Emailcont.getText().contains("Testing"))
            System.out.println("email test passsed");
        else
            System.out.println("email test failed");

        BekleKapat();
    }
}
