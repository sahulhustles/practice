import java.util.*;
class intrestcal
{
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter the principal amount - ");
        int p = sd.nextInt();
        System.out.print("Enter the monthly intrest rate - ");
        int a = sd.nextInt();
        System.out.print("Enter the time duration(in months) - ");
        int m = sd.nextInt();
        double intr = (p*a*m)/100;
        System.out.print("The Intrest is "+intr+" and the total amount to be paid is - "+(p+intr));
        sd.close();
    }
}