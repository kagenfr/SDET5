package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionKeyControlSendKeys extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.cssSelector("div[class='auto-complete__value-container css-1hwfws3']"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("e").keyUp(Keys.SHIFT).sendKeys("tka").build();
        MyFunc.Bekle(2);
        action.perform();



    }
}
