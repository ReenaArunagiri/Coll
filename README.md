Strings using Collections

Java problem to be solved:

r13e43e54N))_a***a$%Ru#45n@#a#^&G)_i*&*r%^i
The above is the String.
What you should do?
1. Capitalise the First letter of the String
2. Capitalise the letter which comes after *** and introduce a space before the capitalised letter.
3. Remove all the numbers and symbols.
4. Use any collection.


Solution:

Step1 : Taking two Strings as Str and Str1 with same String characters 
Why two Strings with same characters : It is because we are about to perform two types of fucntions.

Step2 : Capitalize the first letter of the String
The String's first character is replaced with Uppercase and it is printed.
Get the first letter of the string Str using Str.Subdtring(0,1).
Get thw remaining string rest using Str.substring(1) and then it goes through the length of the String.
Convert first letter of the string to uppercase using toUpperCase() method.
Concatenate both the string firstletter & remaining chars.

Step3 : Spacing before Uppercase
Str 1st letter is converted to Uppercase and returns the char at 0th index followed by the remaining chars.
Replace All returns a string replacing all the sequence of chars matching the values.
Final output is stored to the object "Finale" and is printed

Step4 : String after removing special characters
The loop gets executed till the length of the string 
Compares alphabets with their corresponding ASCII values
Real is an object where the final output is shown 
Returns true only if all the compared values is matched "True"
Now, adding all the final chars into the empty string and display the OUTPUT.

Collection used:
java.util.List package is used and that inherits the collection interface through the list iterator.
We can relate the list in forward and backward direction.
The element contained in the java.list can be inserted, accessed, iterated, and removed according to the order which they appear.
