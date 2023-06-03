package Day06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework01 extends BaseDriver {
    //1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    //2- Business i çekleyin
    //3- discover XYZ ye tıklayın ve online Advertising i seçin
    //4- Every day i seçin
    //5- Good u seçin
    //6- using XYZ yi tıklayın ve 3. seçeneği seçin
    //cssSelector ile
@Test
 public void Test() {
  driver.get("https://formsmarts.com/form/yu?mode=h5");

  WebElement btn = driver.findElement(By.cssSelector("[value='Business']"));
  btn.click();
  MyFunc.Bekle(2);

  WebElement btn2 = driver.findElement(By.cssSelector("div[id='section_1'] [value='Online Advertising']"));
  btn2.click();

  MyFunc.Bekle(2);
  WebElement btn3 = driver.findElement(By.cssSelector("div[id='section_1'] [value='Every Day']"));
  btn3.click();

  MyFunc.Bekle(2);
  WebElement btn4 = driver.findElement(By.cssSelector("div[id='section_1'] [value='Good']"));
  btn4.click();

  MyFunc.Bekle(2);
  WebElement btn5 = driver.findElement(By.cssSelector("div[id='section_1'] [value=\"I'm using XYZ for about a week\"]"));
  btn5.click();

  BekleKapat();
 }
}
