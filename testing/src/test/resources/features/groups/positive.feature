Feature: These are end-to-end tests for bitly api service

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to call group by group id
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


  Scenario Outline: This is to call  sort bitlinks associated to a group id
    When queries for groups
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit | units | unit_reference           | size |
      | day  | 5     | 2020-09-06T00:00:00-0700 | 10   |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName             |
      | <modelFamilyVersion> | <modelSortedLinksResponse> |

    Examples:
      | modelFamilyVersion | status_code | sort_option | modelSortedLinksResponse | modelGroupsClassNameResponse | jsonFirstGroupPath |
      | BITLY_V4           | 200         | clicks      | SortedLinks              | Groups                       | $.groups[0].guid   |
