import org.junit.Test;
import org.openqa.selenium.By;

public class SecondTest extends TestBase{

    @Test
    public void mySecondTest(){
        driver.get("http://myaccount.google.com/intro");
        driver.findElement(By.cssSelector("a.a4SL6d")).click();
    }


}
