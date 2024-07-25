package JAVACODES.JAVADSA.Array;
import java.util.*;
public class Reverse
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
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int i1=0;i1<n;i1++)
        {
            System.out.println(a[i1]);
        }
        
        sc.close();
}
 }
