import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class base {

    public static WebDriver driver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}
