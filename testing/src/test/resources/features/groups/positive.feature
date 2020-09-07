Feature: These are end-to-end tests for bitly api service on group calls.

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to call group by group id to validate response fields
    When queries for groups
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    When queries for group id "group_id" of first group "<jsonFirstGroupPath>"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                         |
      | <modelFamilyVersion> | <modelGroupByGroupIdClassNameResponse> |

    Examples:
      | modelFamilyVersion | status_code | modelGroupByGroupIdClassNameResponse | modelGroupsClassNameResponse | jsonFirstGroupPath |
      | BITLY_V4           | 200         | Group                                | Groups                       | $.groups[0].guid   |

  Scenario Outline: This is to call group by group id to validate response fields
    When queries for groups
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    When queries for group id "group_id" of first group "<jsonFirstGroupPath>"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                         |
      | <modelFamilyVersion> | <modelGroupByGroupIdClassNameResponse> |
    And receives response with field value
      | jsonPath            | value        |
      | $.guid              | Bk91anfK0He  |
      | $.name              | o_7g6pipio8q |
      | $.organization_guid | Ok91alGdvgT  |

    Examples:
      | modelFamilyVersion | status_code | modelGroupByGroupIdClassNameResponse | modelGroupsClassNameResponse | jsonFirstGroupPath |
      | BITLY_V4           | 200         | Group                                | Groups                       | $.groups[0].guid   |
