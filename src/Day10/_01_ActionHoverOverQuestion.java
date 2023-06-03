package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverQuestion extends BaseDriver {
    // https://www.etsy.com/ sayfasına gidiniz.
    // Jewellery -> Neckless -> Bib Neckless click
    // tıklatma işleminden sonra URL de
    // bib-necklaces kelimesinin geçtiğini doğrulayın.
    @Test
    public void Test(){
        //adım 1
        driver.get("https://www.etsy.com/");
        MyFunc.Bekle(1);
        List<WebElement> allowCookies = driver.findElements(By.cssSelector("button[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (allowCookies.size()>0)
            allowCookies.get(0).click();
        WebElement jewellery = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklaces = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bib = driver.findElement(By.id("catnav-l3-10881"));

        //adım 2
        Actions actions = new Actions(driver);
        actions.moveToElement(jewellery).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(necklaces).build().perform();
        MyFunc.Bekle(1);
        actions.moveToElement(bib).click().build().perform();
        MyFunc.Bekle(1);

        //adım 3
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("bib-necklaces"));
        MyFunc.Bekle(1);
        BekleKapat();







    }
}
