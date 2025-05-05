package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.OpportunitiesPage;

public class OpportunitiesTest extends BaseTest {

    @Test
    public void testCreateOpportunity() {
        driver.get("https://demo.espocrm.com/#Opportunity");
        OpportunitiesPage accountsPage = new OpportunitiesPage(driver);


    }
}
