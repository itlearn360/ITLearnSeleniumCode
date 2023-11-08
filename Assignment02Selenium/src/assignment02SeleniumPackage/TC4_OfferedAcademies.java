package assignment02SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_OfferedAcademies {

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
	    browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a")).click();
	    	    
	    //6
	    //?
	    
	    //7 Must maximize window
		browserObject.manage().window().maximize();
	    browserObject.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/main/article/div/div[1]/div/div[1]/ul/li[3]/a")).click();
	    
	    //8 Must scroll down
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,250)", "");    
	    browserObject.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	}

}
