import java.util.*;
public class Student_Grade_Calculator
{
    public int s1,s2,s3,s4,s5,total,avg;
    public char grade;
    Scanner in=new Scanner(System.in);
    public void read()
    {
        System.out.println("Give Your 5 subject marks : ");
        System.out.println("Enter your tamil mark : ");
        s1=in.nextInt();
        System.out.println("Enter your english mark : ");
        s2=in.nextInt();
        System.out.println("Enter your maths mark : ");
        s3=in.nextInt();
        System.out.println("Enter your science mark : ");
        s4=in.nextInt();
        System.out.println("Enter your social mark : ");
        s5=in.nextInt();
    }
    public void calculateTotalMarks()
    {
         total=s1+s2+s3+s4+s5;
        }
        public void Average()
    {
        avg=(s1+s2+s3+s4+s5)/5;
    }
    public void gradeCalculation()
    {
        if(avg>=90)
        {
            grade='A';
        }
        else if(avg>=80)
        {
            grade='B';
        }
        else if(avg>=70)
        {
        grade='C';
    }
    else if(avg>=60)
    {
        grade='D';
    }
    else
    {
        grade='F';
    }
}
public void disp()
    {
        
        System.out.println("Total marks : "+total);
        System.out.println("Average percentage : "+avg+"%");
        System.out.println("Grade : "+grade);
    }
    
    public static void main(String args[])
    {
        Student_Grade_Calculator obj=new Student_Grade_Calculator();
        obj.read();
        obj.calculateTotalMarks();
        obj.Average();
        obj.gradeCalculation();
        obj.disp();
    }
}
