package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class PairDifference {
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
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int sum=0;
        System.out.println("Enter Sum");
        int s=sc.nextInt();
        while(i<n&&j<n)
    {
       sum=arr[j]-arr[i];
       if(sum>s)
       
       {
         i++;
           
       }
       else if(sum<s)
       {
          j++;
       }
       else if(i!=j&&sum==s)
       {
        System.out.println(true);
           return ;
       }
    }
    System.out.println(false);
        return ;

}
}
