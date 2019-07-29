package com.demo.selenium.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.selenium.*;


public class pageInputForms {
	
	WebDriver driver;
	
	By inputForms = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]");
	By simpleFormDemo = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]");
	By txtMessage = By.xpath("(//input[@class='form-control'])[1]");
	By btnShowMessage = By.xpath("(//button[@class='btn btn-default'])[1]");
	
	//WebElement inputForms=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]"));
	//WebElement simpleFormDemo=driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]"));
	//WebElement txtMessage = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	//WebElement btnShowMessage = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]"));
	
	
	public pageInputForms(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void inputForms(String mensaje) throws InterruptedException{
		
		driver.findElement(inputForms).click();
		Thread.sleep(2000);
		driver.findElement(simpleFormDemo).click();
		Thread.sleep(2000);
		driver.findElement(txtMessage).sendKeys(mensaje);
		driver.findElement(btnShowMessage).click();
		
		
		/*
		inputForms.click();
		Thread.sleep(2000);
		simpleFormDemo.click();
		Thread.sleep(2000);
		txtMessage.sendKeys("HOLA MUNDO");
		btnShowMessage.click();
		Thread.sleep(2000);
		*/
	}
}
