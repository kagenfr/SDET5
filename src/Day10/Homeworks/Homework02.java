package Day10.Homeworks;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
// buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.


public class Homework02 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        WebElement students = driver.findElement(By.id("allItems"));

        Actions actions = new Actions(driver);

        WebElement copenhagen = driver.findElement(By.id("a3"));
        WebElement denmark = driver.findElement(By.id("q3"));










    }
}
