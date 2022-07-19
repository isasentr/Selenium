package Gun_05 ;
import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
        1) Bu siteye gidin. ->  http://demoqa.com/text-box
        2) Full Name kısmına "Automation" girin.
        3) Email kısmına "Testing@gmail.com" girin.
        4) Current Address kısmına "Testing Current Address" girin.
        5) Permanent Address kısmına "Testing Permanent Address" girin.
        6) Submit butonuna tıklayınız.
        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        Bur örnekdeki ID ve NAME kullanmadanö CSS Selector ile çözünüz
 */
public class _02_Seneryo extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        Bekle(2);
        WebElement fullname= driver.findElement(By.cssSelector("[class='col-md-9 col-sm-12']>:nth-child(1)"));
        fullname.sendKeys("Automation");

        Bekle(2);
        WebElement Email= driver.findElement(By.cssSelector("[id='userEmail-wrapper']>div+div>:nth-child(1)"));
        Email.sendKeys("Testing@gmail.com");

        Bekle(2);

        WebElement Current= driver.findElement(By.cssSelector("div[id='currentAddress-wrapper']>:nth-child(2)>[class='form-control']"));
        Current.sendKeys("Testing Current Address");

        Bekle(2);

        WebElement Permanent= driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>:nth-child(2)>[class='form-control']"));
        Permanent.sendKeys("Testing Permanent Address");

        Bekle(2);

        WebElement submit= driver.findElement(By.cssSelector("div[class='text-right col-md-2 col-sm-12']>:nth-child(1)"));
        submit.click();

        Bekle(2);

        if (driver.findElement(By.cssSelector("div[class='border col-md-12 col-sm-12']>:nth-child(1)")).getText().contains("Automation"))
            System.out.println("Fullname doğru");
        else
            System.out.println("Fullname yanlış");

        if (driver.findElement(By.cssSelector("div[class='border col-md-12 col-sm-12']>:nth-child(2)")).getText().contains("Testing@gmail.com"))
            System.out.println("Email doğru");
        else
            System.out.println("Email yanlış");

        BekleKapat();
    }
}
