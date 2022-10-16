package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Locale;

public class Parent {
    public void sendKeysFunction(WebElement element,String value){
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element);  // elemente kadar scroll yap
        element.clear();           // kutucugu temizle
        element.sendKeys(value);   // değeri gonder
        
    }
    public void clickFunction(WebElement element){
        waitUntilVisible(element);
        waitUntilClickable(element); //clickable olana kadar bekle
        //scrollToElement(element);  // elemente kadar scroll yap
        element.click();             // elemente tıkla

    }
    public void selectMenuFunction(WebElement element,String selectValue){
        waits(1);
        waitUntilVisible(element);
        waitUntilClickable(element);
        Select menu=new Select(element);
        menu.selectByValue(selectValue);
    }

    public void verifyContainsText(WebElement element,String text){
        waitUntilVisible(element); //gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase())); //verify yap
    }
    public void waitUntilVisible( WebElement element){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static void waits(int second){
        try {
            Thread.sleep(second*500);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }


}
