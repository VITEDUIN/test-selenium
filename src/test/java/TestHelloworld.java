import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class TestHelloworld {
	@Test
	public void testhelloworld()
	{
		
		System.out.println("Hello world test 1 ");
		
	}
	@Test
	public void testhelloworld2()
	{
		//dummy test case
		System.out.println("Hello world test 2 ");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\install\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
	     // Instantiate a ChromeDriver class.     
       // WebDriver driver=new ChromeDriver();  
       ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");  // Ensure Chrome is headless
	options.addArguments("--disable-gpu");  // Disable GPU hardware acceleration
	options.addArguments("--no-sandbox");  // Disable sandboxing (especially needed for CI environments)
	options.addArguments("window-size=1200x600");  // Optional: specify a window size
	WebDriver driver = new ChromeDriver(options);
		options.addArguments("--remote-debugging-port=9222");  // Specify a debugging port for CDP connection
		options.addArguments("--disable-dev-shm-usage");  // Disable shared memory usage for certain environments (like Docker or Jenkins)

           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
     // Click on the search text box and send value  
        driver.findElement(By.id("gsc-i-id1")).sendKeys("core Java");  
              
        // Click on the search button  
        driver.findElement(By.className("gsc-search-button")).click();  
        //driver.findElement(By.linkText("Core Java")).click();     
	}
}
