package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;

public class BaseStaticDriver {

    public static WebDriver driver;

 static{ // burada public static void yazlı idi, bu metodu kullanırken yazmadan direk kullanmak için public ve void sildik. En başta olduğu için bu şkeilde kullanabildik.
     System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");  // run daki ilk 3 satırı gizliyor.

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.manage().window().maximize(); //max
        driver.manage().deleteAllCookies();

     Duration dr= Duration.ofSeconds(30);
     driver.manage().timeouts().pageLoadTimeout(dr); //sadece ana sayfa yüklenirken eb başta
     driver.manage().timeouts().implicitlyWait(dr); //bütün webelement için geçerli
    }

    public static void BekleKapat() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}