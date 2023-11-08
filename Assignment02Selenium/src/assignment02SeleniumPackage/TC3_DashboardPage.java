package assignment02SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_DashboardPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		WebDriver browserObject = new ChromeDriver();

		String url = "http://demo.itlearn360.com/";
	    String usr = "Demo12";
	    String pwd = "Test123456$";

		//1
		browserObject.get(url);

		//2
		browserObject.findElement(By.id("loginlabel")).click();
		Thread.sleep(3000);

		//3
	    browserObject.findElement(By.id("user_login")).sendKeys(usr);
	    browserObject.findElement(By.id("user_pass")).sendKeys(pwd);
	    
	    //4
	    browserObject.findElement(By.id("wp-submit")).submit();

	    //5
//	    browserObject.findElement(By.xpath("//a[@class='http://demo.itlearn360.com/user-profile/Demo12']")).click();
	    browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a")).click();
	    
	    //6
	    //?
	}

}
