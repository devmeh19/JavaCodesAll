package JAVACODES.JAVADSA.Array;
import java.util.*;
public class KadanesAlgorithm 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long sum=0;
        long max=arr[0];
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0)
            sum=0;
            
        }
        System.out.println(max);
        sc.close();
    }
}
