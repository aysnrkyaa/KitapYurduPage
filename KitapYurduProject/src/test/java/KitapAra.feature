Feature:Kitap Arama test
  Scenario: Go to  page and search book

    Given go to kitapyurdu websitee
    And click signin buttonnn
    And write usernamee
    And writee passwordd
    And click login buttonnn
    And write book name
    And click search button
    When click book
    Then read book name