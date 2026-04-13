import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Joseph Nader Safwat 2022170896
 SWE4 */

public class Exercise1 {
    WebDriver driver;

    @BeforeTest
    public void openWebSite() {
        driver = new ChromeDriver();
        System.out.println("Before Test: Opening Website");
        driver.get("https://www.amazon.eg/");
    }

    @Test(priority = 1)
    public void signUp() {
        System.out.println("Test Priority 1: In Sign Up");
    }

    @Test(priority = 2)
    public void logIn() {
        System.out.println("Test Priority 2: In Login");
    }

    @Test(priority = 3)
    public void addToCart() {
        System.out.println("Test Priority 3: In Add To Cart");
    }

    @AfterTest
    public void logOut() {
        System.out.println("After Test: In Log Out");
        driver.quit();
    }
}