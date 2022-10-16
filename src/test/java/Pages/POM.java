package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.security.mscapi.CPublicKey;

public class POM extends Parent {

    public POM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Kabul Et']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//button/em")
    private WebElement searchButton;

    @FindBy(xpath = "//A[contains(text(),' Kitap & kırtasiye')]")
    private WebElement kitapKirtasiyeMenu;

    @FindBy(xpath = "//h3[contains(text(),'Gıpta 17x24 cm 120 Yaprak Sert Kapak Kareli Defter Mercan')]")
    private WebElement defter;

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    private WebElement addToBasket;

    @FindBy(linkText = "Sepeti Görüntüle")
    private WebElement showBasket;

    @FindBy(xpath = "//a[contains(text(),'Sepeti Onayla')]")
    private WebElement confirmBasket;

    @FindBy(xpath = "//a[contains(text(),'ÜYE OLMADAN DEVAM ET')]")
    private WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//button[contains(text(),'DEVAM ET')]")
    private WebElement devamEt;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    private WebElement newAdress;

    @FindBy(name = "title")
    private WebElement adresBaslik;

    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "phone_number")
    private WebElement phoneNumber;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "township")
    private WebElement township;

    @FindBy(name = "district")
    private WebElement district;

    @FindBy(name = "line")
    private WebElement line;

//    @FindBy(name = "identity_number")
//    private WebElement identity_number;
//
//    @FindBy(name = "birth_year")
//    private WebElement birth_year;

    @FindBy(xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    private WebElement kaydet;

    @FindBy(xpath = "//button[contains(text(),'Kaydet ve Devam Et')]")
    private WebElement kaydetveDevamEt;

    @FindBy(xpath = "//input[@type='text'][@name='name'][@autocomplete='off']")
    private WebElement cardName;

    @FindBy(xpath = "//input[@type='tel'][@class='js-masterpassbin-payment-card'][@autocomplete='off']")
    private WebElement cardNumber;

    @FindBy(xpath = "(//option[@value='2'])[1]")
    private WebElement cardDateOne;

    @FindBy(xpath = "(//option[@value='2024'])[1]")
    private WebElement cardDateTwo;

    @FindBy(name = "card_cvv")
    private WebElement cardCvv;

    @FindBy(xpath = "//span[@class='order-complete']")
    private WebElement orderComplete;


    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement){
            case "acceptCookies":myElement=acceptCookies;break;
            case "searchButton":myElement=searchButton;break;
            case "kitapKirtasiyeMenu":myElement=kitapKirtasiyeMenu;break;
            case "defter":myElement=defter;break;
            case "addToBasket":myElement=addToBasket;break;
            case "showBasket":myElement=showBasket;break;
            case "confirmBasket":myElement=confirmBasket;break;
            case "uyeOlmadanDevamEt":myElement=uyeOlmadanDevamEt;break;
            case "devamEt":myElement=devamEt;break;
            case "newAdress":myElement=newAdress;break;
            case "kaydet":myElement=kaydet;break;
            case "kaydetveDevamEt":myElement=kaydetveDevamEt;break;
            case "orderComplete":myElement=orderComplete;break;

        }
        clickFunction(myElement);

    }

    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "inputEmail":myElement=inputEmail;break;
            case "adresBaslik":myElement=adresBaslik;break;
            case "firstName":myElement=firstName;break;
            case "lastName":myElement=lastName;break;
            case "phoneNumber":myElement=phoneNumber;break;
            case "line":myElement=line;break;

        }
        sendKeysFunction(myElement,value);
    }


    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {

        }
        verifyContainsText(myElement,text);
    }


    public void selectMenu(String strElement, String value){
        switch (strElement)
        {
            case "city" : myElement =city; break;
            case "township" : myElement =township; break;
            case "district" : myElement =district; break;
        }
        selectMenuFunction(myElement,value);
    }


    public void selectMenuValue(String strElement, String value){
        switch (strElement)
        {
//            case "cardMonth" : myElement =cardMonth; break;
//            case "cardYear" : myElement =cardYear; break;
        }
     //   selectMenuValueFunction(myElement,value);
    }
}