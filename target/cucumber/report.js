$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginFromDB.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "login-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1954718900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User Should be Able to Login to Techfios",
  "description": "",
  "id": "login-functionality-validation;user-should-be-able-to-login-to-techfios",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Scenario100"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launch techfios website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User inserts \"username\" from data base",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User inserts \"password\" from data base",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestDefinition.user_launch_techfios_website()"
});
formatter.result({
  "duration": 793496000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 14
    }
  ],
  "location": "TestDefinition.user_inserts_from_data_base(String)"
});
formatter.result({
  "duration": 3283838600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 14
    }
  ],
  "location": "TestDefinition.user_inserts_from_data_base(String)"
});
formatter.result({
  "duration": 3107771400,
  "status": "passed"
});
formatter.match({
  "location": "TestDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3855253000,
  "status": "passed"
});
formatter.match({
  "location": "TestDefinition.user_should_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 43336800,
  "status": "passed"
});
formatter.after({
  "duration": 656597900,
  "status": "passed"
});
});