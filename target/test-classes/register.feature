@register

  Feature: AS A user i want to register on registration page

    Scenario: Registration
      Given I am on the home page
      And I click on registerbutton
      And I select Gender
      And I enter Name
      And I enter lastname
      And I enter Day
      And I enter month
      And I enter year
      And I enter my e-mail
      And I enter password
      And I enter confirm Password
      And I click on registerbtn
      Then I Should see "Your registration completed"
  And I submit my register btn
      And I click on computerbtn
     And I click on notebook
      And user should see applemcbook description
      And I Addtocart applemcbook
      And I click on shopping cart
    And I click terms and conditionbtn
      And I click on checkoutbtn
      And I enter email checkoutpage
      And I enter password checkout page
      And I click on continue two
     And I click on terms two
      And I click on checkout two
      And I select country
      And I select city
      And I enter the address
      And I enter my zipcode
     And I entered my phone number
      And I clicked on continue button
      And I then clicked on continue button agian
      And I then cliked on payment continue button
      And I then clicked on continue btn
     And I clicked on comfirm button
      And I should see "Your order has been successfully processed"




