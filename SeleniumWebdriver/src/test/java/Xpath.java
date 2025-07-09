import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	public static void main(String[] args)
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	   
	   //Xpath with single attribute
	   driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
	   
	   //Xpath with multiple attributes
	   driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Shirts");
	   
	   //Xpath with and,or operators
	   driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
	   driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Shirts");
	   
	   //Xpath with text() - inner text
	   driver.findElement(By.xpath("//*[text()='MacBook']")).click();
	   boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	   System.out.println(displaystatus);
	   String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	   
	   //Xpath with contains()
	   driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
	   
	   //Xpath with starts-with()
	   driver.findElement(By.xpath("//input[stsrts-with(@placeholder,'Sea')]")).sendKeys("Shirts");
	   
	   //chained Xpath
	   boolean status=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	   System.out.println(status);	   
	}

}
