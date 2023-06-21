package starter.OfficeBuddy;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By emailField(){
        return By.xpath("//*[@id=\"email\"]");
    }
    private By passwordField(){
        return By.xpath("//*[@id=\"password\"]");
    }
    private By loginButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/button");
    }


    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }
    @Step
    public void validateOnLoginPage(){
        $(loginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void ClickLoginButton(){
        $(loginButton()).click();
    }


}
