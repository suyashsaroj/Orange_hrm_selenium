package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class login {

    WebDriver driver;

    By Name = By.name("txtUsername");
    By password = By.name("txtPassword");
    By login = By.xpath("//*[@id='btnLogin']");

    public login(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(Name).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

         driver.findElement(password).sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            driver.findElement(login).click();

    }



    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void loginHRM(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        
    }

}
