package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class _01_Example01 extends BaseDriver {
    // Test Senaryosu
    // 1- https://www.facebook.com/  sayfasına gidiniz
    // 2- CreateNewAccount a tıklatınız.
    // 3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
    // 4- Doğum tarihinizi Select sınıfı ile seçiniz
    // 5- Email i tekrar girmenizi isteyen bir input daha açıldığını
    // öncesinde de görünmediğini, sonrasında da göründüğünü
    // assert ile doğrulayınız.
    @Test
    public void Test(){
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        List<WebElement> allowCookies = driver.findElements(By.xpath("//button[text()='Only allow essential cookies']"));
        if (allowCookies.size()>0)
            allowCookies.get(0).click();

        MyFunc.Bekle(2);
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();

        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("etka");

        MyFunc.Bekle(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("bilgen");

        MyFunc.Bekle(1);
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("etkabilgen@outlook.com");

        MyFunc.Bekle(1);
        Assert.assertTrue(reEmail.isDisplayed());
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(1);
        WebElement webMonth = driver.findElement(By.id("month"));
        Select month = new Select(webMonth);
        month.selectByValue("6");

        MyFunc.Bekle(1);
        WebElement webDay = driver.findElement(By.id("day"));
        Select day = new Select(webDay);
        day.selectByVisibleText("12");

        MyFunc.Bekle(1);
        WebElement webYear = driver.findElement(By.id("year"));
        Select year = new Select(webYear);
        year.selectByVisibleText("1996");

        MyFunc.Bekle(2);




        BekleKapat();
    }
}
