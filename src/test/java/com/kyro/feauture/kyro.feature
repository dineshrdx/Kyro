Feature: Create The New Task In Particular Project

@smokeTest
Scenario: login In The Application And Navigate to Dashboard
Given user Launch The Application
When user Click The Login Button And It Will Navigate To Login Page
And user Enter The username In Username Field
And user Enter The password In Password Field
And user Click The Login Button And It  Will Navigate To Home page
Then click The Dashboard Button And It Will Navigate To Dashboard Page


@sanityTest
Scenario: create The New task In The Exciting Project
When Click The Working Project And It Will Navigate To Project Detail Page
And click The New Task Button In The Project Page
And enter The Summary In The Summary Field
And enter The Test-type In The Test-type Field
And enter The Description In The Description Field 
And enter The Priority In The priority Field
And enter The Location In The Location Field
And enter The Start-Date In The State-Date Field
And enter The Due-Date In The Due-Date Field
Then click The Submit Button And It Will Create New task

@regressionTest
Scenario: check Whether The New Task Created Or Not
Then by Using Isdisplayed To Check The Task 