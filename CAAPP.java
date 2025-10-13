import java.util.*;
class AgeNoMatch extends RuntimeException
{ int age;
   AgeNoMatch(int age)
   { this.age=age;
   }
   public String getMsg()
   { return "Age us less than 6 -->:"+age;
   }
}//Class1
class CheckAge
{
    void verifyAge(int age)
    { if(age<=6)
        {
            AgeNoMatch ag=new AgeNoMatch(age);
            throw ag;
        }
       else
        {  System.out.println("Student us eligible for admission");
        }
    }
}//class2
public class CAAPP
{ public static void main(String args[])
  {
     CheckAge ca=new CheckAge();
      try
      {  ca.verifyAge(10);
      }
     catch(AgeNoMatch ex)
      {  System.out.println(ex.getMsg());
      }
  }
}//class3