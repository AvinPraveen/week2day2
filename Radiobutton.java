package Week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
//		Thread.sleep(2000);
		driver.findElementById("yes").click();
		// Find default selection---- not working
		/*
		 * boolean actual =
		 * driver.findElementByXPath("(//input[@name='news'])[2]").isSelected();
		 * System.out.println(actual); if (actual == true) {
		 * System.out.println("Checked is selected"); } else {
		 * System.out.println("Unchecked is selected"); }
		 */

		
		  //second radio button
		  
		  boolean b=
		  driver.findElementByXPath("(//input[@value='1'])[2]").isSelected();
		  
		  if(b==true) { System.out.println("It is selected");
		  
		  } else { System.out.println("it is not selected");
		  
		  }
		  
		 

//third radio button
			/*
			 * goes wrong
			 * boolean r1 =
			 * driver.findElementByXPath("((//input[@value='0'])[3]").isSelected();
			 * System.out.println(r1); boolean r2 =
			 * driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected();
			 * boolean r3 =
			 * driver.findElementByXPath("(//input[@class='myradio'])[5]").isSelected();
			 * System.out.println(r1+" "+r2+" "+r3);
			 */
			/*
			 * WebElement radio1 = driver.findElementByXPath("((//input[@value='0'])[3]");
			 * boolean r1 = radio1.isSelected(); System.out.println(r1); WebElement radio2 =
			 * driver.findElementByXPath("(//input[@class='myradio'])[4]"); boolean r2 =
			 * radio2.isSelected(); System.out.println(r2); WebElement radio3 =
			 * driver.findElementByXPath("(//input[@class='myradio'])[5]"); boolean
			 * r3=radio3.isSelected(); System.out.println(r3);
			 * 
			 * 
			 * if (r1 == true) { System.out.println("1-20year is selected"); } else if (r2
			 * == true) { System.out.println("20-40 year is selected");
			 * 
			 * } else if (r3 == true) { System.out.println("Above 40 is selected"); } else {
			 * System.out.println("selected some thing in radio button"); }
			 */
		  WebElement radio1=driver.findElementByXPath("(//input[@value='0'])[3]");
	        WebElement radio2=driver.findElementByXPath("(//input[@class='myradio'])[4]");
	        WebElement radio3=driver.findElementByXPath("(//input[@class='myradio'])[5]");
	        //boolean check1=radio1.isSelected();
	        boolean check2=radio2.isSelected();
	        //boolean check3=radio3.isSelected();
	        if(check2==true)
	       {  
	    	   radio1.click();
	          	Thread.sleep(1000);
	       	System.out.println("1-20years selected");
	        radio3.click();
	       	Thread.sleep(1000);
	    	System.out.println("Above 40years selected");
	    	radio2.click();
	    	Thread.sleep(1000);
	    	System.out.println("21-40years selected");
	       }
	        driver.close();
	}
}
