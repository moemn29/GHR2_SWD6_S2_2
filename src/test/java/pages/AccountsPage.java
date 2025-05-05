package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage {
    private WebDriver driver;

    // locate elements example
    private By createBtn = By.cssSelector("a[data-name='create']");
    private By nameField = By.name("name");
    private By saveBtn = By.cssSelector("button[data-name='save']");

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    // functions example
    public void createAccount(String accountName) {
        driver.findElement(createBtn).click();
        driver.findElement(nameField).sendKeys(accountName);
        driver.findElement(saveBtn).click();
    }
}
