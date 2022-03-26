Feature: Test scenarios for the search item functionality on Wildberries

  Scenario: Search an item

    Given User is on the "Home Page"
    When User enters an item as "тетрадь" on "Home Page"
    Then User is successfully navigated to the "https://www.wildberries.ru/catalog/0/search.aspx?search=%D1%82%D0%B5%D1%82%D1%80%D0%B0%D0%B4%D1%8C"
    And the sentence "тетрадь" on "Search Page" is present at the top of the page


  Scenario Outline: Search an item (negative)
    Given User is on the "Home Page"
    When User enters an item as "<element>" on "Home Page"
    Then User gets the error message "По Вашему запросу ничего не найдено." on "Search Page"

    Examples:
      | element          |
      | sdlfklhdskfjdhsk |
      | 123              |

