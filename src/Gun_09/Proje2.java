package Gun_09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Proje2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in"); //    1. Navigate to http://a.testaddressbook.com/sign_in

        driver.findElement(By.id("session_email")).click();//2. Enter the username and password
        driver.findElement(By.id("session_email")).sendKeys("aliveli4950@gmail.com");
        driver.findElement(By.id("session_password")).click();
        driver.findElement(By.id("session_password")).sendKeys("123456");

        driver.findElement(By.cssSelector("input[name='commit']")).click();//3. Click on sign in button
        driver.findElement(By.className("navbar-toggler-icon")).click();
        driver.findElement(By.cssSelector("a[href='/addresses']")).click();//4. Click on Addresses
        driver.findElement(By.cssSelector("a[href='/addresses/new']")).click();//5. Click on new address button

        driver.findElement(By.cssSelector("input[id='address_first_name']")).sendKeys("Fernando");//6. Enter the first name "Fernando"
        driver.findElement(By.cssSelector("input[id='address_last_name']")).sendKeys("Torres");//7. Enter the last name "Torres"
        driver.findElement(By.cssSelector("input[id='address_street_address']")).sendKeys("Anfield Rd");//8. Enter the address 1 "Anfield Rd"
        driver.findElement(By.cssSelector("input[id='address_secondary_address']")).sendKeys("Anfield");//9. Enter the address 2 "Anfield"
        driver.findElement(By.cssSelector("input[id='address_city']")).sendKeys("Liverpool");//10. Enter the city "Liverpool"

        List<WebElement> list = driver.findElements(By.cssSelector("select[id='address_state']"));//11. Choose a RANDOM option from the state dropdown
        WebElement state = driver.findElement(By.cssSelector("select[id='address_state']"));
        state.sendKeys("int)(Math.random()*(list.size())");

        driver.findElement(By.cssSelector("input[id='address_zip_code']")).sendKeys("L4 0TH");//12. Enter the Zipcode "L4 0TH"
        driver.findElement(By.cssSelector("input[id='address_country_us']")).click();//13. Click on United States
        driver.findElement(By.cssSelector("input[id='address_birthday']")).sendKeys("20/03/1984");//14. Enter the birthday "20/03/1984"
        driver.findElement(By.cssSelector("input[id='address_age']")).sendKeys("34");//15. Enter the age "36"
        driver.findElement(By.cssSelector("input[id='address_website']")).sendKeys("https://www.google.com/");//16. Enter the WebSite "https://www.google.com/"
        driver.findElement(By.cssSelector("input[id='address_phone']")).sendKeys("8625747878");//17. Enter the phone "8625747878"
        driver.findElement(By.cssSelector("input[id='address_interest_climb']")).click();//18. Click on Climbing and Dancing
        driver.findElement(By.cssSelector("input[id='address_interest_dance']")).click();
        driver.findElement(By.cssSelector("textarea[id='address_note']")).sendKeys("Asla Geri Dönme");//19. Enter the Note "Never Back Down"
        driver.findElement(By.cssSelector("input[name='commit']")).click();//20. Click on Create Address button

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='col offset-1 offset-sm-0'][text()=' Fernando']")).getText().contains("Fernando"));//21. Verify if the first name is "Fernando"
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='col offset-1 offset-sm-0'][text()=' Torres']")).getText().contains("Torres"));//22. Verify if the last name is "Torres"

        driver.findElement(By.cssSelector("button[class='navbar-toggler navbar-toggler-right']")).click();//23. Click on Addresses
        driver.findElement(By.cssSelector("a[href='/addresses']")).click();
        driver.findElement(By.cssSelector("a[href*='/edit']")).click();//24. Click on Edit button
        driver.findElement(By.cssSelector("input[id='address_first_name']")).clear();
        driver.findElement(By.cssSelector("input[id='address_first_name']")).sendKeys("Peter");//25. Change the first name as "Peter"
        driver.findElement(By.cssSelector("input[id='address_last_name']")).clear();
        driver.findElement(By.cssSelector("input[id='address_last_name']")).sendKeys("Crouch");//26. Change the last name as "Crouch"
        driver.findElement(By.cssSelector("input[name='commit']")).click();//27. Click on Update address

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='col offset-1 offset-sm-0'][text()=' Peter']")).getText().contains("Peter"));//28. Verify if the first name is "Peter"
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='col offset-1 offset-sm-0'][text()=' Crouch']")).getText().contains("Crouch"));//29. Verify if the last name is "Crouch"

        driver.findElement(By.xpath("//a[@data-test='list'][1]")).click();//30. Click on Addresses
        driver.findElement(By.xpath("//a[@data-confirm='Are you sure?'][1]")).click();//31. Click on Destroy
        Bekle(1);
        driver.switchTo().alert().accept();//32. Confirm deleting the address

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-notice'][text()='Address was successfully destroyed.']")).getText().contains("Address was successfully destroyed."));//33. Verify if the address was removed

        driver.findElement(By.cssSelector("a[rel='nofollow']")).click();//34. Quit the browser

        Bekle(1);
        BekleKapat();
    }
}
