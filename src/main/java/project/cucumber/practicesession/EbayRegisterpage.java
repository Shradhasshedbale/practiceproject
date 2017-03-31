package project.cucumber.practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by SHRADHA on 10/02/2017.
 */
public class EbayRegisterpage extends Drivermanager {

    @FindBy(linkText = "register")
    private WebElement registerbutton;

   @FindBy(id = "email")
    private WebElement emailfunctionality;

    @FindBy(id = "remail")
    private WebElement reemailfunctionality;

    @FindBy(id = "PASSWORD")
    private WebElement passfunctionality;

    @FindBy(id = "firstname")
    private WebElement firstnamefunctionality;

    @FindBy(id = "lastname")
    private WebElement lastnamefunctionality;

    @FindBy(id = "phoneFlagComp1")
    private WebElement addphonefunctionality;

    @FindBy(id = "sbtBtn")
    private WebElement addbutton;


   public void setRegisterbutton()
   {
       registerbutton.click();
   }

   public void setEmailfunctionality()

   {
       emailfunctionality.click();
       emailfunctionality.sendKeys("slohare@yahoo.co.uk");
   }

    public void setReemailfunctionality()

    {
        reemailfunctionality.click();
        reemailfunctionality.sendKeys("slohare@yahoo.co.uk");
    }


    public void setPassfunctionality()

    {
        passfunctionality.click();
        passfunctionality.sendKeys("lohare123");
    }
    public void setFirstnamefunctionality()

    {
        firstnamefunctionality.click();
        firstnamefunctionality.sendKeys("shilpa");
    }

    public void setLastfunctionality()

    {
        lastnamefunctionality.click();
        lastnamefunctionality.sendKeys("lohare");
    }


    public void setAddphonefunctionality()

    {
        addphonefunctionality.click();
        addphonefunctionality.sendKeys("078346343443");
    }

    public void  addbutton()
    {
        addphonefunctionality.click();
        addphonefunctionality.submit();
    }

    //another type of method
    /*public String checkcount() {
        WebElement checkcount = driver.findElement(By.cssSelector("div[class*='aio']>span[class*='nU']>a[title* = 'Inbox']"));
        return checkcount.getAttribute("title");

        //step defination assert.assertequals.assert true


    }*/
}





