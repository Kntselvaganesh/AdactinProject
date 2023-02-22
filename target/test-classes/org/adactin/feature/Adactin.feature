Feature: Validate A Hotel Booking Functionality in Adactin Hotel Booking Application
@Ad1
Scenario: Login Page
Given user Launch The Adactin Url
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login button And It Navigate To Search Hotel Page
@Ad2
Scenario: Search Hotel Page
When user Select The Location In The Location Dropdown
And user Select The Hotel In The Hotels Dropdown
And user Select The Room Type In The Room Type Dropdown
And user Select The Number Of Rooms In The Number Of Rooms Dropdown
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In The Adults Per Room Dropdown
And user Select The Childrens Per Room In The Children Per Room Dropdown
Then user Click The Search button And It Navigate To Select Hotel Page
@Ad3
Scenario: Select Hotel Page
When user Click The Select Radio button
Then user Click The Continue button And It Navigate To Book A Hotel Page
@Ad4
Scenario: Book A Hotel Page
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card No. Field
And user Select The Credit Card Type In The Credit Card Type Dropdown
And user Select The Expiry Month In The Select Month Dropdown
And user Select The Expiry Year In The Select Year Dropdown
And user Enter The Cvv Number In The Cvv Number Field
Then user Click The Book Now button And It Navigate To Booking Confirmation Page
@Ad5
Scenario: Booking Confirmation Page
When user Click The My Itenarary button And It Navigate To My Itenarary Page
@Ad6
Scenario: My Itenarary Page
When user Click On The Check Box 
Then user Click On The Cancel Selected button And Click On The OK button In Alert
Then user Click On The Logout button And It Navigate To Logout Page
@Ad7
Scenario: Logout Page
Then user Click The Click Here To Login Again Text Link And It Navigate To Adactin Login Page  

