Feature: check user is able to login
Scenario:check login page
Given login page should open in default browser
When click on eaddress <email> and passw <password>
Then successfully login and return to homepage
Examples:
|email|password|
|raviyasaswini14@gmail.com|A12345678|
