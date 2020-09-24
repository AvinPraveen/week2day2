package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current Url of the back"+currentUrl);
		Thread.sleep(1000);
		driver.findElementByXPath("//img[@src='../images/home.png']").click();
		driver.navigate().back();
	
		
		// or 
	//	driver.findElementByXPath("//img[@class='wp-categories-icon svg-image'and @src='images/image.png']").click();
		
		driver.findElementByXPath("//img[@src='../images/abcd.jpg']").click();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("The current Url of the back"+currentUrl2);
		if(currentUrl.equals(currentUrl2))
		{System.out.println("Am i broken is true");}
		else {System.out.println("am i broken is false");}
		driver.navigate().refresh();
		
		WebElement clickimge = driver.findElementByXPath("//img[@src='../images/keyboard.png']");
		// for using Mouse or keybord we have to call Class call ACTION
		Actions img=new Actions(driver);
		
		img.moveToElement(clickimge).click(clickimge).perform();
		
		System.out.println("the current page Url: "+driver.getCurrentUrl());
		driver.close();
		
		
	}

}
