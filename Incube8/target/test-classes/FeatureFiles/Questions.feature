@Solution_Question
Feature: Automate : Scenarios
  
  @Search
  Scenario Outline: Search for a serial click on it and validate the details
  
    Given User launches the IMDb application
    And click on the "<Shows>" from the dropdown menu
    When I search for a "<Serial>" to fetch the results
    And click on the "<Serial_Name>" of your choice
    Then I validate the Title "<Title>" of the page
    And I validate the RatingValue "<RatingValue>" of the serial
    And I validate the RatingCount "<RatingCount>" of the "<Serial_Name>"
    And I close the browser

  Examples: 
      | 			Shows     |			Serial     |					Serial_Name          |													Title                       |RatingValue|RatingCount|
      | Top Rated Shows |Game of Thrones |Game of Thrones: The Last Watch|Game of Thrones: The Last Watch (TV Movie 2019) - IMDb|     7.2   |    5,749  |

  @LoginIn
  Scenario Outline: Create an Account and login to IMDB
  
    Given User launches the IMDb application on the browser
    And the user clicks on the sign in button
    And the user decides to create a new Account
    And the user enters "<Name>" and "<Email_Address>" to register
    And the user enters "<Password>" password
    And the user re-enters the "<Password>" password
    Then the user clicks on create your Imdb Account
    And user closes the browser
    
    

  Examples: 
      | 		Name     |				Email_Address  				 | 	 Password |
      |			James		 | James.BigBangtheory@gmail.com |	India@007 |