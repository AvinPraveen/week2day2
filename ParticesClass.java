package Week2.day2;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParticesClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Browser Verification Element
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * String currentUrl = driver.getCurrentUrl(); System.out.println(currentUrl);
		 * 
		 * String pageSource = driver.getPageSource(); System.out.println(pageSource);
		 */
		
		// finish the Brower Element
				
		
		/*
		 * WebElement username =driver.findElementById("username");
		 * username.sendKeys("demosalesmanager");
		 * 
		 * // calling Password using BYName & set the password as crmsfa
		 * driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		 * 
		 * //Login the screen using class Name
		 * driver.findElementByClassName("decorativeSubmit").click();
		 */
		
		// Attribute Verification 
		/*
		 * String text = driver.findElementByTagName("h2").getText();
		 * System.out.println(text);
		 * 
		 * String attribute = driver.findElementById("username").getAttribute("class");
		 * System.out.println(attribute);
		 * 
		 * Dimension size = driver.findElementByClassName("decorativeSubmit").getSize();
		 * System.out.println(size); System.out.println(size.getHeight());
		 * System.out.println(size.getWidth());
		 * 
		 * Point location =
		 * driver.findElementByClassName("decorativeSubmit").getLocation();
		 * System.out.println(location); System.out.println(location.getX());
		 * System.out.println(location.getY());
		 */
		
		// Element is get selected in webapplication or not and if its selected the return type is BOOLEAN
		/*
		 * isDisplay(); isEnable(); isSelected();
		 */
		driver.get("http://leafground.com/pages/checkbox.html");
		 boolean displayed = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input").isDisplayed();
		 Thread.sleep(2000);
		
		System.out.println(displayed);
		/*
		 * boolean displayed =
		 * driver.findElementByClassName("decorativeSubmit").isDisplayed();
		 * System.out.println(displayed);
		 */
		
		/*
		 * boolean enable =
		 * driver.findElementByClassName("decorativeSubmit").isEnabled();
		 * System.out.println(enable);
		 * 
		 * boolean
		 * selected=driver.findElementByClassName("decorativeSubmit").isSelected();
		 * System.out.println(selected)
		 */;
	}

}
