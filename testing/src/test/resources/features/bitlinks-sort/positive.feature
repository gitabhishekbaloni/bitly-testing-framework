Feature: These are end-to-end tests for bitly api service to get sorted data.

  Background:
    Given I am authorised to access bitly api service

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

  Scenario Outline: This is to call sort bitlinks associated to a group id and validate response values
    When queries for groups
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                 |
      | <modelFamilyVersion> | <modelGroupsClassNameResponse> |
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit   | units   | unit_reference   | size   |
      | <unit> | <units> | <unit_reference> | <size> |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName             |
      | <modelFamilyVersion> | <modelSortedLinksResponse> |
    And receives response with field value
      | jsonPath            | value                            |
      | $.links[0].link     | https://bit.ly/32YdiDw           |
      | $.links[0].long_url | https://www.facebook.com/comedy/ |

    Examples:
      | modelFamilyVersion | status_code | sort_option | modelSortedLinksResponse | modelGroupsClassNameResponse | jsonFirstGroupPath | unit  | units | unit_reference | size |
      | BITLY_V4           | 200         | clicks      | SortedLinks              | Groups                       | $.groups[0].guid   | month | 5     |                |      |
      | BITLY_V4           | 200         | clicks      | SortedLinks              | Groups                       | $.groups[0].guid   | month | 5     |                | 2    |


