import java.util.*;
class Voter extends RuntimeException
{   int age;
    Voter(int a){this.age=a;}

    public String getMsg(){return "User is nor valid for Voting";}   
}//class1
class CheckVoter
{  public void verifyVoter(int age)
   {
      if(age <= 18)
      { Voter v=new Voter(age);
        throw v;
      }
     else
      { System.out.println("Valid voter ");
      }
   }
}//class
public class VCAPP
{  public static void main(String args[])
   { CheckVoter ch=new CheckVoter();
     try
     {  ch.verifyVoter(100);
     }
     catch(Voter ve)
     {  System.out.println(ve.getMsg());
     }
   }
}//class