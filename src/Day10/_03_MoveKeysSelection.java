package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_MoveKeysSelection extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.cssSelector("div[class='auto-complete__value-container css-1hwfws3']"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).click().sendKeys("g").build();
        action.perform();

        MyFunc.Bekle(2);

        action = actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        action.perform();


BekleKapat();

    }
}
