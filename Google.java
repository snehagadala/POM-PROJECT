package MasaiAssignments;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google
{
	@Test
	public void ts2() throws InterruptedException
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class=\"SDkEP\"]/div/textarea")).sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> auto  =driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		int count =auto.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement a =  auto.get(i);
			String s =a.getText();
			System.out.println(s);
			
		}
		auto.get( count-4).click();
		
			
		
	}}
