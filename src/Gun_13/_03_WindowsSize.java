package Gun_13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;


public class _03_WindowsSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize(); //ekranı tam hale getiriyor
        Bekle(3);

        Dimension dim=new Dimension(516,600); // ekranı yeni ölçülere göre set ediyor.
        driver.manage().window().setSize(dim);

        Bekle(3);
        BekleKapat();
    }
}
