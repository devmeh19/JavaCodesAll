package JAVACODES.JAVADSA.Array;
import java.util.*;
public class Sortzero
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
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                mid++;
                low++;
            }
           else if(a[mid]==1)
            {
                mid++;
            }
           else if(a[mid]==2)
            {
               temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
                
        }
        
        for(int i=0;i<n;i++)
        {
       System.out.println(a[i]);
        }
        sc.close();
    }
}
