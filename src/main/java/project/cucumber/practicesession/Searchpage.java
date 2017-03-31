package project.cucumber.practicesession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 16/02/2017.
 */
public class Searchpage extends Drivermanager {

@FindBy(xpath = ".//*[@id='gh-ac']")
    private WebElement searchtextbox;
@FindBy (xpath = ".//*[@id='item41bd79ff69']/h3/a")
 private WebElement searchedproduct;
@FindBy (xpath = ".//*[@id='qtyTextBox']")
private WebElement quantityadded;


public void setSearchtextbox()
{
    searchtextbox.sendKeys("watches");
}

public void setSearchedproduct()
{
    searchedproduct.click();
}

public void setQuantityadded(String s)
{

    quantityadded.getSize();
}
}
