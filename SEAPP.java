/*Problem:
Design a program to Create Student class with instance variable id,name,marks validate student marks.

If marks are less than 0 or greater than 100, throw a InvalidMarksException.

Otherwise, print “Marks recorded successfully”.

Hint:
Use an if check inside a setMarks() method.*/

import java.util.*;
class Student extends RuntimeException 
{  private int id;
   private String name;
   private int marks;

   Student(int id , String name , int marks)
   {  this.id=id;
      this.name=name;
      this.marks=marks;
   }
   public int getId(){return id;}
   public String getName(){return name;}
   public int getMarks(){return marks;}
}//class
class CheckStudent
{ 
      int marks;	
      public void verifyVoter(int marks)
      { if(marks > 0 && marks < 100)
        { Student s=new Student(1,"Rahul",marks);
          throw s;
        }
       else
        {  System.out.println("Student mark is Invalid");
        }
      }
}
public class SEAPP
{  public static void main(String args[])
   {  CheckStudent sch=new CheckStudent();
      try
       {  sch.verifyVoter(101);
       }
     catch(Student st)
       { System.out.println("Student is valid according to is marks :"+st.getId() +"\t"+st.getName()+"\t"+st.getMarks());
       }
 
   }
}