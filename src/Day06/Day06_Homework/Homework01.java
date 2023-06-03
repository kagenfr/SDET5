package Day06.Day06_Homework;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework01 extends BaseDriver {
    //  1) Bu siteye gidin. -> http://demoqa.com/text-box
    //  2) Full Name kısmına "Automation" girin.
    //  3) Email kısmına "Testing@gmail.com" girin.
    //  4) Current Address kısmına "Testing Current Address" girin.
    //  5) Permanent Address kısmına "Testing Permanent Address" girin.
    //  6) Submit butonuna tıklayınız.
    //  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        String name = "Automation";
        String email = "Testing@gmail.com";
        String currentAddress = "Testing Current Address";
        String permAddress = "Testing Permanent Address";

        WebElement txtBox = driver.findElement(By.cssSelector("div[class=\"col-md-9 col-sm-12\"] > input[placeholder='Full Name']"));
        txtBox.sendKeys(name);

        WebElement txtBoxEmail = driver.findElement(By.cssSelector("div[id='userEmail-wrapper'] [placeholder='name@example.com']"));
        txtBoxEmail.sendKeys(email);

        WebElement txtBoxAddress = driver.findElement(By.cssSelector("div[id='currentAddress-wrapper'] [placeholder='Current Address']"));
        txtBoxAddress.sendKeys(currentAddress);

        WebElement txtBoxPermAddress = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper'] [id='permanentAddress']"));
        txtBoxPermAddress.sendKeys(permAddress);

        WebElement submit = driver.findElement(By.cssSelector("div[class='mt-2 justify-content-end row'] [id='submit']"));
        submit.click();

        WebElement msg = driver.findElement(By.cssSelector("div[id='output'] [id='name']"));

        Assert.assertTrue("Automation kelimesini barındırmıyor", msg.getText().contains(name));

        BekleKapat();
    }
}
