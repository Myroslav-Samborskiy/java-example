import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FirstTest extends TestBase{

    @Test
    public void myFirstTest(){
        driver.get("http://google.com");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id = 'lst-ib']"));
        searchInput.sendKeys("selenium");
        searchInput.sendKeys(Keys.ENTER);
        System.out.println(driver.manage().getCookies());
    }
}
