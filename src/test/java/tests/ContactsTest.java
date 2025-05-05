package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContactsPage;

public class ContactsTest extends BaseTest {

    @Test
    public void testCreateContact() {
        driver.get("https://demo.espocrm.com/#Contact");
        ContactsPage accountsPage = new ContactsPage(driver);


    }
}
