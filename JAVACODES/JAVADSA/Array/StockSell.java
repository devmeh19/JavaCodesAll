package JAVACODES.JAVADSA.Array;
import java.util.*;
public class StockSell 
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
        int mini=a[0];
        int profit=0;
        for(int i=1;i<n;i++)
        {
            int cost=a[i]-mini;
            profit=Math.max(profit,cost);
           mini=Math.min(mini,a[i]);
        }
      System.out.println(profit);
        
        sc.close();
    }
}
