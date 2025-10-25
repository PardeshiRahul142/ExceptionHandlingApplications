import java.util.*;
class C1 extends RuntimeException  
{
   int age;
   C1(int age)
   { this.age=age;
   }
 public String toString()
 {  return "Age is greater than 6";
 }
}//class
class Valid
{ 
  int a;
  public void verify(int a)
  { 
     if(a<6)
     { throw new C1(a); 
     }
     else
     { System.out.println("Age is greater than 6");
     }
  }
}
public class UE
{ public static void main(String args[])
  {  Valid v=new Valid();
    try
     { 
       v.verify(20);
     }
     catch(C1 ce)
     {  System.out.println(ce);
     }

  }
}