import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryLogin
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleniunm\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("MANISHA.B");
		System.out.println("Username submit successfully");
		driver.findElement(By.name("password")).sendKeys("mani123");
		System.out.println("Password submit successfully");
		driver.findElement(By.name("submit")).submit();
		System.out.println("submit successfully");
		//driver.close();
		
	}
}
