import java.util.*;
class leapyearcheck {
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        int year = sd.nextInt();
        if(year %4==0 && year%100!=0 && year%400==0) System.out.print(year+" is a leap year");
        else System.out.print(year+" is not a leap year");
        sd.close();
    }
}
