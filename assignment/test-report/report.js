$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/search.features");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "\u0027Open Google, search for “J. P. Morgan”, click the first result returned by Google, verify that the J.P. Morgan logo is shown\u0027",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have open Google url \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add \"J. P. Morgan\" to the search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click the first result returned by Google",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify that the \"J.P. Morgan logo\" is shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 24
    }
  ],
  "location": "Steps.i_have_open_Google_url(String)"
});
formatter.result({
  "duration": 6530696900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J. P. Morgan",
      "offset": 7
    }
  ],
  "location": "Steps.i_add_to_the_search_box(String)"
});
formatter.result({
  "duration": 265718500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_the_Search_Button()"
});
formatter.result({
  "duration": 3027193200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_the_first_result_returned_by_Google()"
});
formatter.result({
  "duration": 4749253600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan logo",
      "offset": 19
    }
  ],
  "location": "Steps.i_verify_that_the_is_shown(String)"
});
formatter.result({
  "duration": 1092559900,
  "status": "passed"
});
});