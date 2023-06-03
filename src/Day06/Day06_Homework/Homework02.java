package Day06.Day06_Homework;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework02 extends BaseDriver {
    // 1) Bu siteye gidin. -> https://demo.applitools.com/
    // 2) Username kısmına "ttechno@gmail.com" girin.
    // 3) Password kısmına "techno123." girin.
    // 4) "Sign in" buttonunan tıklayınız.
    // 5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

@Test
    public void Test1(){
    driver.get("https://demo.applitools.com");

    String username = "ttechno@gmail.com";
    String password = "techno123.";
    String message = "Your nearest branch closes in: 30m 5s";

    WebElement txtBox = driver.findElement(By.cssSelector("div[class='all-wrapper menu-side with-pattern'] [id='username']"));
    txtBox.sendKeys(username);

    WebElement txtBox2 = driver.findElement(By.cssSelector("div[class='all-wrapper menu-side with-pattern'] [id='password']"));
    txtBox2.sendKeys(password);

    WebElement signIn = driver.findElement(By.cssSelector("div[class='all-wrapper menu-side with-pattern'] [id='log-in']"));
    signIn.click();

    WebElement msg = driver.findElement(By.cssSelector("div[class='layout-w'] [id='time']"));

    Assert.assertTrue("Yazı gözükmüyor",msg.getText().contains(message));
BekleKapat();
}
}
