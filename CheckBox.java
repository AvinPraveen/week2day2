package Week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		  driver.findElementByXPath("//label[text()='Select the languages that you know?']/following::input").click();
		  driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[3]").click();
		  driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[4]").click();
		  
		  boolean b = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input").isSelected();
		  System.out.println("True is selected: "+b);
		  
		  WebElement desel = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]");
		  boolean selected = desel.isSelected();
		  if(selected==true)
		  {
			  desel.click();
			  System.out.println("Now its deselected the check box");
		  }
		  
		  //WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		  WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]");
		  driver1.click();
		  Thread.sleep(1000);
		    WebElement driver2=driver.findElementByXPath("(//input[@type='checkbox'])[10]");
		    driver2.click();
		    Thread.sleep(1000);
		    WebElement driver3= driver.findElementByXPath("(//input[@type='checkbox'])[11]");
		    driver3.click();
		    Thread.sleep(1000);
		    WebElement driver4= driver.findElementByXPath("(//input[@type='checkbox'])[12]");
		    driver4.click();
		    Thread.sleep(1000);
		    
		    WebElement driver5=  driver.findElementByXPath("(//input[@type='checkbox'])[13]");
		    driver5.click();
		    Thread.sleep(1000);
		    System.out.println("All check box is selected");
		    driver.close();
		  
		  
		  

	}

}
