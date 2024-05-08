package MasaiAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlelinkscount 
{
@Test
public void testcase() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	driver.findElement(By.xpath("//div[@class=\"SDkEP\"]/div/textarea")).sendKeys("india");
	Thread.sleep(2000);
	List<WebElement> auto  =driver.findElements(By.tagName("a"));
	int count =auto.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement a =  auto.get(i);
		String s =a.getText();
		System.out.println(s);
	
}
}}
