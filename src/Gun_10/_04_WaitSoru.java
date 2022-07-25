package Gun_10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement btn= driver.findElement(By.linkText("Samsung galaxy s6"));
        btn.click();

        WebElement sepeteekle= driver.findElement(By.linkText("Add to cart"));
        sepeteekle.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement anasayfa= driver.findElement(By.id("nava"));
        anasayfa.click();

        BekleKapat();







    }
}
