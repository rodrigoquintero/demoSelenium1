package com.demo.selenium;

import java.io.File;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.demo.selenium.pages.pageInputForms;

@RunWith(Parameterized.class)
public class TC001 {
	@SuppressWarnings("rawtypes")
	@Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
                {"HOLA MUNDO 1."},{"HOLA MUNDO 2."},{"HOLA MUNDO 3."}
        });
    }
 
    private String mensaje;
    WebDriver driver;

    public TC001(String mensaje) {
        this.mensaje = mensaje;
    }

    
    	
	
	@Before
	public void beforeTest() {
		File chromeDriverFile = new File("Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
		driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
	}
	
	@Test()
	public void test() throws Exception {
		
		pageInputForms menuInputForms=new pageInputForms(driver);
		
		try {
			System.out.println("paso por el @test");

			menuInputForms.inputForms(mensaje);
			
			System.out.println("##########");
			
			Thread.sleep(2000);
		
		} catch (Exception e) {
            e.printStackTrace();
        }
	
	}
	
	@After
	public void Aftertest() {
	driver.quit();
	}

}
