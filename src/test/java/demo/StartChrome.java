package demo;
 
import tests.Calc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Resources.BrowserStackTestNGTest;
import Resources.GlobalVariables;
import WebElements.LoginElements;;
 
public class StartChrome extends BrowserStackTestNGTest{
 
 	
 	@Test
 	public void Signin(){ 
 		
 		/*
 		 How to upload app(browserStack)
 		 curl -u "eldercerrato3:kTN3uKCew9NSNqk5AdBh" -X POST "https://api-cloud.browserstack.com/app-automate/upload" -F "file=@/Users/rickycasco/Downloads/Evernote.apk"
		 bs://7035f1127ff77e6129704661f0aedea2956b7875
 		*/
 		//Instance Declaration
 		Calc Calc1 = new Calc();
 		LoginElements login = new LoginElements(driver,wait);
 		GlobalVariables variables = new GlobalVariables();
 		
 	
 		login.LoginMethodEmulator(variables.EmailSuccess, variables.PasswordSuccess);
 		Calc1.timer1(10);
 		
 		
 		  		  					
 		}
 	
}