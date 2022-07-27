package Gun_11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

public class _04_BasicCalculator_odev extends BaseStaticDriver {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement num1 = driver.findElement(By.id("number1Field"));
        int number1 = (int) ((Math.random()) *(100-1)+1);
        num1.sendKeys("" + number1);

        WebElement num2 = driver.findElement(By.id("number2Field"));
        int number2 = (int) ((Math.random()) *(100-1)+1);
        num2.sendKeys("" + number2);


        for (int j = 0; j < 1; j++) {

            //Toplama
            WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
            Select ddmenu = new Select(operation);
            ddmenu.selectByIndex(ddmenu.getOptions().size() - 5);

            WebElement submit = driver.findElement(By.id("calculateButton"));
            submit.click();

            WebElement answer = driver.findElement(By.cssSelector("[id='numberAnswerField']"));
            WebElement answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));

            int num3 = (number1 + number2);
            Bekle(1);
            Assert.assertEquals(num3, Integer.parseInt(answer.getAttribute("value")));

            Bekle(1);

            driver.findElement(By.id("clearButton")).click();

            //Çıkarma

            ddmenu.selectByIndex(ddmenu.getOptions().size() - 4);

            submit = driver.findElement(By.id("calculateButton"));
            submit.click();

            answer = driver.findElement(By.cssSelector("[id='numberAnswerField']"));
            answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
            num3 = (number1 - number2);
            Bekle(1);
            Assert.assertEquals(num3, Integer.parseInt(answer.getAttribute("value")));

            Bekle(1);
            driver.findElement(By.id("clearButton")).click();

            //Çarpma

            ddmenu.selectByIndex(ddmenu.getOptions().size() - 3);

            submit = driver.findElement(By.id("calculateButton"));
            submit.click();

            answer = driver.findElement(By.cssSelector("[id='numberAnswerField']"));
            answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
            num3 = (number1 * number2);
            Bekle(1);
            Assert.assertEquals(num3, Integer.parseInt(answer.getAttribute("value")));

            Bekle(1);
            driver.findElement(By.id("clearButton")).click();

            // Bölme

            ddmenu.selectByIndex(ddmenu.getOptions().size() - 2);

            submit = driver.findElement(By.id("calculateButton"));
            submit.click();

//        driver.findElement(By.id("integerSelect")).click();

            double num30 = (double) number1 / number2;

            answer = driver.findElement(By.cssSelector("[id='numberAnswerField']"));

            double answer30 = Double.parseDouble(answer.getAttribute("value"));
            Bekle(1);
            Assert.assertTrue(num30 == answer30);

            Bekle(1);
            driver.findElement(By.id("clearButton")).click();

            //Concatenate
            ddmenu.selectByIndex(ddmenu.getOptions().size() - 1);

            submit = driver.findElement(By.id("calculateButton"));
            submit.click();

            answer = driver.findElement(By.cssSelector("[id='numberAnswerField']"));
            answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
            String Concatenate = String.valueOf(number1) + String.valueOf(number2);

            Bekle(1);
            Assert.assertEquals(Concatenate, (answer.getAttribute("value")));

            Bekle(1);
            driver.findElement(By.id("clearButton")).click();

        }
        }

        BekleKapat();
    }
}
