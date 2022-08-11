package week3.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSelenium {
	public static void main(String[] args) {
		//download the driver set the path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yogeswaran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6382644312");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Baskaran@123");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='day']"));
		Select dro1=new Select(source);
		dro1.selectByValue("4");
		
		WebElement source1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dro2=new Select(source1);
		dro2.selectByValue("10");
		
		WebElement source2 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select dro3=new Select(source2);
	    dro3.selectByValue("2000");
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();	    
	    
	    }

}
