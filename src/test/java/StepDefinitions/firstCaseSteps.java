package StepDefinitions;

import Pages.POM;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.annotations.Test;

public class firstCaseSteps {

    POM pom = new POM();


    @Given("Navigate to a{int}.com")
    public void navigateToACom(int arg0) {
        GWD.getDriver().get("https://www.a101.com.tr/");
        GWD.getDriver().manage().window().maximize();
     //   pom.findAndClick("acceptCookies");

    }

    @When("go to the knee socks section")
    public void goToTheKneeSocksSection() {
        pom.findAndClick("searchButton");
        pom.findAndClick("kitapKirtasiyeMenu");

        pom.findAndClick("addToBasket");
        pom.findAndClick("showBasket");
        pom.findAndClick("confirmBasket");
        pom.findAndClick("uyeOlmadanDevamEt");

    }

    @Then("verify that the product is a notebook")
    public void verifyThatTheProductIsBlackInColor() {
        pom.findAndClick("defter");
    }

    @And("add to cart and confirm")
    public void addToCartAndConfirm() {
        pom.findAndClick("addToBasket");
        pom.findAndClick("showBasket");
        pom.findAndClick("confirmBasket");
        pom.findAndClick("uyeOlmadanDevamEt");
        pom.findAndSend("inputEmail","olur232@gm.cm");
        pom.findAndClick("devamEt");
        pom.findAndClick("newAdress");

        pom.findAndSend("adresBaslik","ev");
        pom.findAndSend("firstName","onr");
        pom.findAndSend("lastName","ncdy");
        pom.findAndSend("phoneNumber","5397182541");

        pom.selectMenu("city","ORDU");
        pom.selectMenu("township","FATSA");
        pom.selectMenu("district","MERKEZ MAH");
        pom.findAndSend("line","CADDES2 25 NMUAMRA MH2r");
        pom.findAndClick("kaydet");



    }

    @Then("verify that you are on the payment page")
    public void verifyThatYouAreOnThePaymentPage() {
        Parent.waits(6);
        String currentUrl = GWD.driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        Assert.assertTrue(currentUrl.contains("akbank.com"));
    }
}
