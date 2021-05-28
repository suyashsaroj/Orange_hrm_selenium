package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add {
	WebDriver driver;

    By pim = By.xpath("//*[@id='menu_pim_viewPimModule']/b");
    By adde = By.xpath("//*[@id='menu_pim_addEmployee']");
    By fname = By.name("firstName");
    By mname = By.name("middleName");
    By lname = By.name("lastName");
    By id =By.xpath("//*[@id='employeeId']");
    By btn =By.xpath("//*[@id='btnSave']");
    
    
    
    

public add(WebDriver driver){

        this.driver = driver;

}



//Click on pim

public void clickPIM(){

      driver.findElement(pim).click();

}
//Click on add employee

public void clickAdd(){

      driver.findElement(adde).click();

}

public void setFirstName(String strFstName){

    driver.findElement(fname).sendKeys(strFstName);

}
public void setMidName(String strMidName){

    driver.findElement(mname).sendKeys(strMidName);

}

//Set password in password textbox

public void setLastName(String strLstName){

     driver.findElement(lname).sendKeys(strLstName);

}

//Set password in password textbox

public void setID(String ID){

	driver.findElement(id).clear();
   driver.findElement(id).sendKeys(ID);

}

//Click on login button

public void clickSave(){

        driver.findElement(btn).click();

}




public void addEmployee(String strFstName,String strMidName,String strLstName,String ID){

	//Click PIM

    this.clickPIM(); 
    
  //Click add employee

    this.clickAdd(); 
	
    //Fill user name

    this.setFirstName(strFstName);

  //Fill middle name

    this.setMidName(strMidName);
    //Fill last name

    this.setLastName(strLstName);
  //Fill id

    this.setID(ID);

    //Click Login button

    this.clickSave();        
}

}
