package Day05;


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        //Verilen taglerdeki tüm elemanları aldık

        for (WebElement e: linkler){
            if (e.getText().equals(""))
            //if (e.getText().isEmpty())
            System.out.print("href = " + e.getAttribute("href"));
            System.out.print("title = " + e.getAttribute("title"));
            System.out.println("rel = " + e.getAttribute("rel"));
        }








        BekleKapat();
    }
}
