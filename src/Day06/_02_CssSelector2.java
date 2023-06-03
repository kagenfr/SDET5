package Day06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
public class _02_CssSelector2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim = "merhaba selenium";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("aranılan mesaj bulunamadı" , msg.getText().equals(mesajim)); //verilen değeri TRUE mu diye kontrol eder
        //Hata yok ise yani değer TRUE ise hiç bilgi vermez.


        BekleKapat();
    }
}

