import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomeTest {
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "c:/Users/Mehak Singla/Desktop/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void homeTest(){
        driver.get("https://zomato.com");
    }

    @BeforeSuite
    public void setUp(){
        System.out.println("AT Suite");

    }

    @BeforeTest
    public void beforetest(){
        System.out.println("Doing somethingbefore test");
    }

    @Test
    public void anotherTC(){
        System.out.println("Another Test");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("Destroyed After Test");
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("At Suite Terminator");
    }
}


