Feature: Navigating around the Amazon Website to showcase at the community event

  Background:
    Given A user is on the Amazon homepage

  Scenario Outline: A simple search
    When The user searches for an <item>
    And Selects the first available result
    Then The relevant item: <item> will be displayed
    Examples:
      | item                     |
      | xbox one x               |
      | ps4 pro                  |
      | nintendo switch fortnite |
      | black ops 4              |


  Scenario Outline: Testing nav bar links
    When The user clicks on the <link> in the nav bar
    Then They will be on the correct page for that <link>
    Examples:
      | link              |
      | Your Amazon.co.uk |
      | Today's Deals     |
#      | Gift Cards & Top Up |
      | Sell              |
      | Help              |
      | sign in           |
      | prime             |
      | your lists        |
      | shopping basket   |
