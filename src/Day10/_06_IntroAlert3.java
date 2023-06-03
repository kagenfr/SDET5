package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_IntroAlert3 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        element.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("etka");
        MyFunc.Bekle(3);
        driver.switchTo().alert().accept();
        MyFunc.Bekle(2);
        WebElement txtActual = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("etka"));

        BekleKapat();
    }
}
