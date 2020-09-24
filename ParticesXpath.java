package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticesXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Xpath for partices

		driver.get("http://leaftaps.com/opentaps/control/main");

		/*
		 * // first element without using attribute only tagname is used
		 * driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		 * 
		 * //attribute xpath driver.findElementByXPath("//input[@id='password']");
		 * 
		 * //Mutiple attribute Xpath
		 * driver.findElementByXPath("//input[@id='password'][@size='50']");
		 * 
		 * //operator Mutiple attribute xpath
		 * 
		 * driver.findElementByXPath("//input[@id='password'and @size='50']");
		 * driver.findElementByXPath("//input[@id='password'or @size='50']");
		 * 
		 * 
		 * // Text base Xpath only black color text will identify
		 * driver.findElementByXPath("//lable[text()='Username']");
		 * 
		 * //Partial match using Attribute -- if attribute have a value which is static
		 * driver.findElementByXPath("//input[contains(@id,'pass')]");
		 * 
		 * //collection based Xpath driver.findElementByXPath("(//input)[2]");
		 * //collection based Xpath using attribute
		 * driver.findElementByXPath("(//input[@class='inputLogin'])[2]");
		 */
		
		
		  //class session assignment
		  driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		  driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		  driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		  driver.findElementByXPath("//div[@id='label']").click();
		 
		
		
		
		
		/*
		 * //AXES/ RELEATIONSHIP XPATH // i want to goto form under first parent
		 * driver.findElementByXPath("//form[@id='login']/p"); // i want to goto form
		 * under third parent use index
		 * driver.findElementByXPath("//form[@id='login']/p[3]"); // i want to goto form
		 * under first parent using attribute
		 * driver.findElementByXPath("//form[@id='login']/p[@class='top']");
		 * 
		 * 
		 * //GRANDPARENT TO GRAND CHILD // I WANT TO GOTO FORM TO GRAND CHILD LABLE USE
		 * DOUBLE SLASH //; driver.findElementByXPath("//form[@id='login']//lable"); //
		 * i want to goto form to 2nd grnad child used double slash and use index IT
		 * WILL WORK UNDER SINGLE PARENT
		 * driver.findElementByXPath("//form[@id='login']//lable[2]"); //IF DRIFFETNET
		 * PARENT USE COLLECTION
		 * driver.findElementByXPath("(//form[@id='login']//label)[2]");
		 * 
		 * //CHILD TO PARENT // xpathofchild/keyword_parent::tagname
		 * driver.findElementByXPath("//input[@id='password']/parent::p"); //withour
		 * keyword driver.findElementByXPath("//input[@id='password']/..");
		 * 
		 * //GRND CHILD TO GRAND PARENT
		 * //xpathof_grandchild/keyword_ancestor::tagname_of_grandParent
		 * driver.findElementByXPath("//input[@id='password']/ancestor::form");
		 * //without using keyword
		 * driver.findElementByXPath("//input[@id='password']/../..");
		 * 
		 * //SIBLING //ELDER SIBLING TO YOUNGER SIBLING //IF WE TRAVEL BOTTOM THEN USE
		 * KEYWORD "FOLLWOING'
		 * driver.findElementByXPath("//label[@for='password']/following-sibling::input"
		 * ); //using text //driver.findElementByXPath(
		 * "//option[text()='selectyourprogram']/following-sibling::option[2]"); //or
		 * //driver.findElementByXPath(
		 * "//option[text()='selectyourprogram']/following-sibling::option[text()='pen']"
		 * );
		 * 
		 * 
		 * //YOUNGER SIBLING TO ELDER SIBLING //TRAVEL TO TOP //keyword
		 * preceding-sibling
		 * 
		 * //driver.findElementByXPath(
		 * "//input[@id='username']/preceding-sibling::label");
		 * 
		 * //Elder COUSIN TO YOUNGER COUSIN // TRAVEL TO BOTTON //KEYWORD FOLLOWING
		 * driver.findElementByXPath("//label[@for='username']/following::label");
		 * 
		 * //younger cousin to elder cousin //travel to top // keyword preceding
		 * driver.findElementByXPath("//input[@id='password']/preceding::input");
		 */	
		
	}

}
