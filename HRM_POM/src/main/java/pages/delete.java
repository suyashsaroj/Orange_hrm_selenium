package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class delete {
	WebDriver driver;

    By delete = By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[1]/input");
    By btn1 =By.xpath("//*[@id='btnDelete']");
    By btn2 =By.xpath("//*[@id='dialogDeleteBtn']");

public delete(WebDriver driver){

        this.driver = driver;

}



//Click on checkbox

public void checkBox(){

      driver.findElement(delete).click();

}

//Click on delete button1

public void del1(){

        driver.findElement(btn1).click();

}
//Click on delete button2

public void del2(){

   driver.findElement(btn2).click();

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
