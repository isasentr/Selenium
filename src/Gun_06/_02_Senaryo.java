package Gun_06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo extends BaseStaticDriver {
    /*
1- https://www.saucedemo.com/  sitesini açın
2- login işlemini yapınız.
3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
4- Sonra geri dönün
5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
6- sepete tıklatın
7- CheckOut a tıklatın
8- kullanıcı bilgilerini doldurup Continue ya tıklatın
9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
Item total e eşit olup olmadığını if/Assert ile test ediniz.
     */
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/ ");

        Bekle(1);
        WebElement username = driver.findElement(new By.ByXPath("//input[@name='user-name']"));
        username.sendKeys("standard_user");

        Bekle(1);

        WebElement password = driver.findElement(new By.ByXPath("//input[@name='password']"));
        password.sendKeys("secret_sauce");

        Bekle(1);

        WebElement login = driver.findElement(new By.ByXPath("//input[@name='login-button']"));
        login.click();
        Bekle(1);

        WebElement tick = driver.findElement(new By.ByXPath("//div[@class='inventory_item_name']"));
        tick.click();
        Bekle(1);

        WebElement saucelabs = driver.findElement(new By.ByXPath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        saucelabs.click();

        Bekle(1);

        WebElement back = driver.findElement(new By.ByXPath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        back.click();
        Bekle(1);

        WebElement seconditem = driver.findElement(new By.ByXPath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        seconditem.click();
        Bekle(1);
        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(1);
        WebElement cehecout = driver.findElement(By.xpath("//button[@id='checkout']"));
        cehecout.click();
        Bekle(1);

        WebElement name = driver.findElement(By.xpath("//input[@id='first-name']"));
        name.sendKeys("isa");
        Bekle(1);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("sen");
        Bekle(1);

        WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip.sendKeys("12345");
        Bekle(1);


        WebElement continuee = driver.findElement(By.xpath("//input[@id='continue']"));
        continuee.click();

        Bekle(1);

        List<WebElement> price = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement e : price) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().replaceAll("[^0-9,.]", ""));
        }
        System.out.println("toplam = " + toplam);

        // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
        WebElement totall = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(totall.getText());
        double subtotal = Double.parseDouble(totall.getText().replaceAll("[^0-9,.]", ""));
        System.out.println("subtotal = " + subtotal);

        Assert.assertTrue(toplam==subtotal);

/*
//(//*[@class='inventory_item_price'])[1]
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
        WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(webAltToplam.getText());
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        if (toplam == altToplam)
            System.out.println("test passed");
        else
            System.out.println("test failed");
 */

//        Assert.assertTrue(toplam==alttoplam);

//        Assert.assertEquals("merhaba", "merhaba1");

        BekleKapat();
    }
}
