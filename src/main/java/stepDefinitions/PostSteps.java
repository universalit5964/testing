package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
public class PostSteps {
    @Given("User should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
        System.out.println("User should be logged in and should be present at its own wall");
    }
    @When("I type the message in the text box")
    public void i_type_the_message_in_the_text_box() {
        System.out.println("I type the message in the text box");
    }
    @When("I type the message as {string} in the text box")
    public void i_type_the_message_as_in_the_text_box(String text) {
        System.out.println(text);
    }

    @When("click on Post button")
    public void click_on_post_button() {
        System.out.println("click on Post button");
    }
    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        System.out.println("the message should get posted");
    }

    @And("should be present on his own wall")
    public void shouldBePresentOnHisOwnWall(){
        System.out.println("shouldBePresentOnHisOwnWall");

    }

    @When("User supply the youtube link in the text box")
    public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println("user_supply_the_youtube_link_in_the_text_box");
    }

    @Then("Then video should get posted on the user wall")
    public void then_video_should_get_posted_on_the_wall() {
        System.out.println("Then video should get posted on the user wall");
    }

    @Then("the video should have proper thumbnail")
    public void the_video_should_have_proper_thumbnail() {
        System.out.println("the_video_should_have_proper_thumbnail");
    }
    @When("User supply the youtube link as {string} in the text box")
    public void user_supply_the_youtube_link_as_in_the_text_box(String url) throws Throwable {
        System.out.println(url);
    }

}

