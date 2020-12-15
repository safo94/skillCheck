Feature: CRUD-1

  Background:
    * configure report = { showLog: true, showAllSteps: false}
    * def jsonRequest = read('classpath:api//json//Actors.json')

  @alabala
  Scenario: CRUD
    # Create
    Given url baseUrl + "/actor"
    * set jsonRequest[0].first_name = 'Qazoglan'
    * set jsonRequest[0].last_name = 'Ograshov'
    * remove jsonRequest[0].actor_id
    * remove jsonRequest[0].last_update
    And request jsonRequest
    Then method post
    And status 201
    # Get & verify
    Then  url baseUrl + '/actor?first_name=eq.Qazoglan'
    And method get
    * def act = response[0].actor_id
    And match response[0].first_name == 'Qazoglan'
    Then status 200
    # Update
    Then  url baseUrl + '/actor?actor_id=eq.' + act
    * set jsonRequest[0].first_name = 'Keramet'
    * set jsonRequest[0].last_name = 'Osturagchi'
    * set jsonRequest[0].actor_id = act
    Then request jsonRequest
    And method put
    Then status 204
    # Verify
    Then  url baseUrl + '/actor?actor_id=eq.'+act
    And method get
    Then match response[0].first_name == 'Keramet'
    And status 200
    # Delete
    Then  url baseUrl + '/actor?actor_id=eq.'+act
    And method delete
    And status 204











