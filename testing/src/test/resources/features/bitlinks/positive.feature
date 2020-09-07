@positive
Feature: These are end-to-end tests for bitly api service to create bitlinks.

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to test when a user creates a bit link
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse |
      | BITLY_V4           | FullShorten              | 200         | bit.ly       | https://www.bbc.co.uk/news | BitlinkBody            |

  Scenario Outline: This is to test when a user creates a bit link and validate response values
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |
    And receives response with field value
      | jsonPath   | value               |
      | $.long_url | <long_required_url> |

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse |
      | BITLY_V4           | FullShorten              | 200         | bit.ly       | https://www.bbc.co.uk/news | BitlinkBody            |


