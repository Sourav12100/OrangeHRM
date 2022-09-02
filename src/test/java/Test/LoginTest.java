package Test;

import Pages.PageFactory;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getMenu().menu();
    }
    public void close(){
        driver.close();
    }
}

