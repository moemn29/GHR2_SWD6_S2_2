package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LeadsPage;

public class LeadsTest extends BaseTest {

    @Test
    public void testCreateLead() {
        driver.get("https://demo.espocrm.com/#Lead");
        LeadsPage accountsPage = new LeadsPage(driver);


    }
}
