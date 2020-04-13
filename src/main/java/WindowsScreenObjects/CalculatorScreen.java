package WindowsScreenObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

public class CalculatorScreen {
	   WindowsDriver driver;

	      private static WebElement CalculatorResult = null;

		    public CalculatorScreen(WindowsDriver driver){

		        this.driver = driver;

		    }

		  	    

		    //ClickButton

		    public void clickButton(String buttonCaption){

		         driver.findElementByName(buttonCaption).click();

		    }

		    

		    //Click on login button

		    public WebElement getContents(){

		    	return CalculatorResult = driver.findElementByAccessibilityId("CalculatorResults");

		    }

}
