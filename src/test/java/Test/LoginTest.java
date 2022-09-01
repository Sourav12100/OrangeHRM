package Test;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().login();

    }
    public void close(){
        driver.close();
    }
}

