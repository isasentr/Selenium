package Gun_07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Senaryo extends BaseStaticDriver {
    /*
1- https://www.facebook.com/  sayfasına gidiniz
2- CreateNewAccount a tıklatınız.
3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
4- Email i tekrar girmenizi isteyen bir input daha açıldığını
   öncesinde de görünmediğini assert ile doğrulayınız.
     */
    public static void main(String[] args) {

        driver.get("https://tr-tr.facebook.com/");

        WebElement yeniuye = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button'"));
        yeniuye.click();

        WebElement name = driver.findElement(By.cssSelector("input[name='firstname'"));
        name.sendKeys("isa");

        WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname'"));
        lastname.sendKeys("sen");

        WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__'"));

        WebElement reemail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__'"));
        Assert.assertFalse(reemail.isDisplayed());

        email.sendKeys("abcnadir@gmail.com");
        Assert.assertTrue(reemail.isDisplayed());

        reemail.sendKeys("abcnadir@gmail.com");

        BekleKapat();
    }
}
