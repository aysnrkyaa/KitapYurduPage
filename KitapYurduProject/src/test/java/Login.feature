Feature:Login  test
  Scenario:go to page and login

    Given go to kitapyurdu website
    And click signin button
    And write username
    And write  password
    When clickk login button
    Then read username