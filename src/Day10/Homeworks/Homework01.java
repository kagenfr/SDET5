package Day10.Homeworks;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

// http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
// buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

public class Homework01 extends BaseDriver {
@Test
    public void Test(){
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

    List<WebElement> cities = driver.findElements(By.id("answerDiv"));


    Actions actions = new Actions(driver);
    WebElement copenhagen = driver.findElement(By.id("a3"));
    WebElement denmark = driver.findElement(By.id("q3"));












}
}
