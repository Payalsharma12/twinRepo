package prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demogoogle {
	
	
		
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Payal Sharma\\Downloads\\chromedriver_win32_96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		 String url = "https://www.google.in";
		 driver.get(url);
         
		driver.findElement(By.name("q")).sendKeys("jmeter");
		Thread.sleep(2000);

		// if we are searching any parameter in google or else any where wants to
		// select match case then needs to used this block------>

		List<WebElement> ele = driver.findElements(By.xpath(
				"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"));

		for (WebElement list : ele) {
			if (list.getText().equalsIgnoreCase("jmeter")) {
				Thread.sleep(2000);
				list.click();
				break;

			}
		}

		// needs to scroll in page ====>

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,500)");

		Thread.sleep(2000);

//		// needs to click on hyperlink on page ------> by linktext or directly xpath

		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div/div/div[1]/a/h3")).click();

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("scroll(0,500)");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul[2]/li[2]/a")).click();

		driver.close();
	}
	}