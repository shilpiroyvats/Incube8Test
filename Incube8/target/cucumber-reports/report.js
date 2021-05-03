$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/FeatureFiles/Questions.feature");
formatter.feature({
  "name": "Automate : Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Solution_Question"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search for a serial click on it and validate the details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "User launches the IMDb application",
  "keyword": "Given "
});
formatter.step({
  "name": "click on the \"\u003cShows\u003e\" from the dropdown menu",
  "keyword": "And "
});
formatter.step({
  "name": "I search for a \"\u003cSerial\u003e\" to fetch the results",
  "keyword": "When "
});
formatter.step({
  "name": "click on the \"\u003cSerial_Name\u003e\" of your choice",
  "keyword": "And "
});
formatter.step({
  "name": "I validate the Title \"\u003cTitle\u003e\" of the page",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the RatingValue \"\u003cRatingValue\u003e\" of the serial",
  "keyword": "And "
});
formatter.step({
  "name": "I validate the RatingCount \"\u003cRatingCount\u003e\" of the \"\u003cSerial_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Shows",
        "Serial",
        "Serial_Name",
        "Title",
        "RatingValue",
        "RatingCount"
      ]
    },
    {
      "cells": [
        "Top Rated Shows",
        "Game of Thrones",
        "Game of Thrones: The Last Watch",
        "Game of Thrones: The Last Watch (TV Movie 2019) - IMDb",
        "7.2",
        "5,749"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for a serial click on it and validate the details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Solution_Question"
    },
    {
      "name": "@Search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the IMDb application",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario1.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the \"Top Rated Shows\" from the dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.clickOnMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for a \"Game of Thrones\" to fetch the results",
  "keyword": "When "
});
formatter.match({
  "location": "Scenario1.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the \"Game of Thrones: The Last Watch\" of your choice",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.serial_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the Title \"Game of Thrones: The Last Watch (TV Movie 2019) - IMDb\" of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario1.titleAssertion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the RatingValue \"7.2\" of the serial",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.ratingValueAssertion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the RatingCount \"5,749\" of the \"Game of Thrones: The Last Watch\"",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.ratingCountAssertion(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create an Account and login to IMDB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginIn"
    }
  ]
});
formatter.step({
  "name": "User launches the IMDb application on the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on the sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "the user decides to create a new Account",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters \"\u003cName\u003e\" and \"\u003cEmail_Address\u003e\" to register",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters \"\u003cPassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "name": "the user re-enters the \"\u003cPassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on create your Imdb Account",
  "keyword": "Then "
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email_Address",
        "Password"
      ]
    },
    {
      "cells": [
        "James",
        "James.BigBangtheory@gmail.com",
        "India@007"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create an Account and login to IMDB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Solution_Question"
    },
    {
      "name": "@LoginIn"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the IMDb application on the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario2.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.clickOnSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user decides to create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.createAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"James\" and \"James.BigBangtheory@gmail.com\" to register",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.enterDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"India@007\" password",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user re-enters the \"India@007\" password",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.reEnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on create your Imdb Account",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario2.createAnAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario2.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});