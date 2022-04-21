Feature:Sepetten Urun Cikarma test
  Scenario:Delete basket and read price

    Given go to kitapyurrdu website
    And  click signin buttoon
    And send login info
    And click login buttoon
    And click all categories
    And  click science and engineering
    And choose book
    And click add basket
    And go to basketpage
    And give info about book
    When delete the book
    Then show success message