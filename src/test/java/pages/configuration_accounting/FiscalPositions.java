package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FiscalPositions {
    public FiscalPositions(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement pageName;

    @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Fiscal Positions')]")
    public WebElement fiscalPosLink;





}
