import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryRegistration 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleniunm\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("Manisha");
		System.out.println("First Name submit successfully");
		driver.findElement(By.name("lastName")).sendKeys("Barapatre");
		System.out.println("Last Name submit successfully");
		driver.findElement(By.name("phone")).sendKeys("0123456789");
		System.out.println("Phone number submit successfully");
		driver.findElement(By.id("userName")).sendKeys("burdemanisha@gmai.com");
		System.out.println("Email id submit successfully");
		driver.findElement(By.name("address1")).sendKeys("Wakad");
		System.out.println("Address submit");
		driver.findElement(By.name("city")).sendKeys("Pune");
		System.out.println("City submit");
		driver.findElement(By.name("state")).sendKeys("Maharshtra");
		System.out.println("State submit");
		driver.findElement(By.name("postalCode")).sendKeys("411053");
		System.out.println("Postal code submit");
		WebElement drop=  driver.findElement(By.name("country"));
		Select brow=new Select(drop);
		brow.selectByValue("INDIA");
		driver.findElement(By.id("email")).sendKeys("Bmanisha");
		System.out.println("Username submit");
		driver.findElement(By.name("password")).sendKeys("abc123456");
		System.out.println("Password submit");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123456");
		System.out.println("Confirm Password submit");
		
		  driver.findElement(By.name("submit")).submit(); 
		  driver.close();
	}
}
