/*Try-Catch Inside a Loop
Take 5 inputs from the user and calculate the reciprocal (1/number). If a user enters 0, handle the exception and continue to the next input.

*/
import java.util.*;
public class InputNum
{  public static void main(String args[])
   {   Scanner sc=new Scanner(System.in);
      
      for(int i=0;i<5;i++)
      { 
        try
        {  System.out.println("Enter the numebr n1 n2");
           int n1=sc.nextInt(); 
           int n2=sc.nextInt();
           int c=n1/n2;
          System.out.println("iteration :"+  i +"output :"+c);
        }
        catch(Exception e)
        { System.out.println(e);
        }
      }
    

   }//main
}//class