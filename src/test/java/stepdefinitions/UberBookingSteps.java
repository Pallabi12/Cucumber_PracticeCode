package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from Uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("Step 1 :"+ carType);
	}

	@When("User selects car {string} and pick up point is {string} to drop location as {string}")
	public void user_selects_car_and_pick_up_point_is_to_drop_location_as(String carType, String pickUpLocation,
			String dropLocation) {
		System.out.println("Step 2 : " + carType+ ", "+ pickUpLocation + ", "+dropLocation);
	}

	@Then("Driver starts the car")
	public void driver_starts_the_car() {
		System.out.println("Step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5 : " + price);
	}

}
