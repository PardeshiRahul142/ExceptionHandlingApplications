/*4. String Parsing Exception (Unchecked Exception)

Take a string input from the user and convert it to an integer using Integer.parseInt().
Handle the NumberFormatException if the input is not a number.*/

import java.util.*;
public class StringException
{  public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String name=sc.nextLine();
 
      try
      {  int no=Integer.parseInt(name);
         System.out.println(no);
      }
     catch(NumberFormatException e)
      { System.out.println("Number format exception"+e);
      }
   }

}//class