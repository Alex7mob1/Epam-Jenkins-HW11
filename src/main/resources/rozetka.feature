Feature: Product tests
  Scenario: Check basket
    When Search product in search panel
    Then Find the most expensive product
    Then Add to basket
    Then Check price
