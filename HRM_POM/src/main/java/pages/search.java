package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class search {
	WebDriver driver;

    By pim = By.xpath("//*[@id='menu_pim_viewPimModule']/b");
    By serE = By.xpath("//*[@id='menu_pim_viewEmployeeList']");
    By id =By.xpath("//*[@id='empsearch_id']");
    By btn =By.xpath("//*[@id='searchBtn']");
    
    
    
    

public search(WebDriver driver){

        this.driver = driver;

}



//Click on pim

public void clickPIM(){

      driver.findElement(pim).click();

}
//Click on add employee

public void clickSearch(){

      driver.findElement(serE).click();

}

//Set password in password textbox

public void setID(String ID){

	driver.findElement(id).clear();
   driver.findElement(id).sendKeys(ID);

}

//Click on login button

public void clickSr(){

        driver.findElement(btn).click();

}




public void searchEmployee(String ID){

	//Click PIM

    this.clickPIM(); 
    
  //Click add employee

    this.clickSearch(); 

  //Fill id

    this.setID(ID);

    //Click Login button

    this.clickSr();        
}

}
