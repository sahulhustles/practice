import java.util.*;
class simplecal
{
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.println("Welcome to commandline-calculator menu ");
        System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n");
        System.out.print("Enter the option - ");
        int ch = sd.nextInt();
        System.out.print("Enter first number - ");
        int a=sd.nextInt();
        System.out.print("Enter second number - ");
        int b=sd.nextInt();
        switch(ch)
        {
            case(1):
                System.out.print("The sum is - "+(a+b));
                break;
            case(2):
                if(a>=b) System.out.print("The difference is - "+(a-b));
                else if(a<=b) System.out.print("The difference is - "+(b-a));
                else System.out.print("Invalid");
                break;
            case(3):
                System.out.print("The product is - "+(a*b));
                break;
            case(4):
                if(a>b)
                {
                    if(b==0)System.out.print("Zero Division Error!");
                    else System.out.print("The quotient is - "+(a/b));
                }
                else if(b>a)
                {
                    if(a==0)System.out.print("Zero Division Error");
                    else System.out.print("The quotient is - "+(b/a));
                }
                else System.out.print("Enter valid Numbers!");
                break;
            default:
                System.out.print("Enter valid choice!");
                break;
        }
        sd.close();
    }
}