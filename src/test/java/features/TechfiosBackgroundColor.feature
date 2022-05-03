Feature: Techfios set Background color functionality validation


Scenario: Sky Blue Background
Given "Set sky blue Background" button exist
When I click on the button
Then the background color will change to sky blue

#Scenario: White Background change
#Given "Set white Background" button exist
#When I click on the white button
#Then the background color will change to white

Examples;
|skybluecolor|whitecolor|
|Set sky blue Background|Set white Background|