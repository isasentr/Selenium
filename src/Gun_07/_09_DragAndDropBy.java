package Gun_07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement surgu= driver.findElement(By.xpath("//*[@id=\"slider-range\"]//span[1]"));
        Bekle(3);
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDropBy(surgu,100,0).build();

        aksiyon.perform();

        Bekle(5);
        BekleKapat();


    }
}
