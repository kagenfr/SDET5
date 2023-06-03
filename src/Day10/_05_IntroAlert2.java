package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_IntroAlert2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        MyFunc.Bekle(2);
        element.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().dismiss();

        BekleKapat();
    }
}
