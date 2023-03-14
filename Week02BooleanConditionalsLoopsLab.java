//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Boolean & Conditionals Lab
// Java Week 02 Lab
//
package week02;

public class Week02BooleanConditionalsLoopsLab {

  public static void main(String[] args) {

    //
    // BOOLEANS and CONDITIONALS:
    //

    // 1. Variable Declaration:
    // a. Create a variable named age and assign it a value of 14
    System.out.println("Q1. Variable Declaration: "
        + "\n a. Create a variable named age and assign it a value of 14.");
    
    int age = 14;
    System.out.println("\nage is assigned to " + age);


    // 2. Print a Boolean Expression:
    // a. Print the boolean expression age >= 16 to the console and note the results.
    // b. Change the value of age to 18 and print again.
    System.out.println("\n Q2. Print a Boolean Expression: "
        + "\n a. Print the boolean expression age >= 16 to the console and note the results. "
        + "\n a. Change the value of age to 18 and print again.");
    
    System.out.println("\nage >= 16 " + (age >= 16));
    age = 18;
    
    System.out.println("\nage is changed to " + age);
    System.out.println("age >= 16 " + (age >= 16));


    // 3. Can you drive?
    // a. Using a conditional, print one of the following:
    // i. "You can drive" if age is greater than or equal to 16
    // ii. "You cannot drive" otherwise
    //
    // a. Change the value of age and rerun to see the result
    System.out.println("\n Q3. Can you drive? "
        + "\n a. Using a conditional, print one of the following: "
        + "\n i. \"You can drive\" if age is greater than or equal to 16 "
        + "\n ii. \"You cannot drive\" otherwise "
        + "\n a. Change the value of age and rerun to see the result ");
    if(age >= 16) {
      System.out.println("\nYou can drive because your age is " + age);
    }else {
      System.out.println("\nYou cannot drive because your age is " + age);
    }
    
    

    // 4. Update Solution to Question 3 as follows:
    // a. Add a new variable called hasLicense before the conditional.
    // b. Change the boolean expression in the conditional to additionally
    // include the need for hasLicense to be true.
    // c. Try changing the values of age and hasLicense and note the different results.
    
    System.out.println("\n Q4. Update Solution to Question 3 as follows: "
        + "\n a. Add a new variable called hasLicense before the conditional. "
        + "\n b. Change the boolean expression in the conditional to additionally "
        + "\n include the need for hasLicense to be true. "
        + "\n c. Try changing the values of age and hasLicense and note the different results. ");
    
    boolean hasLicense = true;
    System.out.println("\nhasLicense initialized as " + hasLicense);
    System.out.println("age is " + age);
    
    if(age >= 16 && hasLicense == true) {
      System.out.println("You can drive");
    }else if(age >= 16 && hasLicense == false){
      System.out.println("You cannot drive because you don't have a license.");
    }else {
      System.out.println("You cannot drive");
    }


    // 5. Milk?
    // a. Create two new variables - costOfMilk and thirstLevel
    // b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
    // or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
    // c. Change the values and note the different results.
    
    System.out.println("\n Q5. Milk? "
        + "\n a. Create two new variables - costOfMilk and thirstLevel "
        + "\n b. Create a new conditional that prints \"Milk Please\" if costOfMilk is less than 2.50 "
        + "\n or if thirstLevel is greater than 6 and prints \"No Thanks\" otherwise. "
        + "\n c. Change the values and note the different results. ");
    
    double costOfMilk = 10.0;
    int thirstLevel = 7;
    
    System.out.println("\nCost Of Milk initialized as " + costOfMilk);
    System.out.println("Thirst Level initialized as " + thirstLevel);
    
    if(costOfMilk < 2.50 || thirstLevel > 6)
      System.out.println("Milk Please");
    else
      System.out.println("No Thanks");
    



    // 6. Cookie Distribution:
    // Note: You will evenly distribute all of the cookies to the children
    // and as the adult you get to keep the remaining cookies for yourself.
    //
    // a. Create two variables called numberOfCookies and numberOfChildren.
    // b. Initialize the two variables to integer values.
    // b. Use a conditional to print the following based on the following conditions:
    // i. If there are 0 cookies remaining, print "Sad Face"
    // ii. If there are less than 2 cookies, print "Yes!"
    // iii. If there are less than 5 cookies, print "Whoohoooo!"
    // iv. If there are 5 or more cookies, print "Jackpot!"

    System.out.println("\n Q6. Cookie Distribution: "
        + "\n Note: You will evenly distribute all of the cookies to the children "
        + "\n and as the adult you get to keep the remaining cookies for yourself."
        + "\n a. Create two variables called numberOfCookies and numberOfChildren. "
        + "\n b. Initialize the two variables to integer values. "
        + "\n b. Use a conditional to print the following based on the following conditions: "
        + "\n i.  If there are 0 cookies remaining, print \"Sad Face\" "
        + "\n ii. If there are less than 2 cookies, print \"Yes!\" "
        + "\niii. If there are less than 5 cookies, print \"Whoohoooo!\" "
        + "\n iv. If there are 5 or more cookies, print \"Jackpot!\" ");
    
    int numberOfCookies = 15;
    int numberOfChildren =  10;
    int remainingCookies = numberOfCookies % numberOfChildren;
    
    System.out.println("\nNumber Of Cookies initialized as " + numberOfCookies);
    System.out.println("Number Of Children initialized as " + numberOfChildren);
    
    if(remainingCookies == 0)
      System.out.println("Sad Face");
    else if(remainingCookies < 2)
      System.out.println("Yes!");
    else if(remainingCookies < 5)
      System.out.println("Whoohoooo!");
    else
      System.out.println("Jackpot!");


    // 7. Loyalty Member Program:
    // a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
    // b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
    // c. Using a switch, set the value of loyaltyMemberDiscount based on
    // the following loyaltyMemberStatus scale:
    // i. "SILVER" is 0.10
    // ii. "GOLD" is 0.15
    // iii. "PLATINUM" is 0.25

    System.out.println("\n Q7. Loyalty Member Program: "
        + "\n a. Create a variable called loyaltyMemberStatus and assign the value \"SILVER\" "
        + "\n b. Create a variable called loyaltyMemberDiscount and assign the value 0.0 "
        + "\n c. Using a switch, set the value of loyaltyMemberDiscount based on "
        + "\n the following loyaltyMemberStatus scale: "
        + "\n i.  \"SILVER\" is 0.10 "
        + "\n ii. \"GOLD\" is 0.15 "
        + "\niii. \"PLATINUM\" is 0.25 ");
    
    String loyaltyMemberStatus = "SILVER";
    double loyaltyMemberDiscount = 0.0;
    
    System.out.println("\nLoyalty Member Status initialized as " + loyaltyMemberStatus);
    System.out.println("Loyalty Member Discount initialized as " + loyaltyMemberDiscount);
    
    switch(loyaltyMemberStatus) {
      case "SILVER":
        loyaltyMemberDiscount  = 0.10;
        break;
      case "GOLD":
        loyaltyMemberDiscount  = 0.15;
        break;
      case "PLATINUM":
        loyaltyMemberDiscount  = 0.25;
        break;
    }
    
    
    System.out.println("\nLoyalty Member Status is " + loyaltyMemberStatus);
    System.out.println("Loyalty Member Discount is " + loyaltyMemberDiscount);



    // 8. Using the Loyalty Member Program variables from Question 7, do the following:
    // a. Create a variable called billTotal and assign a value
    // b. Create a variable called adjustedTotal and assign it the billTotal minus
    // the loyaltyMemberDiscount percent of the billTotal
    // c. If the adjustedBillTotal is greater than $500 upgrade the
    // loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
    
    System.out.println("\n Q8. Using the Loyalty Member Program variables from Question 7, do the following: "
        + "\n a. Create a variable called billTotal and assign a value "
        + "\n b. Create a variable called adjustedTotal and assign it the billTotal minus "
        + "\n the loyaltyMemberDiscount percent of the billTotal "
        + "\n c. If the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM ");
    
    double billTotal = 1000.00;
    System.out.println("\nBill Total initialized as " + billTotal);
    
    double adjustedTotal = billTotal - ((billTotal * loyaltyMemberDiscount));
    System.out.println("\nLoyalty Member Discount is " + loyaltyMemberDiscount);
    System.out.println("Adjusted Total becomes " + adjustedTotal);
    
    if(adjustedTotal > 500)
      if(loyaltyMemberStatus.equalsIgnoreCase("SILVER"))
        loyaltyMemberStatus = "GOLD";
      else if(loyaltyMemberStatus.equalsIgnoreCase("PLATINUM"))
        loyaltyMemberStatus = "GOLD";
    
    System.out.println("\nLoyalty Member Status is " + loyaltyMemberStatus);
    
    



    // 9. Login -- username & password:
    // a. Create two variables, username and password
    // b. Create a conditional that prints one of the following:
    // i. "login successful" if the username is "Tommy123" and the password is "12345"
    // ii. "access denied" otherwise
    System.out.println("\n Q9. Login -- username & password: "
        + "\n a. Create two variables, username and password "
        + "\n b. Create a conditional that prints one of the following: "
        + "\n i. \"login successful\" if the username is \"Tommy123\" and the password is \"12345 "
        + "\n ii. \"access denied\" otherwise");
    String userName = "Tommy123";
    String password = "12345";
    if(userName.equals("Tommy123") && password.equals("12345")) 
      System.out.println("\nlogin successful");
    else
      System.out.println("\naccess denied");


    //
    // LOOPS:
    //

    // 10. Write a for loop that prints each number from 0 to 9

    System.out.println("\n Q10. Write a for loop that prints each number from 0 to 9");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }



    // 11. Write a for loop that prints each number from 10 to 0 backwards
    System.out.println("\n Q11. Write a for loop that prints each number from 10 to 0 backwards");
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }



    // 12. Write a for loop that prints every other number from 0 to 100
    System.out.println("\n Q12. Write a for loop that prints every other number from 0 to 100");
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }



    // 13. Write a for loop that iterates from 0 to 100 and prints
    // "EVEN" if the number is even and "ODD" if it's odd
    System.out.println("\n Q13. Write a for loop that iterates from 0 to 100 and prints "
        + "\"EVEN\" if the number is even and \"ODD\" if it's odd");
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0)
        System.out.println(i + " EVEN");
      else
        System.out.println(i + " ODD");
    }




    // 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
    // within the loop, divide each number by 3 and print the remainder to the console.
    System.out.println("\n Q14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0 "
        + " \n within the loop, divide each number by 3 and print the remainder to the console. ");
    int count = 100;
    while(count >= 0) {
      System.out.println("Remaindeer of " + count + " / 3  is " + (count % 3));
      count--;
    }

    
  }

}
