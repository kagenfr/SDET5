package Day06.Day06_Homework;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework03 extends BaseDriver {
    // 1) Bu siteye gidin. -> https://www.snapdeal.com/
    // 2) "teddy bear" aratın ve Search butonuna tıklayın.
    // 3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    // Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
    @Test
    public void Test() {
        driver.get("https://www.snapdeal.com/");

        String search = "teddy bear";
        String message = "We've got 314 results for teddy bear";

        WebElement txtBox = driver.findElement(By.cssSelector("div[id='sdHeader'] [id= 'inputValEnter']"));
        txtBox.sendKeys(search);

        WebElement btn = driver.findElement(By.cssSelector("div[id='sdHeader'] [class= 'searchTextSpan']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("div[id='content_wrapper'] [class='nnn']"));

        Assert.assertTrue("", msg.getText().contains(message));


        BekleKapat();
    }
}
