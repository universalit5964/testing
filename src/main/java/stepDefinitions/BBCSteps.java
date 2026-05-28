package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
public class BBCSteps {
    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("I open the BBC homepage")
    public void i_open_the_bbc_homepage(){
        driver.get("https://www.bbc.com");
    }
    @When("I click on the News link")
    public void i_click_on_the_news_link(){
        driver.findElement(By.linkText("News")).click();
    }

    @Then("I should see {string} in the page title")
    public void i_should_see_in_the_page_title(String expectedText){
        String title = driver.getTitle();
        assertTrue("Page title does not contain expected text",title.contains(expectedText));
    }
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }


}
