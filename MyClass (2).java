package seleniumpkg;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MyClass {
	private static char[] present;
	WebDriver driver;

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C:\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		String baseUrl = "https://swe.umbc.edu/~sampath/is448/chap9-examples/php2/form_proc.html";
		
		String expectedTitle = "Customer satisfaction survey!";
		driver.get(baseUrl);
	
		String actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("test title: passed");
		}else{
			System.out.println("test title: failed");
		}		
		
		
		
		String tagName = "";
		driver.get(baseUrl);
		//example showing how to get the tagname
		tagName = driver.findElement(By.id("cName")).getTagName();
		System.out.println(tagName);

		//fill out a form field
		WebElement myElement = driver.findElement(By.id("cName"));
		myElement.sendKeys("john");
		WebElement myElement1 = driver.findElement(By.id("phoneNum"));
		myElement1.sendKeys("4389247233");
		WebElement myElement2 = driver.findElement(By.id("comments"));
		myElement2.sendKeys("Great skills");
		myElement.click();
	
		driver.findElement(By.id("submitB")).click();
		String actualMessage = driver.findElement(By.tagName("body")).getText();
		System.out.println(actualMessage);
		String expectedMessage = "Thank you for the feedback, john";
		if(actualMessage.contains(expectedMessage)){
			System.out.println("test verify message display: passed");
		}else{
			System.out.println("test verify message display: failed");
		}
		
		//driver.close();		
	
		


		if (driver.getPageSource().contains("Great skills"))
		{
			System.out.println("Text present");

			}
		else{

			System.out.println("Text not present");
			}
		
	}
	
	
		
}