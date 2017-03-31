package project.cucumber.practicesession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 17/02/2017.
 */
public class NopcomRegisterPage extends Drivermanager {

    @FindBy(id ="gender-female")
    private WebElement fgender;


    @FindBy(id = "FirstName")
    private WebElement firstname;

    @FindBy (id ="LastName")
    private WebElement lastname;


    @FindBy (name ="DateOfBirthDay")
    private WebElement dobday;

    @FindBy (name = "DateOfBirthMonth")
    private WebElement dobmonth;

    @FindBy (name = "DateOfBirthYear")
    private WebElement dobyear;

    @FindBy (id = "Email")
    private WebElement email;


    @FindBy (id = "Company")
    private WebElement company;

    @FindBy (id = "Newsletter")
    private WebElement newsletter;

    @FindBy (id = "Password")
    private WebElement password;


    @FindBy (id = "ConfirmPassword")
    private WebElement confirmpass;

    @FindBy(id = "register-button")
    private WebElement submit;

    public void genderbutton()
    {
        fgender.isSelected();
    }

    public void setFirstname(String Firstname)
    {
        firstname.click();
        firstname.sendKeys(Firstname);

    }

    public void setLastname(String Lastname)
    {
        lastname.click();
        lastname.sendKeys(Lastname);
    }


    public void  dateofbirthday(String day,String month,String year)
    {
        // dobday.click();
        dobday.sendKeys("27");


        //public void  dateofbirthmon()

        //dobmonth.click();
        dobmonth.sendKeys("March");


        // public void  dateofbirthyear()

        //dobyear.click();
        dobyear.sendKeys("1989");
    }

    public void setEmail(String mel )
    {
        email.click();
        // email.sendKeys("slohare@yahoo.co.uk");
        email.sendKeys(mel);
    }

    public void setCompany(String Company)
    {
        company.click();
        company.sendKeys(Company);
    }

    public void setNewsletter()
    {
        newsletter.isSelected();
    }

    public void setPassword(String pwd,String repwd)
    {
        //password.click();
        password.sendKeys("shilpa2302");

        //public void setConfirmpass()

        // confirmpass.click();
        //  confirmpass.sendKeys("guddi123");
        confirmpass.sendKeys("shilpa2302");
    }

    public void submitbutton()
    {
        submit.click();
    }

}
