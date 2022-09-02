package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private Menu menu;
    private AddUser Adduser;

    public PageFactory(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public PageFactory(Menu menu) {
        this.menu = menu;
    }
    public PageFactory(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage getLoginPage()
    {
        if (loginPage == null){
            loginPage =new LoginPage(driver);
        }
        return loginPage;
    }
    public Menu getMenu()
    {
        if (menu == null){
            menu =new Menu(driver);
        }
        return menu;
    }
    public AddUser getAddUser()
    {
        AddUser AddUser = null;
        if (AddUser == null){
            AddUser =new AddUser(driver);
        }
        return AddUser;
    }
   public SystemUSer getSystemUSer;
    if (SystemUser == null){
        SystemUser=new SystemUser(driver);
        
    }

}
