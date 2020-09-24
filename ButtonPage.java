package Week2.day2;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementById("home").click();
		driver.findElementByXPath("//h5[@class='wp-categories-title'][text()='Button']").click();
		Point location = driver.findElementById("position").getLocation();
		System.out.println("location of the button : "+location);
		String cssValue = driver.findElementById("color").getCssValue("color");
        System.out.println("the color of the button "+cssValue);
        Dimension size = driver.findElementById("size").getSize();
        System.out.println("the hight and width of the button: "+size);
        System.out.println("the hight of the button: "+size.height);
        System.out.println("the width of the button: "+size.width);
        driver.close();
        
	}

}
