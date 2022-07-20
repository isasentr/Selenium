package Odevler.Gun_06_19Temmuz;

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

        WebElement calculate = driver.findElement(By.xpath("//a[@href='/calculate.php']"));
        calculate.click();
        Bekle(1);
        WebElement number1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        number1.sendKeys("10");
        Bekle(1);
        WebElement select = driver.findElement(By.xpath("(//select[@name='function'])"));
        select.sendKeys("minus");
        Bekle(1);
        WebElement number2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        number2.sendKeys("3");
        Bekle(1);
        WebElement click = driver.findElement(By.xpath("(//input[@value='Calculate'])"));
        click.click();
        Bekle(1);

        WebElement check = driver.findElement(By.xpath("(//span)"));
        System.out.println("Answer = " + check.getText());

        BekleKapat();
    }
}
