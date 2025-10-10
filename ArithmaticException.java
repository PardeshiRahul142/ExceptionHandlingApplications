import java.util.*;
public class ArithmaticException
{  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
     try{
      System.out.println("Enter the number n1 , n2");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
     int c=n1/n2;
     System.out.println("total is "+c);
     }
    catch(Exception e)
    {  System.out.println("Divide by zero Exception"+e);
    }
   }
}//class