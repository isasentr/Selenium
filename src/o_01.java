package Odev;

import Utils_.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class o_01 extends BaseStaticDriver {
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
        WebElement Name = driver.findElement(By.cssSelector("div[id='userName-wrapper']>div[class='col-md-9 col-sm-12']>:nth-child(1)"));
        Name.sendKeys("Automation");

        Bekle(1);
        WebElement Email = driver.findElement(By.cssSelector("div[id='userEmail-wrapper']>div[class='col-md-9 col-sm-12']>:nth-child(1)"));
        Email.sendKeys("Testing@gmail.com");

        Bekle(1);
        WebElement Current = driver.findElement(By.cssSelector("div[id='currentAddress-wrapper']>div[class='col-md-9 col-sm-12']>:nth-child(1)"));
        Current.sendKeys("Testing Current Address");

        Bekle(1);
        WebElement Permanent = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>div[class='col-md-9 col-sm-12']>:nth-child(1)"));
        Permanent.sendKeys("Testing Permanent Address");

        Bekle(1);
        WebElement Submit = driver.findElement(By.cssSelector("div[class='mt-2 justify-content-end row']>div[class='text-right col-md-2 col-sm-12']>:nth-child(1)"));
        Submit.click();

        Bekle(1);

        for (int i = 3; i >= 0; i--) {
            Bekle(1);
            System.out.println("Test Tamamlanıyor..."+i);
        }
        System.out.println("Test Tamamlandı");

        WebElement namecheck = driver.findElement(By.cssSelector("div[class='mt-4 row']>div[class='border col-md-12 col-sm-12']>:nth-child(1)"));
        if (namecheck.getText().contains("Automation"))
            System.out.println("Name Test passed ");
        else
            System.out.println("Name Test failed");

        WebElement emailcheck = driver.findElement(By.cssSelector("div[class='mt-4 row']>div[class='border col-md-12 col-sm-12']>:nth-child(2)"));
        if (emailcheck.getText().contains("Testing@gmail.com"))
            System.out.println("Email Test passed ");
        else
            System.out.println("Email Test failed");


        BekleKapat();
    }
}
