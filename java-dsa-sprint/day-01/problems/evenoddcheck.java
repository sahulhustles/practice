import java.util.*;
class evenoddcheck {
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sd.nextInt();
        if(num%2==0) System.out.print(num+" is even");
        else if(num%2!=0) System.out.print(num+"is odd");
        else System.out.print("Enter valid values!");
        sd.close();
    }    
}
