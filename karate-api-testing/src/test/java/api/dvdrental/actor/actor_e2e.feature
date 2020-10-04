Feature: Actors
  This feature is to test actor e2e

  Background:
    * configure report = { showLog: true, showAllSteps: false }
    * def jsonRequest = read('classpath:api/dvdrental/jsonFiles/actor.json')

  @actore2e
  Scenario: CRUD
    #Create actor
    Given url baseUrl + '/actor'
    * set jsonRequest[0].first_name = 'Elza'
    * set jsonRequest[0].last_name = 'Seyidjahanovich'
    * remove jsonRequest[0].actor_id
    * remove jsonRequest[0].last_update
    Then request jsonRequest
    Then method post
    And status 201
     #Get an actor
    Then url baseUrl + '/actor?first_name=eq.Elza&last_name=eq.Seyidjahanovich'
    And method get
    And status 200
    And match response[0].first_name == 'Elza'
    And match response[0].last_name == 'Seyidjahanovich'
    * def act_id = response[0].actor_id
    # Modify actor
    Then url baseUrl + '/actor?actor_id=eq.'+ act_id
    * set jsonRequest[0].actor_id = act_id
    * set jsonRequest[0].first_name = 'Roza'
    * set jsonRequest[0].last_name = 'Zargarovich'
    And request jsonRequest
    And method put
    And status 204
    # Get an actor
    Then url baseUrl + '/actor?actor_id=eq.'+ act_id
    And method get
    And status 200
    And match response[0].first_name == 'Roza'
    And match response[0].last_name == 'Zargarovich'
    # Delete actor
    Then url baseUrl + '/actor?actor_id=eq.'+ act_id
    And method delete
    And status 204
    # Get an actor after delete
    Then url baseUrl + '/actor?actor_id=eq.'+ act_id
    And method get
    And status 200
    And match response[0].first_name == '#notpresent'
