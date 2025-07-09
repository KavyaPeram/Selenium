import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		
		//linktext & partial linktext
		driver.findElement(By.linkText("mobiles")).click();
		driver.findElement(By.partialLinkText("mob")).click();	
		
		//classname
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("total number of header links:"+headerLinks.size());
		
		//tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+images.size());
	}
}
