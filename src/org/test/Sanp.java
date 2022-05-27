package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanp {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajitkumar\\eclipse-workspace\\Selenium 2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txt=driver.findElement(By.id("inputValEnter"));
		txt.sendKeys("HP laptop");
		WebElement text=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		text.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ajitkumar\\Desktop\\Task\\img4.png");
		FileUtils.copyFile(src, des);
	}

}
