import java.util.*;
public class Exp
{ public static void main(String args[])
  {
    float a=10,b=0,c;

   try{
    c=a/b;
     System.out.println("Divide"+c);
   }
  finally
   { System.out.println("I am always execute");
   }


  }
}//class