package module;

import Base.ExampleRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class StepDefinitions extends ExampleRest {

    @Given("I load base url {string}")
    public void i_load_base_url(String uri) {
        request(uri);
    }

    @When("I get {string}")
    public void i_get(String responseCode) {
        Assert.assertEquals(response.getStatusCode(),Integer.parseInt(responseCode));
    }
    @Then("I can validate  definition as {string}")
    public void i_can_validate_definition_as(String expected) {
        //System.out.println("lable text --> "+jsonObject.getJSONObject("result").getString("label"));
        Assert.assertTrue(jsonObject.getJSONObject("result").getString("definition").contains(expected));
    }
    @Then("I can validate label as {string}")
    public void i_can_validate_label_as(String expected) {
        //System.out.println(" label -->"+jpath.getMap("result").get("label"));
        Assert.assertTrue(jpath.getMap("result").get("label").toString().contains(expected));
    }


}
