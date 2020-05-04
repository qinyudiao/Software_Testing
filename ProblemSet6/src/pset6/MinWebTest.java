package pset6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTest {
	static WebDriver wd = new FirefoxDriver(); // launch the browser
	
	@BeforeAll
	public static void setUpAll() {
		System.setProperty("webdriver.gecko.driver","geckodriver");
		String currentWorkingDirectory = System.getProperty("user.dir");
		wd.get("file:///" + currentWorkingDirectory + "/min.html");
	}
	
	@BeforeEach
	public void setUpEach() {
		WebElement we = wd.findElement(By.id("x"));
		we.clear(); // clear x
		we = wd.findElement(By.id("y"));
		we.clear(); // clear y
		we = wd.findElement(By.id("z"));
		we.clear(); // clear z
	}
	
	@Test
	public void t0() { // (x = 0, y = 0, z = 0, computeButton = click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 0) = 0", output);
	}
	
	@AfterAll
	public static void cleanUpAll() {
		wd.quit(); // close the browser window
	}
}

