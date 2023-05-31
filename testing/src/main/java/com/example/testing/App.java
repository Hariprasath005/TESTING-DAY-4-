package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Subiksha");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Sundaram");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("subikshasundaram@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("subikeerthi");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,12500)","");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        
	}

}
