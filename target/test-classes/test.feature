Feature: test
  Scenario: test1 execution
    Given test1 given
    Then test1 then

  Scenario: test2 execution
    Given test2 given
    Then test2 then

  Scenario: Navigate and listen to console logs
    Given I navigate to website
    When Navigate to Other website "https://www.amazon.com/"
    Then Title should be "Amazon" of website