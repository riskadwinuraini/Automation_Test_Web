package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteOffice extends PageObject {
    private By ButtonDeleteOffice(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[4]/td[5]/div/button[2]/span");
    }
    private By BackDeleteButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/div[2]/button[1]");
    }
    private By YesDeleteButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/div[2]/button[2]");
    }

    @Step
    public void ClickDeleteOfficeButton(){
        $(ButtonDeleteOffice()).click();
    }
    @Step
    public void ClickBackDeleteOfficeButton(){
        $(BackDeleteButton()).click();
    }
    @Step
    public void ClickYesDeleteOfficeButton(){
        $(YesDeleteButton()).click();
    }


}
