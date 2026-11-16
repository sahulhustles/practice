import java.util.*;

class ls
{
    public static int search(int nums[] , int tar)
    {
        int ind=-1;
        int m=nums.length;
        for(int i=0; i<m; i++)
        {
            if(nums[i]==tar)
            {
                ind=i;
                break;
            }
            else
            {
                ind=-1;
            }
        }
        return ind;
    }
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the size of array - ");
        int n=sd.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array - ");
        for(int i=0; i<n; i++)
        {
            nums[i]=sd.nextInt();
        }
        System.out.println("Enter your target - ");
        int tar = sd.nextInt();
        sd.close();
        System.out.println("The index of the target is : " + search(nums, tar));
    }
}