1. Sum and Average of 3 Numbers
Take three numbers as input from the user (use Scanner). Calculate and print their sum and their average. Print the average rounded to 2 decimal places.

2. Even or Odd Checker
Take one integer as input. Print "Even" if it's divisible by 2, otherwise print "Odd". Handle negative numbers correctly too.

3. Leap Year Checker
Take a year as input. Print "Leap Year" or "Not a Leap Year". Rules: a year is a leap year if it's divisible by 4, except century years (divisible by 100) which must also be divisible by 400 to qualify. (Test it on 1900 — not a leap year — and 2000 — is a leap year — to confirm your logic.)

4. Largest of 3 Numbers
Take three integers as input. Print the largest one. Don't use any built-in Math.max() — write the comparison logic yourself using if-else.

5. Grade Calculator
Take a student's marks (0–100) as input. Print their grade using this scale:

90–100 → A
75–89 → B
60–74 → C
40–59 → D
Below 40 → F

Also handle invalid input (marks below 0 or above 100) by printing "Invalid marks".

6. Simple Interest Calculator
Take principal, rate of interest (annual %), and time (in years) as input. Calculate simple interest using SI = (P × R × T) / 100. Print the simple interest and the total amount (principal + interest), both rounded to 2 decimals.

7. Celsius to Fahrenheit Converter
Take a temperature in Celsius as input. Convert it to Fahrenheit using F = (C × 9/5) + 32 and print the result. Then extend it: ask the user whether they want C→F or F→C conversion (use a simple menu with if-else or switch), and handle both directions.

8. Menu-Driven Calculator (switch-case)
Build a calculator that:
Prints a menu: 1. Add 2. Subtract 3. Multiply 4. Divide
Takes the user's choice (1–4) and two numbers as input
Uses a switch-case on the choice to perform the right operation and print the result
Handles division by zero by printing "Cannot divide by zero" instead of crashing