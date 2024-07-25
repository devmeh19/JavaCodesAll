package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class ProductArrayPuzzle {
 
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
        long a[]=new long[n];
        long b[]=new long[n];
        long c[]=new long[n];
        a[0]=1;
        b[n-1]=1;
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]*nums[i-1];
        }
          for(int i=n-2;i>=0;i--)
        {
            b[i]=b[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            c[i]=a[i]*b[i];
        }
       for(int i=0;i<n;i++)
    {
        System.out.println(c[i]);
    }


    }
}
