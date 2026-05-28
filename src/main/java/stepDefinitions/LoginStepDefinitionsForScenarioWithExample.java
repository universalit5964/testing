package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitionsForScenarioWithExample {
    private WebDriver driver;

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User Navigate to logIn Page")
    public void user_navigate_to_log_in_page() {
        System.out.println("User Navigate to logIn Page");
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("User name is"+ username+ "password is"+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='login-button']")).sendKeys(username);

    }

    @Then("message displayed Login Successfully")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("message displayed Login Successfully");
        Thread.sleep(2000);
        driver.close();
    }
}
