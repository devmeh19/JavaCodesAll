package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class TripletSmallerValue 
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
        System.out.println("Enter sum");
        int X=sc.nextInt();
        Arrays.sort(a);
        long count=0;
            for(int i=0;i<n;i++) 
            {
                int j=i+1;
                int k=n-1;
                while(j<k)
                {
                
                if(a[i]+a[j]+a[k]<X)
                {
                    count=count+k-j;
                    j++;
                   
                }
                else
                k--;
                }
            }
       
        System.out.println(count);


}
}
