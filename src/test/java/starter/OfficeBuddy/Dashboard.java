package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {
    private By dashboardTitle(){
        return By.xpath("/html/body/div[1]/div[2]");
    }
    @Step
    public void validateOnTheHomePage(){
        $(dashboardTitle()).isDisplayed();
    }
}
