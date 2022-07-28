package Gun_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
4- Son videonun title ını yazdırınız.
 */
public class _07_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.cssSelector("div[id='search-input']>input"));
        search.sendKeys("Selenium");
        driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();

        List<WebElement> linkler;
        do {
            linkler = driver.findElements(By.cssSelector("a[id*='video-title']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,9000)");
            System.out.println("sıra no=" + linkler.size());
        } while (linkler.size() < 81);

        Bekle(2);
        System.out.println("Başlık="+linkler.get(80).getAttribute("ariaLabel"));

        BekleKapat();
    }
}
