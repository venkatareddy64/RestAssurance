$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "AmazonLogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://amazon.in\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email as \"+917989490529\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"venkat123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page url should be \"https://www.amazon.in/?ref_\u003dnav_ya_signin\u0026\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_url_should_be(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [https://www.amazon.in/ap/signin] but found [https://www.amazon.in/?ref_\u003dnav_ya_signin\u0026]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat Stepdefinitions.Steps.page_url_should_be(Steps.java:69)\r\n\tat ✽.Page url should be \"https://www.amazon.in/?ref_\u003dnav_ya_signin\u0026\"(file:Features/login.feature:10)\r\n",
  "status": "failed"
});
});