package simpleprogram;
import java.util.*;
import java.util.List;

public class Main
{
public static void main(String[] args)
    {


    String str="r13e43e54N))_a***a$%Ru#45n@#a#^&G)_i*&*r%^i";    
    String str1="r13e43e54N))_a***a$%Ru#45n@#a#^&G)_i*&*r%^i";
    String resultStr="";
    String finalresult="";
    String real="";
    
    // Captialize first letter
    String firstLetter = str.substring(0, 1);
    String rest = str.substring(1, str.length());
    firstLetter = firstLetter.toUpperCase();
    str = firstLetter + rest;
    str1 = str;
    System.out.println("After capitalising the first element: " + str1);
    
   
    //Removing chars and symbols
    str1 = str1.replaceAll("[-+^_]*", "");
    str= Character.toUpperCase(str.charAt(0)) +str.substring(1).replaceAll("(?<!_)(?=[A-Z])", " ");  
    
    System.out.println("After removing _+ str1: " + str1);
    
    for ( int i=0; i<str1.length()-4; i++ )
    {
        if ( str1.charAt(i)=='*' && str1.charAt(i+1)=='*' && str1.charAt(i+2)=='*' && str1.charAt(i+3)!='*' )
        {     
            String fhalf = str1.substring(0, i);
            String middle = str1.substring((i+3), i+4);
            middle = middle.toUpperCase();
            String lhalf = str1.substring((i+4), str1.length()); 
            String finale = fhalf + " " + middle + lhalf;
            System.out.println("After replacing 3 stars with space and captializing the next letter: " + finale);
            str1 = finale;
            break;
        }
    }
    
    for (int i=0;i<str1.length();i++) //loop execute till the length of the string  
    {  
        
    if(str1.charAt(i)==32) //comparing alphabets with their corresponding ASCII value
    {
        real = real+" ";
    }
    else if (str1.charAt(i)>64 && str1.charAt(i)<=122) //returns true if both conditions returns true  
       {  
          real=real+str1.charAt(i); //adding characters into empty string
       }
    }
   
   System.out.println("Final Result: " + real);
    }
}