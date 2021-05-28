package pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class add {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")

    WebElement pim;
    
    @FindBy(xpath="//*[@id='menu_pim_addEmployee']")

    WebElement addClick;

    @FindBy(xpath="//*[@id='firstName']")

    WebElement fname; 
    
    @FindBy(xpath="//*[@id='middleName']")

    WebElement mname; 
    
    @FindBy(xpath="//*[@id='lastName']")

    WebElement lname; 
    
    @FindBy(xpath="//*[@id='employeeId']")

    WebElement eid;

    @FindBy(xpath="//*[@id='btnSave']")

    WebElement save;

    public add(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

  //Click on pim

    public void clickPIM(){

          pim.click();

    }
    //Click on add employee

    public void clickAdd(){

    	addClick.click();

    }

    public void setFirstName(String strFstName){

        fname.sendKeys(strFstName);

    }
    
    public void setMidName(String strMidName){

    	mname.sendKeys(strMidName);

    }
    
    public void setLastName(String strLstName){

        lname.sendKeys(strLstName);

    }

    //Set password in password textbox

    public void setID(String ID){

    	eid.clear();
       eid.sendKeys(ID);

    }

    //Click on login button

    public void clickSave(){
    	System.out.println("add employee done");
    	save.click();
    	 

    }

    //Get the title of Login Page


    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

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
