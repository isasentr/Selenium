package Gun_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        /*

   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız


        */
        driver.get("https://www.selenium.dev/");

        String anasayfaWindowId=driver.getWindowHandle(); // bulunduğun sayfanın win id si

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler) {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> windows = driver.getWindowHandles();
        for (String id : windows) {
            driver.switchTo().window(id);
            Bekle(1);
            driver.close();

        }
    }
}
