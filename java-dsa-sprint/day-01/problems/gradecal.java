import java.util.*;
class gradecal
{
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sd.nextInt();
        char grade = ' ';
        if(marks>100 || marks<0) System.out.print("Invalid Marks!");
        else if (marks>=90) grade='A';
        else if (marks>=75) grade='B';
        else if (marks>=60) grade='C';
        else if (marks>=40) grade='D';
        else grade='F';
        if (marks>=0 && marks<=100) System.out.print("Your grade is - "+grade+" according to your marks");
        sd.close();
    }
}