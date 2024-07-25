package JAVACODES.JAVADSA.Array;
import java.util.*;
public class NegativeoneEnd {

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
      //  int len=arr.length;
        int p[]=new int[n];
        int ne[]=new int[n];
        int pi=0;
        int nei=0;
        
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]>=0)
            {
               p[pi]=arr[i];
               pi++;
            }
            else
            {
                ne[nei]=arr[i];
                nei++;
            }
        }
        for(int i=0;i<pi;i++)
        {
            arr[i]=p[i];
        }
        for(int i=0;i<nei;i++)
        {
            arr[pi]=ne[i];
            pi++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
