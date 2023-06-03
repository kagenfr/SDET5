package Day12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

public class _02_iFramelerGecis extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Türkiye");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement webSelect = driver.findElement(By.id("animals"));
        Select nesneSelect = new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");

        BekleKapat();

    }
}
