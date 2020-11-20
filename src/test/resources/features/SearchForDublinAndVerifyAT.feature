Feature: Searching Google Maps for Dublin
  User should be able to search for Dublin and verify the headline text and destination field

  Background:
    Given I launch the Google maps homepage and verify google-intro-agree-tagname
    And I agree to cookies google-intro-agree-id

  Scenario: Searching Google Maps for Dublin
    Given I enter Dublin in the google-search-field-css box
    Then I click google-search-button-css button and Dublin is on google-left-panel-css
    Then I click google-directions-icon-xpath icon and Dublin is on google-destination-field-xpath in attribute google-destination-field-attib

