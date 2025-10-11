/*Q.1
Divide Two Numbers Safely
Concept: Multiple catch blocks + finally*/

public class MultiCatch
{  public static void main(String args[])
   {    int a=10;
        int b=10;
       try
       {  int c=10/0;
          System.out.println(c);
       }
       catch(NumberFormatException e)
       {  System.out.println(e);
       }
      catch(IndexOutOfBoundsException ab)
       { System.out.println(ab);
       }
      catch(NullPointerException n)
       {  System.out.println(n);
       }
      finally
       { System.out.println("I am always execute ");
       }
     
   }
}//class