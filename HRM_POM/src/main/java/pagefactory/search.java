package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	WebDriver driver;

    
    @FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")

    WebElement PIM;
    
    @FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']")

    WebElement empList;

    @FindBy(xpath="//*[@id='empsearch_id']")

    WebElement eid;    

    @FindBy(xpath="//*[@id='searchBtn']")

    WebElement search;

    public search(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
    
    }
    



//Click on pim
    public void clickPIM(){

    	PIM.click();     
     }

//Click on search

    public void clickSearch(){

    	empList.click();     
     }

//Set password in password textbox

public void setID(String ID){

	eid.clear();
  eid.sendKeys(ID);

}

//Click on login button

public void clickSr(){
	System.out.println("search employee done");
	search.click();
	 

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
