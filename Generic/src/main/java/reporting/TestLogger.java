package reporting;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class TestLogger {
    public static void log(final String message){
        Reporter.log(message,true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
    public static void log(final StringUtils message){
        Reporter.log(message + "<br>",true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
    public static void log(final String message, WebDriver driver){
        Reporter.log(message,true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
}
