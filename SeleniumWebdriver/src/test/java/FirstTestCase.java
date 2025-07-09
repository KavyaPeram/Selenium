import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 Test Case
 ---------
 1)Launch Browser
 2)Open URL https://www.amazon.in/
 3)Validate title should be
 4)Close browser
 */
public class FirstTestCase 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		//WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.getTitle();
        driver.close();
	}

}
