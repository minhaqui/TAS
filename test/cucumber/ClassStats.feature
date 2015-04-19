#Jorge Vinícius Diniz e Lima - jvdl
Feature: Show statistics about the class
	As a teacher
	I want to see the percentage of students who passed, who are participating at the forum, and accessing the website
	So that I can know if I am teaching the class right

Scenario: Show percentage of students who passed the class
	Given  I am at the Teacher Assistant statistics page
  	And "Ana" received "MANA" as her "Final Result"
  	And "Pedro" received "MPA" as his "Final Result"
  	And "Tereza" received "MA" as her "Final Result"
	When I press the "Show Statistics"
	Then I should see "33.3%" as the percentage of students who achieved "MANA" as their "Final Result"
	And I should see "33.3%" as the percentage of students who achieved "MPA" as their "Final Result"
	And I should see "33.3%" as the percentage of students who achieved "MA" as their "Final Result"

Scenario: Show percentage of students who still need their evaluation results
	Given I am at the Teacher Assistant's statistics page
  	And "Ana" is missing "Mini Prova 1" results
	When I press the "Show Missing Evaluations"
	Then I should see "Ana is missing Mini Prova 1"

Scenario: Show active students
	Given I am at the Teacher Assistant statistics page
	When I press "Show Activity"
	Then I should see how many different days "Ana" logged into the system
	And I should see how many times "Ana" made a comment