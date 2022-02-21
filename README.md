####                    Make Change Project                     ####

###                         Descriptions                         ###


###                   What the program must do                   ###
This program is called Make Change (Cash Register)

  The goal of this program is to make change using a cash register.

  It will have to calculate the amount of change that will be returned to a customer based on the price and the amount tendered

  Once it calculates the change due, the program must then tell the cashier the denominations that the customer is owed, matching the total amount due.

  The program must display the Largest denominations based on the change due. No customer is going to want 1000 pennies back instead $10.




- This program starts by take input from the user; in this case a cashier, asking what is the cost of the item.
  - This input from the cashier is stored into double moneyReceived.

- Then the user(cashier) is asked how much money was received by the customer to pay for the item.
  - This input from the cashier is stored into

- After this, we have to calculate how much change is due which is stored into double changeDue.

- Once changeDue is calculated, the program is jumped into an if condition/statement:
    - The first condition determines whether or not the moneyReceived equals the cost of the item.
      - If this is TRUE, I call a method called printNoChange.
          - At the end of the class CashRegister; outside the main method, I created the method printNoChange.
            - This method contains a System.out that prints the statement "No change, exact cost was provided"

      - If this condition is NOT true, the program enters an Else If condition/statement.
    - The Else If determines if the money received is greater than the cost of the item being purchased.
      If this is TRUE, I call a method called makeChange.
          - Outside of the main, I create the method makeChange.
            - This method determines the denominations the cashier much give the customer.

            *** I will explain this method and how it works exactly, in detail, to produce the denominations.***

                - First, I name and declare the data type and variables to match how much each denominations equals. When doing this I make sure the names match the information as well. Example: double hundreds = $100.0, double twentyFiveCents = $.25

                - After declarations are made, I create a sysout that will display the amount of the customers change.

                  - Inside this sysout, I specifically used printf() to format the information changeDue.

                    - Within this I use %.2f- this will format the changeDue into a string. I use .2 to display the amount of decimals I want to use.
                        If I did not do that, the changeDue would display way more decimals than needed. This cleans the code up, only using the useful information.

                  - After this is enter another sysout that contains an empty string in order to have a line space between the above statement and the next.

                - The program then enters a while loop. This is used to execute the following code over and over again in order to find the change needed in each
                  denomination.

                  - The while loops starts by determine if the changeDue is greater than zero.

                    - If this is TRUE, it will enter into loop and pass into the first IF condition/statement.

                      - If the change due is greater than or equal to 100 the program will enter into the statement following it, which contains the
                          algorithm to find how many 100 dollar bills is given based on the change total.

                          - The algorithm starts by dividing changeDue by pertaining denomination: 100. Then the program will cast the result from a double
                              into an int. The result of this is initialized into the variable, oneHundredDollarBills.

                              - An example of this is: if the change due = 200, then dividing it by the pertaining denomination (100) would equal 2.
                                  This means that 2 one hundred dollar bills would fit into the change due. This is why the variable is called
                                  oneHundredDollarBills(the name matches the denomination were looking for). I use the data type int because I am looking for a
                                  literal value without decimals. ( you cant give someone back 2.1 100 dollar bills)

                            - Once the value of oneHundredDollarBills is found, we print that into a sysout that will output 100 dollar bills and how many
                                there will be in change due.

                            - After the amount of the specific denomination is found, we have to reassign the value of changeDue to reflect the previous    
                                denomination. By doing this we multiple the denomination by how many of that denomination is in the change due, then
                                subtract it from the change due. this will leave us with a remaining amount that we can transfer into the next
                                else if condition/statement.

                        - The else if that comes next contains the exact same content and algorithm except we change they type of denomination
                            and the value it represents. FityDollarBills/50, TwentyDollarBills/20, and so on, including change, TwentyFiveCents/.25 etc.

                        - As the changeDue changes; getting smaller each time, it passed through each else if condition/statement.

                        - After each if or else if, the while loop will restart, run the condition and move to the next else if.

                        - If the change due is not equal or great than the condition, it will skip that else if, and move on to the next until that
                            condition equals true.

                        - When the program reaches the last else if, checking for pennies and how many are require to give back to the customer,
                            the algorithm must be changed. Before the double result of (changeDue*oneCents) is casted to an int, it must round it to
                            the next int. If this does not happen, depending on the amount of change due, a penny could be left off, not matching the correct
                            amount of change due. Another difference in the final algorithm is the program must multiply the result of (oneCents*pennies) by 100 to be giving the correct decimal placement for the reassignment of changeDue. After this last else if is executed, the while loop is restarted, except this time the condition is false, as the changeDue = 0.

                        - The result of the full while loop will print out each denomination that will fit inside the change due and how much of each
                            must be given to the customer.



              -








###                       Technologies Used                      ###     

1. Scanner:     Used to get input from user(cashier)

2. System.out.print to print out the information in a way that the cashier can read
        - (There are two types of people, those who can read java and those who can not)
            - Most can not.


3. Data Types used:
      - Doubles :     Literals that do contain a decimal point: 0.0, 3.14, -15.9997.
      - Ints:          Literals that do not contain a decimal point: 42, 0, -123, 1928374.
      - Strings:        Literals that are enclosed in double quotes: "Hello world!", "dog".


4. Conditions Used:
      - If:           Used to test if some condition is true or false
      - Else If:        Used to test additional conditions ONLY when a first one is NOT true.
      - Else:             Used when If and Else If statements are NOT true.


5. Nesting:       When you put a control statement, such as an If, inside another control statement.


6. Loops:                  A loop can execute a section of code many times, over and over again.
      - While Loops:           This allows one to repeat a section of code as long as a condition is TRUE.



7. Methods:               Section of code inside a class that allows us to tell the code to do something.
      - Main Method:          Special method that java command knows to look for in order to run a program.
      - Calling Methods:         Used to condense the main method, making the code look cleaner and more organized.
      - Print F Method:             Similar to println- this allows one to format the string output.

8. Casting:
      - (Int):            Allows one to convert another data type like double ( Ex. 2.0) to an Int(Ex. 6 )

9. Algorithms:
      - Must have in order to complete mathematical expressions.
      - Multiply
      - Subtract
      - Addition
      - Math.round:     This will round the result to the next largest integer.







###                        Lessons Learned                       ###
Most of the tech I used to write this program I understood already although there was a few things that I was able to hone in on as I didnt have
the best experience using them prior.

Those items were:

Casting
Print F
Math.round
