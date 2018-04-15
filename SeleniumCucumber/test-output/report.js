$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "TOA Smoke Test",
  "description": "",
  "id": "toa-smoke-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to MyQ Application",
  "description": "",
  "id": "toa-smoke-test;login-to-myq-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I logined sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TOAFunctions.open_Chrome_browser()"
});
formatter.result({
  "duration": 22665068345,
  "status": "passed"
});
formatter.match({
  "location": "TOAFunctions.i_enter_valid_username_and_password()"
});
formatter.result({
  "duration": 573717639,
  "status": "passed"
});
formatter.match({
  "location": "TOAFunctions.i_logined_sucessfully()"
});
formatter.result({
  "duration": 40448781033,
  "status": "passed"
});
});