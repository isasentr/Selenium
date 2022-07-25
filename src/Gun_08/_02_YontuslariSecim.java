package Gun_08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_YontuslariSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");


        WebElement element = driver.findElement(By.id("autoCompleteMultipleInput"));
        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)
                .click()
                .sendKeys("b")
                .build();
        aksiyon.perform();

        aksiyon=aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();

        aksiyon.perform();

        BekleKapat();
    }

}
