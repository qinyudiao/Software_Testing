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

/* 
 * 27 tests failed if the test suite is used to test against the webpage minandmax.html.
 * These failures are not bugs in minandmax.html page, but are faulty tests beacause the
 * output messages are supposed to be "max..." instead of "min...".
 * Example error message: "expected: <min(-3, 0, 7) = -3> but was: <max(-3, 0, 7) = 7>".
 * 128*(1/2)*(3/4)*(3/4)*(3/4) = 27.
 */

public class MinWebTestSuite {
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
    public void t0() { // (x = infinity, y = infinity, z = infinity, computeButton = click)
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
    public void t1() { // (x = infinity, y = infinity, z = infinity, computeButton = don't click)
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
    public void t2() { // (x = infinity, y = infinity, z = -3, computeButton = click)
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
    public void t3() { // (x = infinity, y = infinity, z = -3, computeButton = don't click)
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
    public void t4() { // (x = infinity, y = infinity, z = 0, computeButton = click)
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
    public void t5() { // (x = infinity, y = infinity, z = 0, computeButton = don't click)
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
    public void t6() { // (x = infinity, y = infinity, z = 7, computeButton = click)
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
    public void t7() { // (x = infinity, y = infinity, z = 7, computeButton = don't click)
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
    public void t8() { // (x = infinity, y = -3, z = infinity, computeButton = click)
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
    public void t9() { // (x = infinity, y = -3, z = infinity, computeButton = don't click)
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
    public void t10() { // (x = infinity, y = -3, z = -3, computeButton = click)
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
    public void t11() { // (x = infinity, y = -3, z = -3, computeButton = don't click)
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
    public void t12() { // (x = infinity, y = -3, z = 0, computeButton = click)
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
    public void t13() { // (x = infinity, y = -3, z = 0, computeButton = don't click)
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
    public void t14() { // (x = infinity, y = -3, z = 7, computeButton = click)
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
    public void t15() { // (x = infinity, y = -3, z = 7, computeButton = don't click)
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
    public void t16() { // (x = infinity, y = 0, z = infinity, computeButton = click)
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
    public void t17() { // (x = infinity, y = 0, z = infinity, computeButton = don't click)
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
    public void t18() { // (x = infinity, y = 0, z = -3, computeButton = click)
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
    public void t19() { // (x = infinity, y = 0, z = -3, computeButton = don't click)
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
    public void t20() { // (x = infinity, y = 0, z = 0, computeButton = click)
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
    public void t21() { // (x = infinity, y = 0, z = 0, computeButton = don't click)
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
    public void t22() { // (x = infinity, y = 0, z = 7, computeButton = click)
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
    public void t23() { // (x = infinity, y = 0, z = 7, computeButton = don't click)
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
    public void t24() { // (x = infinity, y = 7, z = infinity, computeButton = click)
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
    public void t25() { // (x = infinity, y = 7, z = infinity, computeButton = don't click)
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
    public void t26() { // (x = infinity, y = 7, z = -3, computeButton = click)
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
    public void t27() { // (x = infinity, y = 7, z = -3, computeButton = don't click)
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
    public void t28() { // (x = infinity, y = 7, z = 0, computeButton = click)
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
    public void t29() { // (x = infinity, y = 7, z = 0, computeButton = don't click)
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
    public void t30() { // (x = infinity, y = 7, z = 7, computeButton = click)
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
    public void t31() { // (x = infinity, y = 7, z = 7, computeButton = don't click)
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
    public void t32() { // (x = -3, y = infinity, z = infinity, computeButton = click)
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
    public void t33() { // (x = -3, y = infinity, z = infinity, computeButton = don't click)
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
    public void t34() { // (x = -3, y = infinity, z = -3, computeButton = click)
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
    public void t35() { // (x = -3, y = infinity, z = -3, computeButton = don't click)
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
    public void t36() { // (x = -3, y = infinity, z = 0, computeButton = click)
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
    public void t37() { // (x = -3, y = infinity, z = 0, computeButton = don't click)
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
    public void t38() { // (x = -3, y = infinity, z = 7, computeButton = click)
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
    public void t39() { // (x = -3, y = infinity, z = 7, computeButton = don't click)
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
    public void t40() { // (x = -3, y = -3, z = infinity, computeButton = click)
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
    public void t41() { // (x = -3, y = -3, z = infinity, computeButton = don't click)
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
    public void t42() { // (x = -3, y = -3, z = -3, computeButton = click)
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
        assertEquals("min(-3, -3, -3) = -3", output);
    }

    @Test
    public void t43() { // (x = -3, y = -3, z = -3, computeButton = don't click)
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
    public void t44() { // (x = -3, y = -3, z = 0, computeButton = click)
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
        assertEquals("min(-3, -3, 0) = -3", output);
    }

    @Test
    public void t45() { // (x = -3, y = -3, z = 0, computeButton = don't click)
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
    public void t46() { // (x = -3, y = -3, z = 7, computeButton = click)
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
        assertEquals("min(-3, -3, 7) = -3", output);
    }

    @Test
    public void t47() { // (x = -3, y = -3, z = 7, computeButton = don't click)
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
    public void t48() { // (x = -3, y = 0, z = infinity, computeButton = click)
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
    public void t49() { // (x = -3, y = 0, z = infinity, computeButton = don't click)
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
    public void t50() { // (x = -3, y = 0, z = -3, computeButton = click)
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
        assertEquals("min(-3, 0, -3) = -3", output);
    }

    @Test
    public void t51() { // (x = -3, y = 0, z = -3, computeButton = don't click)
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
    public void t52() { // (x = -3, y = 0, z = 0, computeButton = click)
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
        assertEquals("min(-3, 0, 0) = -3", output);
    }

    @Test
    public void t53() { // (x = -3, y = 0, z = 0, computeButton = don't click)
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
    public void t54() { // (x = -3, y = 0, z = 7, computeButton = click)
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
        assertEquals("min(-3, 0, 7) = -3", output);
    }

    @Test
    public void t55() { // (x = -3, y = 0, z = 7, computeButton = don't click)
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
    public void t56() { // (x = -3, y = 7, z = infinity, computeButton = click)
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
    public void t57() { // (x = -3, y = 7, z = infinity, computeButton = don't click)
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
    public void t58() { // (x = -3, y = 7, z = -3, computeButton = click)
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
        assertEquals("min(-3, 7, -3) = -3", output);
    }

    @Test
    public void t59() { // (x = -3, y = 7, z = -3, computeButton = don't click)
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
    public void t60() { // (x = -3, y = 7, z = 0, computeButton = click)
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
        assertEquals("min(-3, 7, 0) = -3", output);
    }

    @Test
    public void t61() { // (x = -3, y = 7, z = 0, computeButton = don't click)
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
    public void t62() { // (x = -3, y = 7, z = 7, computeButton = click)
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
        assertEquals("min(-3, 7, 7) = -3", output);
    }

    @Test
    public void t63() { // (x = -3, y = 7, z = 7, computeButton = don't click)
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
    public void t64() { // (x = 0, y = infinity, z = infinity, computeButton = click)
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
    public void t65() { // (x = 0, y = infinity, z = infinity, computeButton = don't click)
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
    public void t66() { // (x = 0, y = infinity, z = -3, computeButton = click)
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
    public void t67() { // (x = 0, y = infinity, z = -3, computeButton = don't click)
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
    public void t68() { // (x = 0, y = infinity, z = 0, computeButton = click)
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
    public void t69() { // (x = 0, y = infinity, z = 0, computeButton = don't click)
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
    public void t70() { // (x = 0, y = infinity, z = 7, computeButton = click)
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
    public void t71() { // (x = 0, y = infinity, z = 7, computeButton = don't click)
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
    public void t72() { // (x = 0, y = -3, z = infinity, computeButton = click)
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
    public void t73() { // (x = 0, y = -3, z = infinity, computeButton = don't click)
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
    public void t74() { // (x = 0, y = -3, z = -3, computeButton = click)
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
        assertEquals("min(0, -3, -3) = -3", output);
    }

    @Test
    public void t75() { // (x = 0, y = -3, z = -3, computeButton = don't click)
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
    public void t76() { // (x = 0, y = -3, z = 0, computeButton = click)
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
        assertEquals("min(0, -3, 0) = -3", output);
    }

    @Test
    public void t77() { // (x = 0, y = -3, z = 0, computeButton = don't click)
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
    public void t78() { // (x = 0, y = -3, z = 7, computeButton = click)
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
        assertEquals("min(0, -3, 7) = -3", output);
    }

    @Test
    public void t79() { // (x = 0, y = -3, z = 7, computeButton = don't click)
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
    public void t80() { // (x = 0, y = 0, z = infinity, computeButton = click)
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
    public void t81() { // (x = 0, y = 0, z = infinity, computeButton = don't click)
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
    public void t82() { // (x = 0, y = 0, z = -3, computeButton = click)
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
        assertEquals("min(0, 0, -3) = -3", output);
    }

    @Test
    public void t83() { // (x = 0, y = 0, z = -3, computeButton = don't click)
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
    public void t84() { // (x = 0, y = 0, z = 0, computeButton = click)
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

    @Test
    public void t85() { // (x = 0, y = 0, z = 0, computeButton = don't click)
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
    public void t86() { // (x = 0, y = 0, z = 7, computeButton = click)
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
        assertEquals("min(0, 0, 7) = 0", output);
    }

    @Test
    public void t87() { // (x = 0, y = 0, z = 7, computeButton = don't click)
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
    public void t88() { // (x = 0, y = 7, z = infinity, computeButton = click)
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
    public void t89() { // (x = 0, y = 7, z = infinity, computeButton = don't click)
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
    public void t90() { // (x = 0, y = 7, z = -3, computeButton = click)
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
        assertEquals("min(0, 7, -3) = -3", output);
    }

    @Test
    public void t91() { // (x = 0, y = 7, z = -3, computeButton = don't click)
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
    public void t92() { // (x = 0, y = 7, z = 0, computeButton = click)
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
        assertEquals("min(0, 7, 0) = 0", output);
    }

    @Test
    public void t93() { // (x = 0, y = 7, z = 0, computeButton = don't click)
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
    public void t94() { // (x = 0, y = 7, z = 7, computeButton = click)
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
        assertEquals("min(0, 7, 7) = 0", output);
    }

    @Test
    public void t95() { // (x = 0, y = 7, z = 7, computeButton = don't click)
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
    public void t96() { // (x = 7, y = infinity, z = infinity, computeButton = click)
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
    public void t97() { // (x = 7, y = infinity, z = infinity, computeButton = don't click)
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
    public void t98() { // (x = 7, y = infinity, z = -3, computeButton = click)
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
    public void t99() { // (x = 7, y = infinity, z = -3, computeButton = don't click)
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
    public void t100() { // (x = 7, y = infinity, z = 0, computeButton = click)
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
    public void t101() { // (x = 7, y = infinity, z = 0, computeButton = don't click)
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
    public void t102() { // (x = 7, y = infinity, z = 7, computeButton = click)
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
    public void t103() { // (x = 7, y = infinity, z = 7, computeButton = don't click)
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
    public void t104() { // (x = 7, y = -3, z = infinity, computeButton = click)
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
    public void t105() { // (x = 7, y = -3, z = infinity, computeButton = don't click)
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
    public void t106() { // (x = 7, y = -3, z = -3, computeButton = click)
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
        assertEquals("min(7, -3, -3) = -3", output);
    }

    @Test
    public void t107() { // (x = 7, y = -3, z = -3, computeButton = don't click)
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
    public void t108() { // (x = 7, y = -3, z = 0, computeButton = click)
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
        assertEquals("min(7, -3, 0) = -3", output);
    }

    @Test
    public void t109() { // (x = 7, y = -3, z = 0, computeButton = don't click)
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
    public void t110() { // (x = 7, y = -3, z = 7, computeButton = click)
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
        assertEquals("min(7, -3, 7) = -3", output);
    }

    @Test
    public void t111() { // (x = 7, y = -3, z = 7, computeButton = don't click)
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
    public void t112() { // (x = 7, y = 0, z = infinity, computeButton = click)
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
    public void t113() { // (x = 7, y = 0, z = infinity, computeButton = don't click)
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
    public void t114() { // (x = 7, y = 0, z = -3, computeButton = click)
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
        assertEquals("min(7, 0, -3) = -3", output);
    }

    @Test
    public void t115() { // (x = 7, y = 0, z = -3, computeButton = don't click)
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
    public void t116() { // (x = 7, y = 0, z = 0, computeButton = click)
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
        assertEquals("min(7, 0, 0) = 0", output);
    }

    @Test
    public void t117() { // (x = 7, y = 0, z = 0, computeButton = don't click)
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
    public void t118() { // (x = 7, y = 0, z = 7, computeButton = click)
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
        assertEquals("min(7, 0, 7) = 0", output);
    }

    @Test
    public void t119() { // (x = 7, y = 0, z = 7, computeButton = don't click)
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
    public void t120() { // (x = 7, y = 7, z = infinity, computeButton = click)
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
    public void t121() { // (x = 7, y = 7, z = infinity, computeButton = don't click)
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
    public void t122() { // (x = 7, y = 7, z = -3, computeButton = click)
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
        assertEquals("min(7, 7, -3) = -3", output);
    }

    @Test
    public void t123() { // (x = 7, y = 7, z = -3, computeButton = don't click)
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
    public void t124() { // (x = 7, y = 7, z = 0, computeButton = click)
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
        assertEquals("min(7, 7, 0) = 0", output);
    }

    @Test
    public void t125() { // (x = 7, y = 7, z = 0, computeButton = don't click)
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
    public void t126() { // (x = 7, y = 7, z = 7, computeButton = click)
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
        assertEquals("min(7, 7, 7) = 7", output);
    }

    @Test
    public void t127() { // (x = 7, y = 7, z = 7, computeButton = don't click)
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
