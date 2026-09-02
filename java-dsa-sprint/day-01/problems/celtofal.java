import java.util.*;
class celtofal
{
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("1. Celsius to Fahreheit \n2. Fahrenheit to Celsius\n");
        System.out.print("Enter choice(1 or 2) - ");
        int ch = sd.nextInt();
        double c,f;
        switch(ch)
        {
            case(1):
            {
                c=sd.nextDouble();
                f=(c*9/5)+32;
                System.out.print("The Fahrenheit is - "+f);
            }
            case(2):
            {
                f=sd.nextDouble();
                c=(f*9/5)+32;
                System.out.print("The Fahrenheit is - "+f); 
            }
            default:
                System.out.print("Invalid Choice!");
                break;
        }
        sd.close();
    }
}