Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User  login into application with "Manvit"and passowrd "1234"
Then Home page is polpulated
And card are displayed "true"
    
    
    
    
   