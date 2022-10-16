package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {


     public static WebDriver driver;
    /**
     * Interview Sorusu
     *     Singleton driver nedir ?
     *     Bütün projede aynı ve tek bir driverin kullanılmasıdır.
     */
    public static WebDriver getDriver(){

        if (driver == null){
            // extend report türkçe bilgi çalışmaması sebebiyle konuldu
            Locale.setDefault(new Locale("EN"));
            System.setProperty("user.language","EN");
            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY,"Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            // firefox
            // WebDriverManager.firefoxdriver().setup();
            // driver=new FirefoxDriver();
        }
        return driver;
    }
    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (driver!=null){ // driver varsa
            driver.quit();
            driver=null;
        }
    }
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}
