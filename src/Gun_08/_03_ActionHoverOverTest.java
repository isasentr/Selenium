package Gun_08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    /*
            1- https://www.etsy.com/ sitesine gidiniz.
            2- Sırasıyla aşağıdaki menu itemlerine gidiniz.
               Jewellery id catnav-primary-link-10855
               Necklaces id side-nav-category-link-10873
               Bib Necklaces id catnav-l3-10881

            3-En son item e tıklatınız.
            4-URL de Bib kelimesinin geçtiğini Assert ile doğrulayınız.
     */


    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        Bekle(2);

  //       Burada cookies çıkması durumunda kod yazdık. Bunuda findElements kodu ile  hallettik. Eğer var ise 1 adet olacağı için cookiesAccept.get(0).click();
        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        Actions aksiyonlar = new Actions(driver);

//       Uzun kod

//        Action aksiyon = aksiyonlar.moveToElement(driver.findElement(By.id("catnav-primary-link-10855"))).build();
//        aksiyon.perform();

        //Kısa kod
        Bekle(2);
        aksiyonlar.moveToElement(driver.findElement(By.id("catnav-primary-link-10855"))).build().perform();

        Bekle(2);
       aksiyonlar.moveToElement(driver.findElement(By.id("side-nav-category-link-10873"))).build().perform();

        Bekle(2);
       aksiyonlar.moveToElement(driver.findElement(By.id("catnav-l3-10881"))).click().build().perform();

        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));
        BekleKapat();
    }
}
