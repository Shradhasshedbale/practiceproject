package project.cucumber.practicesession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 17/02/2017.
 */
public class NopcomHomePage extends Drivermanager {
    @FindBy(linkText = "Register")
    // @FindBy(className = "ico-register")
    public WebElement registerlinkbutton;


       /* public void checkTitle(){
            String title= dri.getTitle();
            System.out.println(" The title of the page is -->>" + title);
            //webdriver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        }*/

    public void register(){
        registerlinkbutton.click();
        registerlinkbutton.getText();
        System.out.println("The button Register got clicked -->"+registerlinkbutton.getText() );
    }

}
