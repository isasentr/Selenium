package Gun_07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_actionclicktest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu.");
        Bekle(2);

        Action aksiyon = aksiyonlar.moveToElement(element).click().build(); //element üzerine git click i hazırla
        System.out.println("Aksiyon hazırlandı");

        Bekle(2);
        aksiyon.perform(); //aksiyonu gerçekleştir
        System.out.println("Aksiyon gerçekleşti");
//aksiyonlar.moveToElement(element).click().build().perform(); kısa hali
        BekleKapat();
    }
}
