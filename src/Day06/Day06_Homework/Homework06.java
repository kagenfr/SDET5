package Day06.Day06_Homework;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework06 extends BaseDriver {
    // Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    // Fake Alerts'e tıklayınız.
    // Show modal dialog buttonuna tıklayınız.
    // Ok'a tıklayınız.
    // Alert kapanmalıdır.
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement btn = driver.findElement(By.cssSelector("div[class= 'page-body'] [id= 'fakealerttest']"));
        btn.click();

        WebElement btn2 = driver.findElement(By.cssSelector("div[class= 'page-body'] [value= 'Show modal dialog']"));
        btn2.click();

        WebElement btn3 = driver.findElement(By.cssSelector("div[id='dialog'] [id= 'dialog-ok']"));
        btn3.click();



        BekleKapat();
    }
}
