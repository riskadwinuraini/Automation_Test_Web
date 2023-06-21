package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OfficePage extends PageObject {

    private By title(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[2]/h1");
    }
    @Step
    public void validateOnOfficePage(){
        $(title()).isDisplayed();
    }
}
