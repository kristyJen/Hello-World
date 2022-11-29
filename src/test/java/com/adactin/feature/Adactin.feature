Feature: Hotel Booking In Adactin Application

Scenario: user Login In The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button and It Navigates To Search Hotel Page

Scenario: user Provide The Requirement Details And Search For The Hotel
When user Select The Location
And user Select The Hotel Name
And user Select The Type of Room
And user Select The Number Of Rooms Needed
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Number Of Adults Per Room
And user Select The Number Of Children Per Room
Then user Click The Search Button And It Navigates To Select Hotel Page

Scenario: user Select The Hotel That Matches The Requirement
When user Click The Button Of the Needed Hotel
Then user Click The Continue Button And It Navigates To Book A Hotel Page

Scenario: user Book The Hotel By Giving The Payment Details
When user Enter The Valid First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The CreditCard Number
And user Select The Type Of The CreditCard
And user Provide The Expiry Date Of The Card By Selecting Month And Year
And user Enter The CCV Number Of The Card
Then user Click The Book Now Botton And It Confirm The Booking By Generating The Order Number

Scenario: user Logout Of The Web Application
When user Click The Logout Button
Then user Logged out Of The Appliction And It Goes to Click Here To Login Again Page


