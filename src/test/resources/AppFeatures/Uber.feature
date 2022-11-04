
@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "Sedan" from Uber app
When User selects car "Sedan" and pick up point is "Bangalore" to drop location as "Pune"
Then Driver starts the car
And Driver ends the journey
Then User pays 1000 USD

@Regression @Smoke
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from Uber app
When User selects car "Sedan" and pick up point is "Bhopal" to drop location as "Kolkata"
Then Driver starts the car
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from Uber app
When User selects car "Sedan" and pick up point is "Mumbai" to drop location as "Goa"
Then Driver starts the car
And Driver ends the journey
Then User pays 1000 USD