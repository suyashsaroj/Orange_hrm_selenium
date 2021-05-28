package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.add;

import pages.login;

import pages.search;
import pages.delete;
import pages.logout;

public class test {
			
	/*set chromedriver path here*/
  String driverPath = "D:\\zippy\\chromedriver.exe";
    
    WebDriver driver;
 
	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1, d2;

	String login, pwd, eid,fname,mname,lname;

	String wbmsg, xlmsg;

	String pass="Test case is Passed";

	String fail="Test case is Failed---xxxx---";

	int rowval, rowcount;
    login objLogin;

    add objAddEmp;
    
    search objSearchEmp;
    
    delete objDelete;
    
    logout objLogout;

    @BeforeTest

    public void setup() throws IOException{

    	System.setProperty("webdriver.chrome.driver", "D:\\zippy\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
    	/*set excel path here*/
    	FRead=new FileInputStream("D:\\orange_hrm.xlsx");
    	/*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);
    	/*XSSFSheet*/ sh= wb.getSheetAt(0);
    	rowcount=sh.getPhysicalNumberOfRows();
    }

    /**

     * This test case will login in https://opensource-demo.orangehrmlive.com/

     * Login to application

     */

    @Test(priority=0)

    public void testpages() throws InterruptedException, Exception{
    	for(rowval=1;rowval<rowcount;rowval++)
    	{
    	 login=sh.getRow(rowval).getCell(0).getStringCellValue();
    	 pwd=sh.getRow(rowval).getCell(1).getStringCellValue();
    	 fname=sh.getRow(rowval).getCell(2).getStringCellValue();
    	 mname=sh.getRow(rowval).getCell(3).getStringCellValue();
    	 lname=sh.getRow(rowval).getCell(4).getStringCellValue();
    	 eid=sh.getRow(rowval).getCell(5).getStringCellValue();
    //Create Login Page object
    objLogin = new login(driver);
    
    //login to application
    objLogin.loginHRM(login, pwd);
    
    // go the next page

    objAddEmp = new add(driver);

    //add employee

    objAddEmp.addEmployee(fname,mname,lname,eid);
    // go the next page

    objSearchEmp = new search(driver);

    //add employee

    objSearchEmp.searchEmployee(eid);
    // go the next page

    objDelete = new delete(driver);

    //add employee

    objDelete.delEmp();
    
    // go the next page
    
    objLogout = new logout(driver);
    // logout
    objLogout.LogOut();

    }
    }
}
