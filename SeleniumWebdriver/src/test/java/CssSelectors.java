
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id   tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		                           //OR
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Shirts");
		                           //OR
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Shirts");
		
		//tag attribute   tag[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Trousers");
		                           //OR
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Trousers");
		
		//tag class attribute   
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Geans");
		                            //OR
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Geans");
	}

}
