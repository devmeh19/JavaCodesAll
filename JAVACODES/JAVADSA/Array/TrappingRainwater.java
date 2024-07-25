package JAVACODES.JAVADSA.Array;
import java.util.*;
public class TrappingRainwater 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(int i=1;i<n;i++)
    {
        left[i]=Math.max(left[i-1],a[i]);
    }
    
    for(int i=n-2;i>=0;i--)
    {
        right[i]=Math.max(right[i+1],a[i]);
    }
    long sum=0;
    for(int i=0;i<n;i++)
    {
        int d=Math.min(right[i],left[i])-a[i];
        sum=sum+d;
    }
    System.out.println(sum);
        sc.close();
}
}
