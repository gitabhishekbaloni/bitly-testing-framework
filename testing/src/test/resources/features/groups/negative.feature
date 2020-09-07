Feature: Bitly api services - group call validations

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to call group by group id with unauthorised access
    When queries for groups
    Then receives response with status code "200"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    Given I have lost my access
    When queries for group id "group_id" of first group "<jsonFirstGroupPath>"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | modelGroupsClassNameResponse | jsonFirstGroupPath | modelClassNameErrorResponse | error_message |
      | BITLY_V4           | 403         | Groups                       | $.groups[0].guid   | Forbidden                   | FORBIDDEN     |


  Scenario Outline: This is to call group by group id on unauthorised resource
    When queries for groups
    Then receives response with status code "200"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    When queries for group id "unknow_group_id"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | modelGroupsClassNameResponse | modelClassNameErrorResponse | error_message |
      | BITLY_V4           | 403         | Groups                       | Forbidden                   | FORBIDDEN     |


  Scenario Outline: This is to call group by group id on unknown resource
    When queries for group id "<valid_group_id>/unknow_group_id"
    Then receives response with status code "<status_code>"

    Examples:
      | status_code | valid_group_id |
      | 404         | Bk91anfK0He    |
