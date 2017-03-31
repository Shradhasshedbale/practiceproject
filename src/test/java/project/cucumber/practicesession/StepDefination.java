package project.cucumber.practicesession;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.beans.property.SimpleObjectProperty;

/**
 * Created by SHRADHA on 10/02/2017.
 */
public class StepDefination {

    Drivermanager driverManager =  new Drivermanager();

    NopcomHomePage nopcomHomePage = new NopcomHomePage();
    NopcomRegisterPage nopcomRegisterPage = new NopcomRegisterPage();
    //loginpage login = new loginpage();
    //bayRegisterpage ebayRegisterpage = new EbayRegisterpage();
   // Searchpage sp = new Searchpage();


   /* @Given("^User is on ebay  homepage$")
    public void user_is_on_ebay_homepage() throws Throwable {


    }

    @When("^user enters valid  credentials on register page$")
    public void user_enters_valid_credentials_on_register_page() throws Throwable {
        System.out.println("I am inside registerpage");
        ebayRegisterpage.setRegisterbutton();
        ebayRegisterpage.setEmailfunctionality();
        ebayRegisterpage.setReemailfunctionality();
        ebayRegisterpage.setFirstnamefunctionality();
        ebayRegisterpage.setLastfunctionality();
        ebayRegisterpage.setPassfunctionality();
        ebayRegisterpage.setAddphonefunctionality();


    }

    @Then("^user successfully registered on register page$")
    public void user_successfully_registered_on_register_page() throws Throwable {
        ebayRegisterpage.addbutton();

    }

//serach product count
@Given("^user is on ebay  Homepage$")
public void user_is_on_ebay_Homepage() throws Throwable {

}

    @When("^user should search for the product with keyword \"([^\"]*)\"$")
    public void user_should_search_for_the_product_with_keyword(String arg1) throws Throwable {
     sp.setQuantityadded("4");
    }

    @When("^user should able to (\\d+) of the product in basket$")
    public void user_should_able_to_of_the_product_in_basket(int arg1) throws Throwable {

    }

    @Then("^user should get total count of the product added in basket$")
    public void user_should_get_total_count_of_the_product_added_in_basket() throws Throwable {

    }*/
//scenario outline

    @Given("^I am in Registration page$")
    public void i_am_in_Registration_page() throws Throwable {
        nopcomHomePage.register();



    }

    @When("^I select \"([^\"]*)\" in Personal details$")
    public void i_select_in_Personal_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        nopcomRegisterPage.genderbutton();
    }

    @When("^I enter \"([^\"]*)\"$")
    public void i_enter(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        nopcomRegisterPage.setFirstname(arg1);
    }

    @When("^I will enter \"([^\"]*)\"$")
    public void i_will_enter(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.setLastname(arg1);
    }

    @When("^I enter date of birth \"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
    public void i_enter_date_of_birth_and(String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.dateofbirthday(arg1, arg2, arg3);
    }

    @When("^then I enter \"([^\"]*)\"$")
    public void then_I_enter(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.setEmail(arg1);
    }

    @When("^in Company details I enter \"([^\"]*)\"$")
    public void in_Company_details_I_enter(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.setCompany(arg1);
    }

    @When("^in Options deselect the box$")
    public void in_Options_deselect_the_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.setNewsletter();
    }

    @When("^in your password if I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void in_your_password_if_I_enter_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.setPassword(arg1, arg2);
    }

    @When("^if I click the Register button$")
    public void if_I_click_the_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
nopcomRegisterPage.submitbutton();
    }

    @Then("^I should see a successful message$")
    public void i_should_see_a_successful_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
