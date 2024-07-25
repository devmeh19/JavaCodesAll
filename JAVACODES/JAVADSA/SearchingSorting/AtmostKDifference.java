package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class AtmostKDifference {
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
        System.out.println("Enter element");
        int x=sc.nextInt();
        System.out.println("Enter Difference");
        int k=sc.nextInt();
        int index=0;
        while(index<n)
        {
            if(arr[index]==x)
            {
                System.out.println(index);
                return;
            }
            int steps=Math.abs(x-arr[index])/k;
            index=index+Math.max(1,steps);
            
        }
        System.out.println(-1);
}
}
