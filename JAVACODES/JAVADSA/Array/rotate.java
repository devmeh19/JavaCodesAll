package JAVACODES.JAVADSA.Array;
import java.util.*;
public class rotate {
   static  void reverse(int a[],int a1,int b){
    int i=a1;
    int j=b-1;
    while(i<j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
    }
    }
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
        System.out.println("Enter K rotation");
        int k=sc.nextInt();
     reverse(a,0,k);
     reverse(a,k,n);
     reverse(a,0,n);
     for(int i=0;i<n;i++)
     {
         System.out.println(a[i]);
     }
        
        sc.close();
    }
    
}
