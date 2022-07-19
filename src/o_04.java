package Odev;

import Utils_.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class o_04 extends BaseStaticDriver {
    /*
        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Calculate'e tıklayınız.
        İlk input'a herhangi bir sayı giriniz.
        İkinci input'a herhangi bir sayı giriniz.
        Calculate button'una tıklayınız.
        Sonucu alınız.
        Sonucu yazdırınız.
     */
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Bekle(1);
        WebElement Calculate = driver.findElement(By.cssSelector("a[href*=calculate]"));
        Calculate.click();
        Bekle(1);
        WebElement number1 = driver.findElement(By.cssSelector("form[action*=calculate]>input"));
        number1.sendKeys("5");
        Bekle(1);
        WebElement type = driver.findElement(By.cssSelector("form[action*=calculate]>select"));
        type.sendKeys("times");
        Bekle(1);
        WebElement number2 = driver.findElement(By.cssSelector("select[id='function']+input"));
        number2.sendKeys("10");
        Bekle(1);
        WebElement calculate1 = driver.findElement(By.cssSelector("input[type='text']+input"));
        calculate1.click();
        Bekle(1);
        for (int i = 3; i >-1 ; i--) {
            System.out.println("Hesaplanıyor..."+i);
            Bekle(1);
        }
        System.out.println("Hesaplandı");

        WebElement sonuc= driver.findElement(By.cssSelector("form[action*='calculate']+span"));
        System.out.println("işlem sonucu ="+sonuc.getText());


        BekleKapat();
    }
}
