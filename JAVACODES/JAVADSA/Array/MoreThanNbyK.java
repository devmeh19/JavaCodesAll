package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MoreThanNbyK
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
        System.out.println("Enter k");
        int k=sc.nextInt();
        Arrays.sort(arr);
        int f=0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            f++;
        if(arr[i]!=arr[i+1])
        {
            if(f>n/k)
            count++;
            f=0;
        }
        }
        if(f>0)
        {
        f++;
        if(f>n/k)
         count++;
        }
        System.out.println(count);
        sc.close();
    }
}
