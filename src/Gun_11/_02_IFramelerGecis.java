package Gun_11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1); //frame2

        WebElement input2= driver.findElement(By.cssSelector("select[id='animals']"));
//        input2.sendKeys("Avatar"); // 1 . yol

        Select ddmenu=new Select(input2);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1); // son elemanı seçtik  2 . yol
        BekleKapat();
    }
}

//frame lere nasıl yaparsınız diye  soru soruyorlar
/*
örnek
frame 0
           >subframe 0
           >subframe 1
frame 1
 */