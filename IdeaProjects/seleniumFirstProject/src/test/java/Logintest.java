import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Setting up Login Class");
    }

    @Test
    public void tc1() {
        System.out.println("TestCase 1");
    }

    @Test
    public void tc2(){
        System.out.println("TestCase 2");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("Destroying up Login Class");
    }

}