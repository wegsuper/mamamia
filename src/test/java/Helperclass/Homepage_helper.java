package Helperclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Step_Definition.Homepage_class;

public class Homepage_helper {
	public static WebDriver driver = new FirefoxDriver(); 

	
	
	  
	  
	
	public void base_setup(){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	public void get_browser(String text){
		driver.get(text);
	}
	
	public void do_click (String text){
		driver.findElement(By.id(text)).click();
	}
	public void sendkeys(String text0, String text1){
		driver.findElement(By.id(text0)).sendKeys(text1);

	}
	
	
}
