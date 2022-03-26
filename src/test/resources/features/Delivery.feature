Feature: Test scenario for checking delivery functionality on Wildberries

  Scenario: navigate to the Address Page
    Given User is on the "Home Page"
    Then User clicks on the Map icon.
    When The user is successfully navigated to the "https://www.wildberries.ru/services/besplatnaya-dostavka?desktop=1#terms-delivery"
    And the sentence "Доставка" on "Address Page" is present on the page