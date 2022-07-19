package Gun_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Senaryo extends BaseStaticDriver {
/*
1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
2- Business i çekleyin.
3- discover XYZ ye tıklatın ve online Advertising i seçin
4- Every day i seçin
5- Good u seçin
6- using XYZ yi tıklatın ve 3.seçeneği seçin
 */

    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Bekle(2);

//        WebElement Business = driver.findElement(By.name("u_1fG_4586"));
//        Business.click();

        WebElement Business = driver.findElement(By.cssSelector("[id$='4586_0']"));
        Business.click();

        Bekle(2);

        WebElement Advertising = driver.findElement(By.cssSelector("[id$='4588']"));
        Advertising.click();

        Bekle(2);

        WebElement Advertising1 = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        Advertising1.click();

        Bekle(2);

        WebElement Everyday = driver.findElement(By.cssSelector("[id='u_1fG_89585_0']"));
        Everyday.click();

        Bekle(2);


        WebElement XYZ = driver.findElement(By.cssSelector("[id='u_1fG_4589_0']"));
        XYZ.click();

        Bekle(2);

        WebElement secenek = driver.findElement(By.cssSelector("[id='u_1fG_4597']"));
        secenek.click();

        Bekle(2);

        WebElement secenek1 = driver.findElement(By.cssSelector("[id='u_1fG_4597']>:nth-child(4)"));
        secenek1.click();


        XYZ.click();

        Bekle(3);

        for (int i = 3; i > -1 ; i--) {
            System.out.println("Test sonlanıyor..." + i);
            Bekle(2);
        }
        System.out.println("Test Sonlanmıştır " );
        driver.quit();

        BekleKapat();

    }
}

