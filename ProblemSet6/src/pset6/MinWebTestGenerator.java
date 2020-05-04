package pset6;

public class MinWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.jupiter.api.Assertions.*;\n\n"
            + "import org.junit.jupiter.api.Test;\n"
            + "import org.junit.jupiter.api.BeforeEach;\n"
            + "import org.junit.jupiter.api.BeforeAll;\n"
            + "import org.junit.jupiter.api.AfterAll;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinWebTestSuite {\n");

        // your code goes here
        // ...
        sb.append(instantiateWebdriver());
        sb.append(setUpAll());
        sb.append(setUpEach());
        sb.append(addTests());
        sb.append(cleanUpAll()); 
        
        sb.append("}\n");
        return sb.toString();
    }

    // implement any helper methods that you need in this class
    
    /**
     * Returns all the test methods generated.
     */ 
    String addTests() {
    	StringBuilder sb = new StringBuilder();
    	String[] inputValues = new String[] {"infinity", "-3", "0", "7"};
    	int index = 0;
    	for(String x : inputValues) {
    		for(String y : inputValues) {
    			for(String z : inputValues) {
    				for(boolean click : new boolean[] {true, false}) {
    		    		sb.append(addOneTest(index, x, y, z, click));
    					index ++;
    		    	}
    	    	}
        	}
    	}
    	return sb.toString();
    }
    
    /**
     * Returns a single test method.
     * @param index : The index of the test method.
     * @param x : The key value to test x.
     * @param y : The key value to test y. 
     * @param z : The key value to test z. 
     * @param click : The key value to test y. 
     */ 
    String addOneTest(int index, String x, String y, String z, boolean click) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(tab(1) + "@Test\n");
    	sb.append(tab(1) + "public void t" + String.valueOf(index) + "() { // (x = " + x + ", y = " + y + ", z = " + z + ", computeButton = " + (click ? "click" : "don't click") + ")\n");
    	sb.append(tab(2) + "WebElement we = wd.findElement(By.id(\"x\"));\n");
    	sb.append(tab(2) + "we.sendKeys(\"" + x + "\"); // enter a representative for x\n");
    	sb.append(tab(2) + "we = wd.findElement(By.id(\"y\"));\n");
    	sb.append(tab(2) + "we.sendKeys(\"" + y + "\"); // enter a representative for y\n");
    	sb.append(tab(2) + "we = wd.findElement(By.id(\"z\"));\n");
    	sb.append(tab(2) + "we.sendKeys(\"" + z + "\"); // enter a representative for z\n");
    	if(click) {
	    	sb.append(tab(2) + "we = wd.findElement(By.id(\"computeButton\"));\n");
	    	sb.append(tab(2) + "we.click(); //click the button\n");
    	}
    	sb.append(tab(2) + "WebElement result = wd.findElement(By.id(\"result\"));\n");
    	sb.append(tab(2) + "String output = result.getText(); // read the output text\n");
    	if(!click) {
    		sb.append(tab(2) + "assertEquals(\"\", output);\n");
    	} else {
	    	try {
	            double[] da = new double[] {Double.parseDouble(x), Double.parseDouble(y), Double.parseDouble(z)};
	            String[] sa = new String[] {x, y, z};
	            double dmin = da[0];
	            String smin = sa[0];
	            for (int i = 1; i < da.length; i++) { 
	                if (da[i] < dmin) {
	                	dmin = da[i];
	                	smin = sa[i];
	                }
	            }
	        	sb.append(tab(2) + "assertEquals(\"min(" + x + ", " + y + ", " + z + ") = " + smin + "\", output);\n");
	        } catch (NumberFormatException nfe) {
	        	sb.append(tab(2) + "assertEquals(\"Please enter integer values only!\", output);\n");
	        }
    	}
    	sb.append(tab(1) + "}\n\n");
    	return sb.toString();
    }
    
    /**
     * Returns the code to launch the browser.
     */ 
    String instantiateWebdriver() {
		return tab(1) + "static WebDriver wd = new FirefoxDriver(); // launch the browser\n\n";
	}
    
    /**
     * Returns the code to set up the driver for the browser to load the correct page.
     */ 
    String setUpAll() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(tab(1) + "@BeforeAll\n");
    	sb.append(tab(1) + "public static void setUpAll() {\n");
    	sb.append(tab(2) + "System.setProperty(\"webdriver.gecko.driver\",\"geckodriver\");\n");
    	sb.append(tab(1) + "}\n\n");
    	return sb.toString();
    }
    
    /**
     * Returns the code to clear up the fields before each test.
     */ 
    String setUpEach() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(tab(1) + "@BeforeEach\n");
    	sb.append(tab(1) + "public void setUpEach() {\n");
    	sb.append(tab(2) + "String currentWorkingDirectory = System.getProperty(\"user.dir\");\n");
    	sb.append(tab(2) + "wd.get(\"file:///\" + currentWorkingDirectory + \"/min.html\");\n");
    	sb.append(tab(2) + "WebElement we = wd.findElement(By.id(\"x\"));\n");
    	sb.append(tab(2) + "we.clear(); // clear x\n");
    	sb.append(tab(2) + "we = wd.findElement(By.id(\"y\"));\n");
    	sb.append(tab(2) + "we.clear(); // clear y\n");
    	sb.append(tab(2) + "we = wd.findElement(By.id(\"z\"));\n");
    	sb.append(tab(2) + "we.clear(); // clear z\n");
    	sb.append(tab(1) + "}\n\n");
    	return sb.toString();
    }
    
    /**
     * Returns the code to close the browser after all the tests run.
     */ 	
    String cleanUpAll() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(tab(1) + "@AfterAll\n");
    	sb.append(tab(1) + "public static void cleanUpAll() {\n");
    	sb.append(tab(2) + "wd.quit(); // close the browser window\n");
    	sb.append(tab(1) + "}\n");
		return sb.toString();
	}
    
    /**
     * Returns a 4-space tab.
     * @param count : The number of 4-space tabs to return.
     */ 
    String tab(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i ++) {
            sb.append("    ");
        }
        return sb.toString();        
    }
}