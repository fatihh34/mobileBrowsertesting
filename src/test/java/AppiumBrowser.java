
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBrowser {

    @Test
            public void Mobil() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","13.0");
        desiredCapabilities.setCapability("deviceName","PIXEL4");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //desiredCapabilities.setCapability("browserName","chrome");

        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.apps.chrome.Main");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.chrome");

        //desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
       // desiredCapabilities.setCapability("chromedriverExecutable","C:\\Users\\Lenovo\\IdeaProjects\\mobileBrowsertesting\\src\\driver\\chromedriver.exe");

        AndroidDriver<AndroidElement>driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        //AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723"), caps);


        driver.get("https://www.amazon.com/");
    }
}
