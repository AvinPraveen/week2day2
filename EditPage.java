package Week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("praveen.avin@test.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
		String text = driver.findElementByXPath("(//input[@type='text'])[3]").getText();
		System.out.println("default text :"+text);
		driver.findElementByXPath("(//input[@type='text'])[4]").clear();
		boolean displayed = driver.findElementByXPath("(//input[@type='text'])[5]").isDisplayed();
		System.out.println("check the boolean value "+displayed);
		driver.close();
	}

}
