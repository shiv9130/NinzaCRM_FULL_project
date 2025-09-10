package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pagenationdynamictable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://49.249.28.218:8098/");
		
	   driver.findElement(By.id("username")).sendKeys("rmgyantra");;
	   
	   driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	 
	   driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	   
	   ////table[@class='table table-striped table-hover']
	   WebElement forward = driver.findElement(By.xpath("//a[text()='⟩']"));	
	   int count=0;
	   while(driver.findElement(By.xpath("//a[text()='⟩']")).isEnabled()) {
		   driver.findElement(By.xpath("//a[text()='⟩']")).click();
		   count++;
	   }
	   System.out.println(count);

	}

}
