Feature: Bitly api services - creation validations

  Background:
    Given I am authorised to access bitly api service

  Scenario Outline: This is to test unauthorised user accessing bitly service
    Given I have lost my access
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse | error_message |
      | BITLY_V4           | FullShorten              | 403         | bit.ly       | https://www.bbc.co.uk/news | Forbidden              | FORBIDDEN     |

  Scenario Outline: This is to test service with empty required url.
    And I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url | modelClassNameResponse | error_message        |
      | BITLY_V4           | FullShorten              | 400         | bit.ly       |                   | BadRequest             | INVALID_ARG_LONG_URL |

  Scenario Outline: This is to test service with with a path not present in service.
    And I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When try creating bitlink as "newBitLink" for payload "bitlyPayload" on url "/bitlinks/something"
    Then receives response with status code "<status_code>"

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          |
      | BITLY_V4           | FullShorten              | 404         | 123.com      | https://www.bbc.co.uk/news |


  Scenario Outline: This is to test service with invalid domain name provided.
    And I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse | error_message      |
      | BITLY_V4           | FullShorten              | 400         | 123.com      | https://www.bbc.co.uk/news | BadRequest             | INVALID_ARG_DOMAIN |

  Scenario Outline: This is to test service when we remove required field(long url) from user request.
    And I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | REMOVE          | $.long_url | <long_required_url> | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName           |
      | <modelFamilyVersion> | <modelClassNameResponse> |
    And receives valid response with message "<error_message>" at "$.message"
    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameResponse | error_message        |
      | BITLY_V4           | FullShorten              | 400         | bit.ly       | https://www.bbc.co.uk/news | BadRequest             | INVALID_ARG_LONG_URL |


  Scenario Outline: This is to test when a user creates a bit link
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath    | value                                                                           | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain    | <domain_value>                                                                  | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.deeplinks | '[{"app_uri_path": "/store?id=123456\"},{"app_uri_path": "/store?id=123456\"}]' | JSON          |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url  | <long_required_url>                                                             | STRING        |
    When creates a bitlink as "newBitLink" for payload "bitlyPayload"
    Then receives response with status code "<status_code>"
    And receives valid response
      | modelFamily          | modelClassName                |
      | <modelFamilyVersion> | <modelClassNameErrorResponse> |
    And receives valid response with message "<error_message>" at "$.message"

    Examples:
      | modelFamilyVersion | modelClassNameForVersion | status_code | domain_value | long_required_url          | modelClassNameErrorResponse | error_message        |
      | BITLY_V4           | FullShorten              | 422         | bit.ly       | https://www.bbc.co.uk/news | UnprocessableEntity         | UNPROCESSABLE_ENTITY |

