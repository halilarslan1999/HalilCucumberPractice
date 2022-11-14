package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage{


    @FindBy(id = "loginpage-input-email")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[.='Invalid Credentials!']")
    public WebElement warningMessage;

    @FindBy(id = "dashboard-h1")
    public WebElement dashboardText;

    @FindBy(xpath = "//*[text()='Please include a valid email!']")
    public WebElement warningMessageInclude;


    @FindBy(xpath = "//*[contains(text(),'valid')]")
    public WebElement warningMessageValid;


    @FindBy(css = ".menu-list")
    public List<WebElement> menuList;

    @FindAll({
            //or
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name="email")
    })
    public WebElement userInputSecondWay;


    @FindBys({
            //and
            @FindBy(tagName = "p"),
            @FindBy(id = "dashboard-user-icon")
    })
    public WebElement dashboardMessage;



    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }

    public void loginAsTeacher(){
        String username= ConfigurationReader.get("usernameTeacher");
        String password= ConfigurationReader.get("passwordTeacher");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        understandBtn.click();
        loginBtn.click();


        }
    public void loginAsStudent(){
        usernameInput.sendKeys(ConfigurationReader.get("usernameStudent"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordStudent"));
        understandBtn.click();
        loginBtn.click();

    }
    public void loginAsDeveloper(){
        usernameInput.sendKeys(ConfigurationReader.get("usernameDeveloper"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordDeveloper"));
        understandBtn.click();
        loginBtn.click();


    }

    public String  getDisapperingWarningMessage(String message){
        String actualMessage =null;

        if(message.contains("@")){
            actualMessage=usernameInput.getAttribute("validationMessage");
        }else if(message.contains("valid")) {
            actualMessage=warningMessageValid.getText();
        }
        return actualMessage;




    }


}
