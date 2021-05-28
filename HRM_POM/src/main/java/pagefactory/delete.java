package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class delete {
	WebDriver driver;

    @FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[1]/input")

    WebElement del;

    @FindBy(xpath="//*[@id='btnDelete']")

    WebElement click1;    

    @FindBy(xpath="//*[@id='dialogDeleteBtn']")

    WebElement click2;

    public delete(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }




//Click on checkbox

public void checkBox(){

      del.click();

}

//Click on delete button1

public void del1(){

        click1.click();

}
//Click on delete button2

public void del2(){
	System.out.println("delete employee done");
   click2.click();
   
}




public void delEmp(){

	//Click PIM

    this.checkBox(); 
    

    //Click Login button1

    this.del1();   
    
  //Click Login button2

    this.del2();   
}

}
