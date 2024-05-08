package Automation32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverover {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		String username;
		String pwd;
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:\\www.amazon.in");
		driver.manage().window().maximize();
		WebElement c =driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(c).perform();
		Thread.sleep(2000);
		WebElement sign =driver.findElement(By.linkText("Sign in"));
	   sign.click();
	   FileInputStream fis =  new   FileInputStream("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Excelsheet\\SnehaExcelsheet.xlsx");
       Workbook wb=  WorkbookFactory.create(fis);
        Sheet s1= wb.getSheet("login");
       username = NumberToTextConverter.toText(s1.getRow(2).getCell(0).getNumericCellValue());
       pwd = s1.getRow(2).getCell(1).getStringCellValue();
	   driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
		
		//driver.findElement(By.xpath("//div[@class='two-pane-results-container']/div/div[3])")).click();
		
		/*Thread.sleep(2000);
		int count =autosugtnshoes.size();
		System.out.println(count);
		autosugtnshoes.get( count-7).click();*/

	}

}
