Feature: How to use java code?

  Background:
    * call read('classpath:api/dvdrental/utils.feature')

  Scenario: How to use java code?
    # How to use java code in karate feature file
    # How to call different feature file
    # Authentication in karate
    * print currDate()
    * print pastDate(10)
    * print randomNumber(100)

