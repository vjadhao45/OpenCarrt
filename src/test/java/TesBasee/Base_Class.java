package TesBasee;


	
	
	
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Base_Class {
		
		public WebDriver driver;
		
		@BeforeClass
		public void setup()
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		}

		
	@AfterClass
	public void endp()
	{
		driver.close();
	}

}
