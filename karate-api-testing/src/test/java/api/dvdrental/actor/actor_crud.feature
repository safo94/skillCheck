Feature: Create -> Retrieve -> Modify -> Delete
  I want to use this feature to do CRUD in actors table

  Background: 
    * configure report = { showLog: true, showAllSteps: false }
    * def jsonRequest = read('classpath:api/dvdrental/jsonFiles/actor.json')

  @actor
  Scenario: CRUD
    Given url baseUrl + '/actor'
    Then method get

    
    
    
    
    
