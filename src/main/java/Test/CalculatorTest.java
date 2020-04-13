package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.windows.WindowsDriver;
import WindowsScreenObjects.*;
import Utility.*;

public class CalculatorTest {
	public class CalculatorClass {
	    private  WindowsDriver CalculatorSession = null;
	    private  WebElement CalculatorResult = null;
	  
	@BeforeClass
    public  void setup() {
        AppStart appStart = new AppStart();
        CalculatorSession =  appStart.windowsAppStart();
    }


    protected String _GetCalculatorResultText()
    {
        // trim extra text and whitespace off of the display value
        return CalculatorResult.getText().replace("Display is", "").trim();
    }
	
@Test
public void testCalc()
{
	CalculatorScreen calcPage = new CalculatorScreen(CalculatorSession) ;
	  calcPage.clickButton("Two");
	  calcPage.clickButton("Plus");
	  calcPage.clickButton("Three");
	  calcPage.clickButton("Equals");
      AssertJUnit.assertEquals("Display is 5", calcPage. getContents().getText());
	
}
	
}
}
