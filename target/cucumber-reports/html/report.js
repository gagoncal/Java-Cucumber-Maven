$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchAmazon.feature");
formatter.feature({
  "line": 1,
  "name": "Search Amazon",
  "description": "This feature searches amazon for an item , verifies that specific item is returned with success, and adds it to the cart",
  "id": "search-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search",
  "description": "",
  "id": "search-amazon;search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I load the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login with email and password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I search for \"aspirador de coche\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I add item from brand \"AUELEK\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the item in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepdef.iLoadTheWebsite()"
});
formatter.result({
  "duration": 2774451344,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepdef.iLoginWithEmailAndPassword()"
});
formatter.result({
  "duration": 2416211616,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aspirador de coche",
      "offset": 14
    }
  ],
  "location": "SearchStepdef.iSearchFor(String)"
});
formatter.result({
  "duration": 1640920189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUELEK",
      "offset": 23
    }
  ],
  "location": "SearchStepdef.iAddItemFromBrand(String)"
});
formatter.result({
  "duration": 3344046126,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepdef.iShouldSeeTheItemInMyCart()"
});
formatter.result({
  "duration": 1612548856,
  "status": "passed"
});
formatter.after({
  "duration": 159170101,
  "status": "passed"
});
});