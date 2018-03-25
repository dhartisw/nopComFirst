Feature: Add to basket functionality

  @swara
  Scenario: User want to add some product in basket

    Given  User is on homepage
    When   User click on CLEARANCE
    And    User can see CLEARANCE
    And    User click on Technology
    And    User click on Televisions and accessories
    And    User click on Sky Union Jack Remote Control
    And    User click on Add To Trolley
    And    User click on Go To Trolley
    And   User click on OriginalTechnology
    And  User click on Home audio
    And  User click on Audio accessories
    And  User click on Alba 3.5MM Audio Cable
    And  User click on Add To Trolley
    And  User click on Go To Trolley
    Then User can see product in My Trolley

