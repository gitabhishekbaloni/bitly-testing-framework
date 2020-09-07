Feature: Bitly api services - sorting validations

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to call sort bitlinks associated to a group id with aunthorized access.
    When queries for groups
    Then receives response with status code "200"
    Given I have lost my access
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit | units | unit_reference           | size |
      | day  | 5     | 2020-09-06T00:00:00-0700 | 10   |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | sort_option | jsonFirstGroupPath | modelClassNameErrorResponse | error_message |
      | BITLY_V4           | 403         | clicks      | $.groups[0].guid   | Forbidden                   | FORBIDDEN     |


  Scenario Outline: This is to call  sort bitlinks associated to a group id
    When queries for groups
    Then receives response with status code "200"
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit | units | unit_reference           | size |
      | day  | 5     | 2020-09-06T00:00:00-0700 | 10   |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | sort_option | jsonFirstGroupPath | modelClassNameErrorResponse | error_message    |
      | BITLY_V4           | 400         | flicks      | $.groups[0].guid   | BadRequest                  | INVALID_ARG_SORT |

  Scenario Outline: This is to call sort bitlinks associated to a group id with unit reference causing server side failures
    When queries for groups
    Then receives response with status code "200"
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit | units | unit_reference           | size |
      | day  | 5     | <unit_reference_to_fail> | 10   |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | sort_option | jsonFirstGroupPath | modelClassNameErrorResponse | error_message  | unit_reference_to_fail   |
      | BITLY_V4           | 500         | clicks      | $.groups[0].guid   | InternalError               | INTERNAL_ERROR | 2006-09-06T00:00:00-0700 |


  Scenario Outline: This is to call sort bitlinks associated to a group id with unknown resource
    When sort bitlinks using "<sort_option>" for group id "<valid_group_id>/unknow_group_id"
      | unit | units | unit_reference           | size |
      | day  | 5     | <unit_reference_to_fail> | 10   |
    Then receives response with status code "<status_code>"

    Examples:
      | status_code | sort_option | valid_group_id | unit_reference_to_fail   |
      | 404         | clicks      | Bk91anfK0He    | 2006-09-06T00:00:00-0700 |

  Scenario Outline: This is to call  sort bitlinks associated to a group id
    When queries for groups
    Then receives response with status code "200"
    When sort bitlinks using "<sort_option>" for group id "group_id" of first group "<jsonFirstGroupPath>"
      | unit | units | unit_reference           | size |
      | day  | 5     | <unit_reference_to_fail> | 10   |
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | status_code | sort_option | jsonFirstGroupPath | modelClassNameErrorResponse | error_message  | unit_reference_to_fail   |
      | BITLY_V4           | 500         | clicks      | $.groups[0].guid   | InternalError               | INTERNAL_ERROR | 2006-09-06T00:00:00-0700 |

# TODO: Api is not behaving correctly and working without these values. This needs discussion
#  Scenario Outline: This is to call sort bitlinks associated to a group id without required query params.
#    When sort bitlinks using "<sort_option>" for group id "<valid_group_id>"
#      | unit   | units   |
#      | <unit> | <units> |
#    Then receives response with status code "<status_code>"
#    And receives valid response
#      | modelFamily          | modelClassName               |
#      | <modelFamilyVersion> | <modelErrorResponseResponse> |
#
#    Examples:
#      | modelFamilyVersion | status_code | sort_option | modelErrorResponseResponse | valid_group_id | unit  | units |
#      | BITLY_V4           | 400         | clicks      | BadRequest                 | Bk91anfK0He    | month |       |
#      | BITLY_V4           | 400         | clicks      | BadRequest                 | Bk91anfK0He    |       | 5     |

