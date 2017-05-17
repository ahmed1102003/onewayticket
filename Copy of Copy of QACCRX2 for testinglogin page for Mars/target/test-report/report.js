$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/BDD/Testingloginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Testing login page",
  "description": "",
  "id": "testing-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing login page",
  "description": "",
  "id": "testing-login-page;testing-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User at login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter Admin  in the username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter Admin  in the password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\u0027Welcome\u0027 message will display at \u0027/html/body/h1\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "testingloginsteps.user_at_login_page()"
});
formatter.result({
  "duration": 11535833283,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin ",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 22
    }
  ],
  "location": "testingloginsteps.I_enter_username_in_the(String,String)"
});
formatter.result({
  "duration": 1343898053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin ",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "testingloginsteps.I_enter_username_in_the(String,String)"
});
formatter.result({
  "duration": 1143790680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "testingloginsteps.I_click_on_ID_button(String)"
});
formatter.result({
  "duration": 1507557665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 1
    },
    {
      "val": "/html/body/h1",
      "offset": 35
    }
  ],
  "location": "testingloginsteps.Check_Messages(String,String)"
});
formatter.result({
  "duration": 137422423,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Welcome]\u003e but was:\u003c[HTTP Status 404 - /logIn/Login]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat secondCCRX.secondCCRX.testingloginsteps.Check_Messages(testingloginsteps.java:154)\n\tat ✽.Then \u0027Welcome\u0027 message will display at \u0027/html/body/h1\u0027(src/test/BDD/Testingloginpage.feature:9)\n",
  "status": "failed"
});
});