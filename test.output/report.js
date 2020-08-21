$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/currency.feature");
formatter.feature({
  "name": "Cryptocurrency calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get the price of one bit coin",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://invizi.co/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "assignment.base.stepdefinition.StepDefinitionClass.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on calculator",
  "keyword": "When "
});
formatter.match({
  "location": "assignment.base.stepdefinition.StepDefinitionClass.user_clicks_on_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on price of one bit coin",
  "keyword": "Then "
});
formatter.match({
  "location": "assignment.base.stepdefinition.StepDefinitionClass.user_clicks_on_price_of_one_bit_coin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});