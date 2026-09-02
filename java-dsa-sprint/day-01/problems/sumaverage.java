import java.util.*;
class sumaverage
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
        String avg = average(n1,n2,n3);
        System.out.print(avg);
        sd.close();
    }
    public static String average(int n1,int n2,int n3)
    {
        double ans = (n1+n2+n3)/3.0;
        String avg = String.format("%.2f",ans);
        return avg;
    }
}