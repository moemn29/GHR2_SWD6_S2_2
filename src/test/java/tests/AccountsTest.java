package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountsPage;

public class AccountsTest extends BaseTest {

    @Test
    public void testCreateAccount() {
        driver.get("https://demo.espocrm.com/#Account");
        AccountsPage accountsPage = new AccountsPage(driver);

        // example
        accountsPage.createAccount("Demo Automation Account");
    }
}
