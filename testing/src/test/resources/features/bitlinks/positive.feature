Feature: These are end-to-end tests for bitly api service

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to test when a user creates a bit link
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
#     | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.deeplinks | '[{"app_uri_path": "/store?id=123456\"},{"app_uri_path": "/store?id=123456\"}]' | JSON          |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily | modelClassName           |
      | BITLY_V4    | <modelClassNameResponse> |
    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse |
      | BITLY_V4           | FullShorten              | 200         | bit.ly       | https://www.bbc.co.uk/news | BitlinkBody            |

