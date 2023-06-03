package Day06.Day06_Homework;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework04 extends BaseDriver {
    // Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    // Calculate'e tıklayınız.
    // İlk input'a herhangi bir sayı giriniz.
    // İkinci input'a herhangi bir sayı giriniz.
    // Calculate button'una tıklayınız.
    // Sonucu alınız
    // Sonucu yazdırınız.
    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        String number = "33";
        String number2 = "49";
        WebElement btn = driver.findElement(By.cssSelector("div[class='page-body'] [id= 'calculate']"));
        btn.click();

        WebElement txtBox = driver.findElement(By.cssSelector("form[action='calculate.php'] [id='number1']"));
        txtBox.sendKeys(number);

        WebElement txtBox2 = driver.findElement(By.cssSelector("form[action='calculate.php'] [id= 'number2']"));
        txtBox2.sendKeys(number2);

        WebElement submit = driver.findElement(By.cssSelector("form[action='calculate.php'] [type='submit']"));
        submit.click();

        WebElement answer = driver.findElement(By.id("answer"));
        System.out.println("Answer= " + answer.getText());

        BekleKapat();
    }
}
