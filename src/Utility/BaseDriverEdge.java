package Utility;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseDriverEdge {
    public static WebDriver driver1;

    static {
        KalanOncekileriKapat();
        //Logger logger = Logger.getLogger(""); eğer gerekirse burası açılabilir.
        //logger.setLevel(Level.SEVERE); sadece errorları göster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        driver1 = new EdgeDriver();

        driver1.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver1.manage().timeouts().pageLoadTimeout(dr);
        // Sadece tüm sayfanın kodlarının bilgisyarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.: 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez.

        //driver.manage().timeouts().implicitlyWait(dr);
        // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. Eğer 2 sn yüklerse 30 sn. beklemez.
    }

    public static void BekleKapatEdge(){

        MyFunc.Bekle(5);
        driver1.quit();
    }
    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
      public static boolean isAlertPresent(){
            try{
                driver1.switchTo().alert();
                return true;
           }catch(NoAlertPresentException ex){
                return false;
           }
        }

}
