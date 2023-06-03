package Day11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
        Selenium bekleme komutları;

        Implicitly Wait: Tüm sayfadaki elemanlar için, elemanın locator'ı sayfa içinde bulunabilir hale getirene
        kadar verilen bekleme süresi. Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.
        NoSuchElement hatasını için verilen süre kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

        ***Duration muhlet = Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(muhlet);***







 */

public class _01_WaitGiris extends BaseDriver {
    @Test
    public void  Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet = Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(muhlet);

        //MyFunc.Bekle(20);
        WebElement mesaj = driver.findElement(By.xpath("//p[text()='WebDriver']"));




    }
}
