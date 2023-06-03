package Day07.Day07_Homework;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework01 extends BaseDriver {
    @Test
    public void Test(){
        // 1) Bu siteye gidin. -> http://demoqa.com/text-box
        // 2) Full Name kısmına "Automation" girin.
        // 3) Email kısmına "Testing@gmail.com" girin.
        // 4) Current Address kısmına "Testing Current Address" girin.
        // 5) Permanent Address kısmına "Testing Permanent Address" girin.
        // 6) Submit butonuna tıklayınız.
        // 7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        // 8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

        driver.get("http://demoqa.com/text-box");

        String name = "Automation";
        String email = "Testing@gmail.com";
        String currentAddress = "Testing Current Address";
        String permanentAddress = "Testing Permanent Address";

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys(name);

        WebElement eMail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        eMail.sendKeys(email);

        WebElement currAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currAddress.sendKeys(currentAddress);

        WebElement permAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permAddress.sendKeys(permanentAddress);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        WebElement msgName = driver.findElement(By.xpath("//p[text()='Automation']"));
        WebElement msgEmail = driver.findElement(By.xpath("//p[text()='Testing@gmail.com']"));


        Assert.assertTrue("Automation kelimesini barındırmıyor", msgName.getText().contains("Automation"));
        Assert.assertTrue("Testing kelimesini barındırmıyor", msgEmail.getText().contains("Testing"));





        BekleKapat();

    }
}
