
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

   
    public static void main(String[] args) {
        
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("http://www.fonforum.org/ucp.php?mode=login");
       
       WebElement usernameField=driver.findElement(By.name("username"));
       usernameField.sendKeys("GetSwift");
       
       WebElement passwordField=driver.findElement(By.name("password"));
       passwordField.sendKeys("123456789");
       
       WebElement loginButton=driver.findElement(By.name("login"));
       loginButton.click();
       
       
       
       
     
        
        driver.quit();
    }
    
}
