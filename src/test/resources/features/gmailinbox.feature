Feature: Gmail inbox functionality
  As a end user
  I want to check the inbox emails
  So that my emails updated

  @test
  Scenario: search product on flipkart

    Given User is on ebay  homepage
    When user enters valid  credentials on register page
    Then user successfully registered on register page


    @newtest
    Scenario Outline: Registration page
      Given I am in Registration page
      When I select "<Gender>" in Personal details
      And I enter "<Firstname>"
      And I will enter "<Lastname>"
      And I enter date of birth "<Day>","<Month>"and "<Year>"
      And then I enter "<Email>"
      And in Company details I enter "<Company>"
      And in Options deselect the box
      And in your password if I enter "<password>" and "<confirm password>"
      And if I click the Register button
      Then I should see a successful message

      Examples:
        |Gender|Firstname|Lastname|Day|Month|Year|Email|Company|password |confirm password|
        |Female|Shilpa|Ti|23 |November|1986|sslohare@gmail.com|home|GoldRing9|GoldRing9|





