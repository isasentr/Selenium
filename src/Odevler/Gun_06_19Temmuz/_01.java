package Odevler.Gun_06_19Temmuz;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01 extends BaseStaticDriver {
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
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");
        Bekle(1);

        WebElement Name = driver.findElement(By.xpath("//*[@type='text']"));
        Name.sendKeys("Automation");
        Bekle(1);

        WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        Bekle(1);

        WebElement current = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        current.sendKeys("Testing Current Address");
        Bekle(1);

        WebElement permanent = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']//following::textarea"));
        permanent.sendKeys("Testing Permanent Address");
        Bekle(1);

        WebElement buttonok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        buttonok.click();
        Bekle(1);

        WebElement checkname = driver.findElement(By.xpath("(//p[@class='mb-1'])[1]"));
        Assert.assertTrue(checkname.getText().contains("Automation"));

        WebElement checkemail = driver.findElement(By.xpath("(//p[@class='mb-1'])[2]"));
        Assert.assertTrue(checkemail.getText().contains("Testing"));

        BekleKapat();
    }
}
