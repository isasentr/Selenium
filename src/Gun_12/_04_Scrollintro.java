package Gun_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

/*
https://uk.hotels.com/

https://p-del.co/

 Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/

 */
public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        //JavaScript komutlarını çalıştırmak için önce js değişkeni tanumlandı.

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");  //window.scrollBy(0,15000) bu java script e ait kod

        // tıklama dahil kaydırmada java script ile yapıyoruz
        //(0,1500) (x,y) sayfağı sağa x kadar ve aşağı y kaydırır.
        //1500 px kadar aşağı kaydıracak.

        Bekle(2);
        js.executeScript("window.scrollBy(500,-500)");
        BekleKapat();


    }
}
