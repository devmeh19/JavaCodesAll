package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MaxAndMin {
    
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
        Arrays.sort(a);
        System.out.println("Max ="+a[n-1]);
        System.out.println("Min="+a[0]);
        sc.close();
    }
}
