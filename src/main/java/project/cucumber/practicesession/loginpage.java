package project.cucumber.practicesession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 10/02/2017.
 */
public class loginpage extends Drivermanager {

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "next")
    private WebElement nextbutton;

    @FindBy(css = "div[class*='form-panel second']>input[id='Passwd']")
    private WebElement password;

    @FindBy(id = "signIn")
    private WebElement signbutton;


    public void setEmail() {
        email.click();
        email.sendKeys("sshedbale2802@gmail.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setNextbutton() throws InterruptedException {
        nextbutton.click();
        Thread.sleep(2000);
    }

    public void setPassword(String pPassword) throws InterruptedException {

        password.clear();
        Thread.sleep(2000);
        password.sendKeys(pPassword);

    }

    public void setSignbutton() {
        signbutton.click();
    }


    @FindBy(css = "img[alt='Flipkart']")
    private WebElement flipKartHomePageIcon;

    public String flipKartLogo() {
        return flipKartHomePageIcon.getAttribute("title");
    }


}
