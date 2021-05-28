package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	WebDriver driver;

    @FindBy(xpath="//*[@id='welcome']")

    WebElement click1;

    @FindBy(xpath="//*[@id='welcome-menu']/ul/li[3]/a")

    WebElement click2;    

    public logout(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }



//Click on menu

public void step1(){

	click1.click();

}

//Click on logout

public void step2(){
	System.out.println("logout done");
	click2.click();
	 

}




public void LogOut(){

	//Click menu

    this.step1(); 
    

    //Click logout

    this.step2();   
}




}
