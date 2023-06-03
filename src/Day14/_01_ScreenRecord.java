package Day14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_ScreenRecord extends BaseDriver {
    @Test
    public void Test() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        username.sendKeys("etka");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("etka123");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        //hatalı ise;

        List<WebElement> hataMesaji = driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size()>0);
        { //hata varsa ekran kaydet
            System.out.println("Hata oluştu");

            TakesScreenshot ts = (TakesScreenshot) driver; // 1. aşama ekran görüntüsü alma değişkenini tanımladım
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE); // 2. aşama ekran görüntüsü alındı, hafızada
            //hafızadaki bu bilgiyi dosya olarak kaydet.
            FileUtils.copyFile(hafizadakiHali, new File("\"C:\\Users\\etkab\\Desktop\""));
        }
        MyFunc.Bekle(2);
        BekleKapat();

        // TODO: burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //  biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
        //  bunu nasıl yaparsınız
        //  LocalDateTime alıcaksın bilgileri
        //  YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

    }
}
