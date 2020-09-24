package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.findElementByXPath("//img[@class='wp-categories-icon svg-image' and @src='images/link.png']").click();
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		Thread.sleep(2000);
		String Error =driver.getCurrentUrl();
        String ExpectedURL = "http://leafground.com/pages/error.html";
        
        if (Error .equalsIgnoreCase( ExpectedURL))
        {
        	System.out.println("Error page displayed");
        }
        else{
        	System.out.println("we are in wrong page");
        }
       driver.close();
	}

}
