package Base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Common
{
    public WebDriver driver;

    @BeforeClass
    public void Home() {
        driver = new ChromeDriver();
        System.out.println("QUSO Home Page");
        driver.get("https://app.quso.ai/auth/login");
        driver.manage().window().maximize();
    }
//    @BeforeTest
//    public void Zoomout() {
//        Actions actions = new Actions(driver);
//        for (int i = 0; i < 3; i++) {
//            actions.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
//        }

//    }
}


