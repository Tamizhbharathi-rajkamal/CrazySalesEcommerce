package org.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrazySale extends GetData {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Tamizhbharathi\\My_Workspace\\CrazySalesEcommerce\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crazysales.com.au/");
		driver.manage().window().maximize();
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s1 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d1 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\1.png");
		FileUtils.copyFile(s1, d1);
		
		WebElement shopByCategory = driver.findElement(By.xpath("//a[@href = '/home-garden/']"));
		Actions action = new Actions(driver);
		action.moveToElement(shopByCategory).perform();
		File s2 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d2 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\2.png");
		FileUtils.copyFile(s2, d2);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement product = driver.findElement(By.xpath("//*[text() = 'Garden Decor']"));
		product.click();
		File s3 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d3 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\3.png");
		FileUtils.copyFile(s3, d3);
		
		WebElement subProduct = driver.findElement(By.xpath("//a[@title = '10w Solar Power Outdoor Garden Water Pump']"));
		subProduct.click();
		File s4 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d4 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\4.png");
		FileUtils.copyFile(s4, d4);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[4]/div[2]/div[2]/div[4]/ul/li[1]/input"));
		addToCart.click();
		File s5 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d5 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\5.png");
		FileUtils.copyFile(s5, d5);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		WebElement btnCheckOut = driver.findElement(By.xpath("//input[@class = 'check_outbutton float_l']"));
		btnCheckOut.click();
		File s6 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d6 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\6.png");
		FileUtils.copyFile(s6, d6);
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		File s7 = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File d7 = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\screenshot\\7.png");
		FileUtils.copyFile(s7, d7);
		
		WebElement eMail = driver.findElement(By.id("email"));
		eMail.sendKeys(getData(4,0));
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(getData(4,1));
		
		WebElement btnlogin = driver.findElement(By.id("login-button"));
		btnlogin.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//li[@class = 'total darkred'][text() = '$68.7']"));
		String getPrice = price.getText();
		System.out.println(getPrice);
		
	
}
}