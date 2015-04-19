Feature: send an evaluation
  As a teacher
  I want to send an evaluation
  So the class can see it


  Scenario: send an evaluation

    Given I am on Teaching Assistant students home page
    When I get to the "evaluation list"
    And I choose the evaluation named "test"
    And I choose to send the evaluation to the students
    Then I should see "the evaluation was sent"
