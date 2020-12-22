Feature: test API
@xx
  Scenario Outline: i need to test api
    Given I load base url "<baseURL>"
    When I get "<response>"
    Then I can validate  definition as "<definition>"
    Then I can validate label as "<label>"

    Examples:
      | baseURL         | response | definition     | label     |
      | /007446989.json | 200      | bnb.data.bl.uk | On parade |
