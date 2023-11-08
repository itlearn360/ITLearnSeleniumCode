package assignment02SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_VerifyLoginClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	       ChromeDriver browserObject = new ChromeDriver();

		String url = "http://demo.itlearn360.com/";
	    String usr = "Demo12";
	    String pwd = "Test123456$";
		
		//1
		browserObject.get(url);

		//2
		browserObject.findElement(By.id("loginlabel")).click();
//why?
		Thread.sleep(3000);

		//3
//	    String str = usr + Keys.TAB + pwd;
//	    Alert alert1 = browserObject.switchTo().alert();
//	    alert1.sendKeys(str);
		WebElement username = browserObject.findElement(By.id("user_login"));
		WebElement password = browserObject.findElement(By.id("user_pass"));
		username.clear();
		password.clear();
		username.sendKeys(usr);
		password.sendKeys(pwd);
	    
	    //4
//	    alert1.accept();
	    browserObject.findElement(By.id("wp-submit")).submit();
	}

}
