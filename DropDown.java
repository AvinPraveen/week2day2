package Week2.day2;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//use id to select the dropdown store in webelement
		WebElement drop1 = driver.findElementById("dropdown1");
		//use Select class to store option values
		Select dd1=new Select(drop1);
		//use index for dropdown index start at 0 only in xpath index start at 1
		dd1.selectByIndex(1);
		WebElement drop2 = driver.findElementByName("dropdown2");
		Select dd2=new Select(drop2);
		dd2.selectByVisibleText("Selenium");
		WebElement drop3 = driver.findElementByName("dropdown3");
		Select dd3=new Select(drop3);
		dd3.selectByValue("1");
		//WebElement ls = driver.findElementByClassName("dropdown");
		 Select drop= new Select(driver.findElementByClassName("dropdown"));
		 List<WebElement> options = drop.getOptions();
		 int size = options.size();
		 
		
		// int size= listsize.size();
		//Select sz=new Select(dropsize);
		//List<WebElement> list = sz.getAllSelectedOptions();
		//int size = list.size();
		System.out.println("the size of the drop down "+size);
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/..").sendKeys("Selenium");
		//driver.findElementByXPath("//div[@id='contentblock']/section/div[6]/select/option[2]").click();
		Select newsss =new Select(driver.findElementByXPath("(//div[@class='example']/select)[6]"));
		newsss.selectByVisibleText("Selenium");
		
		  List<WebElement> options2 = newsss.getOptions(); for(int
		  i=0;i<options2.size();i++) { WebElement element = options2.get(i); String
		  string = element.getText(); System.out.println(string);
		  
		  }
		 
		}
		
		//driver.close();
		
		}




