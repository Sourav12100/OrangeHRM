package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddUser {
    WebDriver driver;
    By Add= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    public AddUser(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Click()
    {
        driver.manage().window().maximize();
        driver.findElement(Add).click();
    }

}
