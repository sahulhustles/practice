import java.util.*;
class large
{
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sd.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sd.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sd.nextInt();
        System.out.print("The average is: ");
        int temp=0;
        if(n1>=n2 && n1>=n3) temp = n1;
        else if (n2>=n1 && n2>=n3) temp =n2;
        else temp =n3;
        System.out.print("The largest number among three is - "+temp);
        sd.close();
    }
}