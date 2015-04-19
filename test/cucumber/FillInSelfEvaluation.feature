Feature: fill in self-evaluation
  As a student
  I want to fill in my self-evaluation
  So I can send my feedback to the teacher


  Scenario: fill in self-evaluation

    Given I am on Teaching Assistant students home page
    When I get to the "evaluation list"
    And I choose the evaluation named "test"
    And I fill in the fields with my name "Student 1" and the required information
    Then I should see "self-evaluation was sent"
