package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditOffice extends PageObject {

    private By ButtonEditOffice(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[5]/div/button[1]");
    }
    private By descriptionOfficeField(){ return By.xpath("//*[@id=\"description\"]");
    }
    private By priceOfficeField(){ return By.xpath("//*[@id=\"price\"]");
    }


    //*[@id="description"]
    private By UpdateOfficeButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/div/form/button");
    }
    private By BackUpdateButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[4]/div/div[2]/button[1]");
    }
    private By YesUpdateButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[4]/div/div[2]/button[2]");
    }

    @Step
    public void ClickEditOfficeButton(){
        $(ButtonEditOffice()).click();
    }

    @Step
    public void inputUpdateDescriptions(String descriptions){
        $(descriptionOfficeField()).type(descriptions);
    }
    @Step
    public void inputUpdatePrices(String prices){
        $(priceOfficeField()).type(prices);
    }
    @Step
    public void ClickUpdateOfficeButton(){
        $(UpdateOfficeButton()).click();
    }
    @Step
    public void ClickBackUpdateOfficeButton(){
        $(BackUpdateButton()).click();
    }
    @Step
    public void ClickYesUpdateOfficeButton(){
        $(YesUpdateButton()).click();
    }




}
