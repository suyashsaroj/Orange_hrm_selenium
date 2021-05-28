package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	WebDriver driver;

    By s1 = By.xpath("//*[@id='welcome']");
    By s2 =By.xpath("//*[@id='welcome-menu']/ul/li[3]/a");

public logout(WebDriver driver){

        this.driver = driver;

}



//Click on menu

public void step1(){

      driver.findElement(s1).click();

}

//Click on logout

public void step2(){

        driver.findElement(s2).click();

}




public void LogOut(){

	//Click menu

    this.step1(); 
    

    //Click logout

    this.step2();        
}




}
