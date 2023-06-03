package Day11;

import Utility.BaseDriverEdge;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoruEdge extends BaseDriverEdge {


           /*

           Senaryo
           1-  https://www.demoblaze.com/index.html  siteyi açınız.
           2- Samsung galaxy s6  linkine tıklayınız.
           3- Sepete ekleyiniz.
           4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz

            */

    @Test
    public void Wait1(){
        driver1.get("https://www.demoblaze.com");


        WebElement link = driver1.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEkleLink = driver1.findElement(By.linkText("Add to cart"));
        sepeteEkleLink.click();

        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        driver1.switchTo().alert().accept();

        WebElement anasayfa = driver1.findElement(By.id("nava"));
        anasayfa.click();

        BekleKapatEdge();

    }


}
