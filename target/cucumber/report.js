$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/TechfiosBackgroundColor.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios set Background color functionality validation",
  "description": "",
  "id": "techfios-set-background-color-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2578041900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "techfios-set-background-color-functionality-validation;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set sky blue Background button exist",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefination.Set_sky_blue_Background_button_exist()"
});
formatter.result({
  "duration": 71039900,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefination.i_click_on_the_button()"
});
formatter.result({
  "duration": 2022806600,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefination.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 16551900,
  "status": "passed"
});
formatter.after({
  "duration": 572127300,
  "status": "passed"
});
});