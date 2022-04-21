Feature:Sepete Ekle test
  Scenario:Add basket and read price

    Given go to kitapyurrdu website
    And click kirtasiye
    And click books
    And click books details
    And add basket
    And click basket
    When change the price
    Then read books price