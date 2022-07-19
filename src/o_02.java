package Odev;

import Utils_.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class o_02 extends BaseStaticDriver {
    /*
1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
     */
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        Bekle(1);

        WebElement Username = driver.findElement(By.cssSelector("div[class='form-group']>[placeholder='Enter your username']"));
        Username.sendKeys("ttechno@gmail.com");

        Bekle(1);

        WebElement Password = driver.findElement(By.cssSelector("div[class='form-group']>[placeholder='Enter your password']"));
        Password.sendKeys("techno123.");

        Bekle(1);

        WebElement Signin = driver.findElement(By.cssSelector("div[class='buttons-w']>[class='btn btn-primary']"));
        Signin.click();

        Bekle(1);


        for (int i = 3; i >= 0; i--) {
            Bekle(1);
            System.out.println("Test Tamamlanıyor..."+i);
        }
        System.out.println("Test Tamamlandı");

        WebElement checktime = driver.findElement(By.cssSelector("h6[style='text-align: center;font-size: x-large;color:red']"));
        if (checktime.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
