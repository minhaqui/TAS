#Jorge Vinícius Diniz e Lima - jvdl
Feature: Show statistics about evaluations
	As a teacher
	I want to see the percentage of students who gave the right answer to a question
	So that I can know what percentage understand that subject

Scenario: Show percentage of students who gave right answer
	Given I am at Teacher Assistant's evaluation "Mini Prova 1" page
	When I press "Show Statistics" next to the question "Question 2"
	Then I should see the percentage of students who gave the "a" as the answer
	And I should see the percentage of students who gave the "b", "c" or "d" as the answer
	And I should see the percentage of students who did not gave neither "a", "b", "c" or "d" as the answer