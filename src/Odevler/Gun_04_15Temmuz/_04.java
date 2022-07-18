package Odevler.Gun_04_15Temmuz;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04 extends BaseStaticDriver {
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

        WebElement elcalculate= driver.findElement(By.id("calculate"));
        elcalculate.click();

        Bekle(1);

        WebElement elnumber1=driver.findElement(By.id("number1"));
        elnumber1.sendKeys("2019");

        Bekle(1);

        WebElement function=driver.findElement(By.id("function"));
        function.sendKeys("minus");

        Bekle(1);

        WebElement elnumber2=driver.findElement(By.id("number2"));
        elnumber2.sendKeys("3");

        Bekle(1);

        WebElement elcalculate1=driver.findElement(By.id("calculate"));
        elcalculate1.click();

        Bekle(1);

        WebElement answer=driver.findElement(By.id("answer"));

        System.out.println("sonuc :" +answer.getText());

        BekleKapat();
    }
}
