import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.crm.commonUtility.PropertiUtility;
import com.crm.commonUtility.webdriverUtility;

public class AmazonProgram {
static WebDriver driver;
	public static void main(String[] args) throws Throwable {

		webdriverUtility.initialization();
		webdriverUtility.openBrowser(driver, PropertiUtility.initialization("url"), 0);
	}

}
