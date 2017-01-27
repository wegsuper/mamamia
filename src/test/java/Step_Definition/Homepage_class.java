package Step_Definition;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Helperclass.Homepage_helper;
import Util.Homepageinterface;



// 07450201408 name as will

public class Homepage_class implements Homepageinterface {
	static String Base_url;
	public static WebDriver driver;
	
	 public Homepage_class(){
		 Homepage_class.driver = Homepage_helper.driver;
	 }
	
	Homepage_helper Homepage = new Homepage_helper();
	
	//@ mean annotation which means what the programme should do
	// This mean you want the test to perform an action before it runs.
	@BeforeClass
	public static void setup(){
		Base_url = main_url;
		
	}
	
	
	@Test
	public void trade_your_jet() throws InterruptedException{
		Homepage.base_setup();
		Homepage.get_browser(Base_url);
		Homepage.do_click(Nav_1_trade_your_jet);
		Homepage.sendkeys(purchase_price_selector, purchase_price);
		Homepage.sendkeys(current_worth_selector, current_worth);
		Homepage.sendkeys(fligh_time_selector, fligh_time);
		Homepage.do_click(Submit_button);
	}
	@Test
	public void trade(){
		Homepage.get_browser(Base_url);
		Homepage.get_browser(Base_url);
		Homepage.do_click(Nav_2_Book_your_jet);
	}
	
	
	@AfterClass
    public static void close_browser(){
    	driver.close();
    }
}
