Feature: Number List Manipulation
  "To read a list of 10 numbers ranging between 1 to 100.
  Assuming there are 4 duplicates in the list of numbers, the output should remove the duplicates and sort the remaining numbers in descending order."

  Scenario: Removing duplicates and sorting numbers
    Given a list of numbers ranging between 1 and 100
    When I remove duplicates and sort the numbers in descending order
    Then I should see the sorted unique numbers
