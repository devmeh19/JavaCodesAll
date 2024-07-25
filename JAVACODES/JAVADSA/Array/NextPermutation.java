package JAVACODES.JAVADSA.Array;
import java.util.Scanner;
public class NextPermutation 
{
    public static void reverse(int a[],int a1,int b)
    {
        int i=a1;
        int j=b-1;
        while(i<=j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
reverse(nums,0,nums.length);
for(int i=0;i<n;i++)
{
   System.out.println( nums[i]);
}
            return ;
        }
        for(int i=n-1;i>index;i--)
        {
            if(nums[i]>nums[index])
            {
int temp=nums[i];
nums[i]=nums[index];
nums[index]=temp;
break;
            }

        }
     reverse(nums,index+1,nums.length);
     for(int i=0;i<n;i++)
{
   System.out.println( nums[i]);
}
     



        sc.close();
    }
}
