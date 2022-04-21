Feature:Dil Secimi test
  Scenario: Go to  page and change language

    Given go to kitapyurduu website
    And choose Engish
    And check English text
    When choose Turkish
    Then check Turkish text
