package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagenationdynamictable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://49.249.28.218:8098/");
		
	   driver.findElement(By.id("username")).sendKeys("rmgyantra");;
	   
	   driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	 
	   driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	   
	   
		 //table[@class="table table-striped table-hover"]/tbody/tr
	   
	   
	// Loop until pagination ends
       while (true) {
           // Get all rows/data on the current page
           List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr"));
           System.out.println("Rows on this page: " + rows.size());

           // Example: print text from the first column
           for (WebElement row : rows) {
               System.out.println(row.getText());
           }

           // Check if "Next" button is enabled/present
           List<WebElement> nextBtn = driver.findElements(By.xpath("//a[text()='⟩']"));
           
           if (nextBtn.size() > 0 && nextBtn.get(0).isEnabled()) {
               nextBtn.get(0).click();   // click next page
               Thread.sleep(2000);       // wait for page to load
           } else {
               break;  // Exit loop if no Next button
           }
       }

       driver.quit();


	}

}
