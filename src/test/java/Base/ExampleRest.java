package Base;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class ExampleRest {

    public Response response=null;
    public JSONObject jsonObject=null;
    public JsonPath jpath=null;

    public void request(String uri){

        RestAssured.baseURI="https://bnb.data.bl.uk/doc/resource";
        RequestSpecification req = RestAssured.given();
        response =req.request(Method.GET,uri);
        jsonObject= new JSONObject(response.body().asString());
        jpath =response.jsonPath();


    }
}
