package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateOffice extends PageObject {

    private By SidebarOfficeName(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[1]/a[2]/ul/li");
    }

    private By ButtonCreateOffice(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/button");
    }
    private By officeField(){
        return By.xpath("//*[@id=\"officeName\"]");
    }
    private By addressField(){
        return By.xpath("//*[@id=\"address\"]");
    }
    private By descriptionField(){
        return By.xpath("//*[@id=\"description\"]");
    }
    private By priceField(){
        return By.xpath("//*[@id=\"price\"]");
    }
    private By capacityField(){
        return By.xpath("//*[@id=\"capacity\"]");
    }
    private By openField(){
        return By.xpath("//*[@id=\"openTime\"]");
    }
    private By closeField(){
        return By.xpath("//*[@id=\"closeTime\"]");
    }
    private By facilitiesField(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/div/form/div[7]/div[1]/div");
    }

    private By CreateOfficeButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/div/form/button");
    }
    @Step
    public void ClickSidebarOfficeName(){
        $(SidebarOfficeName()).click();
    }
    @Step
    public void ClickButtonCreateOffice(){
        $(ButtonCreateOffice()).click();
    }
    @Step
    public void inputOffice(String office){
        $(officeField()).type(office);
    }
    @Step
    public void inputPrice(String price){
        $(priceField()).type(price);
    }

    @Step
    public void inputCapacity(String capacity){
        $(capacityField()).type(capacity);
    }
    @Step
    public void inputOpen(String OpenTime){
        $(openField()).type(OpenTime);
    }
    @Step
    public void inputClose(String CloseTime){
        $(closeField()).type(CloseTime);
    }
    @Step
    public void ClickFacilities(){ $(facilitiesField()).click();}

    @Step
    public void inputDescription(String description){
        $(descriptionField()).type(description);
    }
    @Step
    public void inputAddress(String address){
        $(addressField()).type(address);
    }

    @Step
    public void ClickCreateOfficeButton(){
        $(CreateOfficeButton()).click();
    }


}
