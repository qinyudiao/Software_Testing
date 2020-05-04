package pset6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestSuite {
    static WebDriver wd = new FirefoxDriver(); // launch the browser

    @BeforeAll
    public static void setUpAll() {
        System.setProperty("webdriver.gecko.driver","geckodriver");
    }

    @BeforeEach
    public void setUpEach() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        wd.get("file:///" + currentWorkingDirectory + "/minandmax.html");
        WebElement we = wd.findElement(By.id("x"));
        we.clear(); // clear x
        we = wd.findElement(By.id("y"));
        we.clear(); // clear y
        we = wd.findElement(By.id("z"));
        we.clear(); // clear z
    }

    @Test
    public void t0() { // (min/max: min, x = infinity, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t1() { // (min/max: min, x = infinity, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t2() { // (min/max: min, x = infinity, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t3() { // (min/max: min, x = infinity, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t4() { // (min/max: min, x = infinity, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t5() { // (min/max: min, x = infinity, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t6() { // (min/max: min, x = infinity, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t7() { // (min/max: min, x = infinity, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t8() { // (min/max: min, x = infinity, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t9() { // (min/max: min, x = infinity, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t10() { // (min/max: min, x = infinity, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t11() { // (min/max: min, x = infinity, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t12() { // (min/max: min, x = infinity, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t13() { // (min/max: min, x = infinity, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t14() { // (min/max: min, x = infinity, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t15() { // (min/max: min, x = infinity, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t16() { // (min/max: min, x = infinity, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t17() { // (min/max: min, x = infinity, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t18() { // (min/max: min, x = infinity, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t19() { // (min/max: min, x = infinity, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t20() { // (min/max: min, x = infinity, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t21() { // (min/max: min, x = infinity, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t22() { // (min/max: min, x = infinity, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t23() { // (min/max: min, x = infinity, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t24() { // (min/max: min, x = infinity, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t25() { // (min/max: min, x = infinity, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t26() { // (min/max: min, x = infinity, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t27() { // (min/max: min, x = infinity, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t28() { // (min/max: min, x = infinity, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t29() { // (min/max: min, x = infinity, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t30() { // (min/max: min, x = infinity, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t31() { // (min/max: min, x = infinity, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t32() { // (min/max: min, x = -3, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t33() { // (min/max: min, x = -3, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t34() { // (min/max: min, x = -3, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t35() { // (min/max: min, x = -3, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t36() { // (min/max: min, x = -3, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t37() { // (min/max: min, x = -3, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t38() { // (min/max: min, x = -3, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t39() { // (min/max: min, x = -3, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t40() { // (min/max: min, x = -3, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t41() { // (min/max: min, x = -3, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t42() { // (min/max: min, x = -3, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, -3, -3) = -3", output);
    }

    @Test
    public void t43() { // (min/max: min, x = -3, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t44() { // (min/max: min, x = -3, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, -3, 0) = -3", output);
    }

    @Test
    public void t45() { // (min/max: min, x = -3, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t46() { // (min/max: min, x = -3, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, -3, 7) = -3", output);
    }

    @Test
    public void t47() { // (min/max: min, x = -3, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t48() { // (min/max: min, x = -3, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t49() { // (min/max: min, x = -3, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t50() { // (min/max: min, x = -3, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 0, -3) = -3", output);
    }

    @Test
    public void t51() { // (min/max: min, x = -3, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t52() { // (min/max: min, x = -3, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 0, 0) = -3", output);
    }

    @Test
    public void t53() { // (min/max: min, x = -3, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t54() { // (min/max: min, x = -3, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 0, 7) = -3", output);
    }

    @Test
    public void t55() { // (min/max: min, x = -3, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t56() { // (min/max: min, x = -3, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t57() { // (min/max: min, x = -3, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t58() { // (min/max: min, x = -3, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 7, -3) = -3", output);
    }

    @Test
    public void t59() { // (min/max: min, x = -3, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t60() { // (min/max: min, x = -3, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 7, 0) = -3", output);
    }

    @Test
    public void t61() { // (min/max: min, x = -3, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t62() { // (min/max: min, x = -3, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-3, 7, 7) = -3", output);
    }

    @Test
    public void t63() { // (min/max: min, x = -3, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t64() { // (min/max: min, x = 0, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t65() { // (min/max: min, x = 0, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t66() { // (min/max: min, x = 0, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t67() { // (min/max: min, x = 0, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t68() { // (min/max: min, x = 0, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t69() { // (min/max: min, x = 0, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t70() { // (min/max: min, x = 0, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t71() { // (min/max: min, x = 0, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t72() { // (min/max: min, x = 0, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t73() { // (min/max: min, x = 0, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t74() { // (min/max: min, x = 0, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -3, -3) = -3", output);
    }

    @Test
    public void t75() { // (min/max: min, x = 0, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t76() { // (min/max: min, x = 0, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -3, 0) = -3", output);
    }

    @Test
    public void t77() { // (min/max: min, x = 0, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t78() { // (min/max: min, x = 0, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -3, 7) = -3", output);
    }

    @Test
    public void t79() { // (min/max: min, x = 0, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t80() { // (min/max: min, x = 0, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t81() { // (min/max: min, x = 0, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t82() { // (min/max: min, x = 0, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, -3) = -3", output);
    }

    @Test
    public void t83() { // (min/max: min, x = 0, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t84() { // (min/max: min, x = 0, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 0) = 0", output);
    }

    @Test
    public void t85() { // (min/max: min, x = 0, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t86() { // (min/max: min, x = 0, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 7) = 0", output);
    }

    @Test
    public void t87() { // (min/max: min, x = 0, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t88() { // (min/max: min, x = 0, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t89() { // (min/max: min, x = 0, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t90() { // (min/max: min, x = 0, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 7, -3) = -3", output);
    }

    @Test
    public void t91() { // (min/max: min, x = 0, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t92() { // (min/max: min, x = 0, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 7, 0) = 0", output);
    }

    @Test
    public void t93() { // (min/max: min, x = 0, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t94() { // (min/max: min, x = 0, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 7, 7) = 0", output);
    }

    @Test
    public void t95() { // (min/max: min, x = 0, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t96() { // (min/max: min, x = 7, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t97() { // (min/max: min, x = 7, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t98() { // (min/max: min, x = 7, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t99() { // (min/max: min, x = 7, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t100() { // (min/max: min, x = 7, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t101() { // (min/max: min, x = 7, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t102() { // (min/max: min, x = 7, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t103() { // (min/max: min, x = 7, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t104() { // (min/max: min, x = 7, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t105() { // (min/max: min, x = 7, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t106() { // (min/max: min, x = 7, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, -3, -3) = -3", output);
    }

    @Test
    public void t107() { // (min/max: min, x = 7, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t108() { // (min/max: min, x = 7, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, -3, 0) = -3", output);
    }

    @Test
    public void t109() { // (min/max: min, x = 7, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t110() { // (min/max: min, x = 7, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, -3, 7) = -3", output);
    }

    @Test
    public void t111() { // (min/max: min, x = 7, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t112() { // (min/max: min, x = 7, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t113() { // (min/max: min, x = 7, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t114() { // (min/max: min, x = 7, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 0, -3) = -3", output);
    }

    @Test
    public void t115() { // (min/max: min, x = 7, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t116() { // (min/max: min, x = 7, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 0, 0) = 0", output);
    }

    @Test
    public void t117() { // (min/max: min, x = 7, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t118() { // (min/max: min, x = 7, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 0, 7) = 0", output);
    }

    @Test
    public void t119() { // (min/max: min, x = 7, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t120() { // (min/max: min, x = 7, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t121() { // (min/max: min, x = 7, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t122() { // (min/max: min, x = 7, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 7, -3) = -3", output);
    }

    @Test
    public void t123() { // (min/max: min, x = 7, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t124() { // (min/max: min, x = 7, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 7, 0) = 0", output);
    }

    @Test
    public void t125() { // (min/max: min, x = 7, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t126() { // (min/max: min, x = 7, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(7, 7, 7) = 7", output);
    }

    @Test
    public void t127() { // (min/max: min, x = 7, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("min"));
        we.click(); //select min
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t128() { // (min/max: max, x = infinity, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t129() { // (min/max: max, x = infinity, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t130() { // (min/max: max, x = infinity, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t131() { // (min/max: max, x = infinity, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t132() { // (min/max: max, x = infinity, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t133() { // (min/max: max, x = infinity, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t134() { // (min/max: max, x = infinity, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t135() { // (min/max: max, x = infinity, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t136() { // (min/max: max, x = infinity, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t137() { // (min/max: max, x = infinity, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t138() { // (min/max: max, x = infinity, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t139() { // (min/max: max, x = infinity, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t140() { // (min/max: max, x = infinity, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t141() { // (min/max: max, x = infinity, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t142() { // (min/max: max, x = infinity, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t143() { // (min/max: max, x = infinity, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t144() { // (min/max: max, x = infinity, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t145() { // (min/max: max, x = infinity, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t146() { // (min/max: max, x = infinity, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t147() { // (min/max: max, x = infinity, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t148() { // (min/max: max, x = infinity, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t149() { // (min/max: max, x = infinity, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t150() { // (min/max: max, x = infinity, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t151() { // (min/max: max, x = infinity, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t152() { // (min/max: max, x = infinity, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t153() { // (min/max: max, x = infinity, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t154() { // (min/max: max, x = infinity, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t155() { // (min/max: max, x = infinity, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t156() { // (min/max: max, x = infinity, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t157() { // (min/max: max, x = infinity, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t158() { // (min/max: max, x = infinity, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t159() { // (min/max: max, x = infinity, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t160() { // (min/max: max, x = -3, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t161() { // (min/max: max, x = -3, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t162() { // (min/max: max, x = -3, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t163() { // (min/max: max, x = -3, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t164() { // (min/max: max, x = -3, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t165() { // (min/max: max, x = -3, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t166() { // (min/max: max, x = -3, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t167() { // (min/max: max, x = -3, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t168() { // (min/max: max, x = -3, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t169() { // (min/max: max, x = -3, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t170() { // (min/max: max, x = -3, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, -3, -3) = -3", output);
    }

    @Test
    public void t171() { // (min/max: max, x = -3, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t172() { // (min/max: max, x = -3, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, -3, 0) = 0", output);
    }

    @Test
    public void t173() { // (min/max: max, x = -3, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t174() { // (min/max: max, x = -3, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, -3, 7) = 7", output);
    }

    @Test
    public void t175() { // (min/max: max, x = -3, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t176() { // (min/max: max, x = -3, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t177() { // (min/max: max, x = -3, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t178() { // (min/max: max, x = -3, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 0, -3) = 0", output);
    }

    @Test
    public void t179() { // (min/max: max, x = -3, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t180() { // (min/max: max, x = -3, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 0, 0) = 0", output);
    }

    @Test
    public void t181() { // (min/max: max, x = -3, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t182() { // (min/max: max, x = -3, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 0, 7) = 7", output);
    }

    @Test
    public void t183() { // (min/max: max, x = -3, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t184() { // (min/max: max, x = -3, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t185() { // (min/max: max, x = -3, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t186() { // (min/max: max, x = -3, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 7, -3) = 7", output);
    }

    @Test
    public void t187() { // (min/max: max, x = -3, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t188() { // (min/max: max, x = -3, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 7, 0) = 7", output);
    }

    @Test
    public void t189() { // (min/max: max, x = -3, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t190() { // (min/max: max, x = -3, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-3, 7, 7) = 7", output);
    }

    @Test
    public void t191() { // (min/max: max, x = -3, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t192() { // (min/max: max, x = 0, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t193() { // (min/max: max, x = 0, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t194() { // (min/max: max, x = 0, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t195() { // (min/max: max, x = 0, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t196() { // (min/max: max, x = 0, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t197() { // (min/max: max, x = 0, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t198() { // (min/max: max, x = 0, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t199() { // (min/max: max, x = 0, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t200() { // (min/max: max, x = 0, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t201() { // (min/max: max, x = 0, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t202() { // (min/max: max, x = 0, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -3, -3) = 0", output);
    }

    @Test
    public void t203() { // (min/max: max, x = 0, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t204() { // (min/max: max, x = 0, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -3, 0) = 0", output);
    }

    @Test
    public void t205() { // (min/max: max, x = 0, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t206() { // (min/max: max, x = 0, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -3, 7) = 7", output);
    }

    @Test
    public void t207() { // (min/max: max, x = 0, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t208() { // (min/max: max, x = 0, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t209() { // (min/max: max, x = 0, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t210() { // (min/max: max, x = 0, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 0, -3) = 0", output);
    }

    @Test
    public void t211() { // (min/max: max, x = 0, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t212() { // (min/max: max, x = 0, y = 0, z = 0, computeButton = click)
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
        assertEquals("max(0, 0, 0) = 0", output);
    }

    @Test
    public void t213() { // (min/max: max, x = 0, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t214() { // (min/max: max, x = 0, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 0, 7) = 7", output);
    }

    @Test
    public void t215() { // (min/max: max, x = 0, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t216() { // (min/max: max, x = 0, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t217() { // (min/max: max, x = 0, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t218() { // (min/max: max, x = 0, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 7, -3) = 7", output);
    }

    @Test
    public void t219() { // (min/max: max, x = 0, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t220() { // (min/max: max, x = 0, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 7, 0) = 7", output);
    }

    @Test
    public void t221() { // (min/max: max, x = 0, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t222() { // (min/max: max, x = 0, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 7, 7) = 7", output);
    }

    @Test
    public void t223() { // (min/max: max, x = 0, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t224() { // (min/max: max, x = 7, y = infinity, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t225() { // (min/max: max, x = 7, y = infinity, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t226() { // (min/max: max, x = 7, y = infinity, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t227() { // (min/max: max, x = 7, y = infinity, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t228() { // (min/max: max, x = 7, y = infinity, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t229() { // (min/max: max, x = 7, y = infinity, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t230() { // (min/max: max, x = 7, y = infinity, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t231() { // (min/max: max, x = 7, y = infinity, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t232() { // (min/max: max, x = 7, y = -3, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t233() { // (min/max: max, x = 7, y = -3, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t234() { // (min/max: max, x = 7, y = -3, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, -3, -3) = 7", output);
    }

    @Test
    public void t235() { // (min/max: max, x = 7, y = -3, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t236() { // (min/max: max, x = 7, y = -3, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, -3, 0) = 7", output);
    }

    @Test
    public void t237() { // (min/max: max, x = 7, y = -3, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t238() { // (min/max: max, x = 7, y = -3, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, -3, 7) = 7", output);
    }

    @Test
    public void t239() { // (min/max: max, x = 7, y = -3, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t240() { // (min/max: max, x = 7, y = 0, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t241() { // (min/max: max, x = 7, y = 0, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t242() { // (min/max: max, x = 7, y = 0, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 0, -3) = 7", output);
    }

    @Test
    public void t243() { // (min/max: max, x = 7, y = 0, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t244() { // (min/max: max, x = 7, y = 0, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 0, 0) = 7", output);
    }

    @Test
    public void t245() { // (min/max: max, x = 7, y = 0, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t246() { // (min/max: max, x = 7, y = 0, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 0, 7) = 7", output);
    }

    @Test
    public void t247() { // (min/max: max, x = 7, y = 0, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("0"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t248() { // (min/max: max, x = 7, y = 7, z = infinity, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t249() { // (min/max: max, x = 7, y = 7, z = infinity, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t250() { // (min/max: max, x = 7, y = 7, z = -3, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 7, -3) = 7", output);
    }

    @Test
    public void t251() { // (min/max: max, x = 7, y = 7, z = -3, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t252() { // (min/max: max, x = 7, y = 7, z = 0, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 7, 0) = 7", output);
    }

    @Test
    public void t253() { // (min/max: max, x = 7, y = 7, z = 0, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("0"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @Test
    public void t254() { // (min/max: max, x = 7, y = 7, z = 7, computeButton = click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        we = wd.findElement(By.id("computeButton"));
        we.click(); //click the button
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(7, 7, 7) = 7", output);
    }

    @Test
    public void t255() { // (min/max: max, x = 7, y = 7, z = 7, computeButton = don't click)
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7"); // enter a representative for x
        we = wd.findElement(By.id("y"));
        we.sendKeys("7"); // enter a representative for y
        we = wd.findElement(By.id("z"));
        we.sendKeys("7"); // enter a representative for z
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("", output);
    }

    @AfterAll
    public static void cleanUpAll() {
        wd.quit(); // close the browser window
    }
}
