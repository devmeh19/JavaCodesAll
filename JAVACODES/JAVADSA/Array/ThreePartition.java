package JAVACODES.JAVADSA.Array;
import java.util.*;
public class ThreePartition
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=0;
        int r=array.length-1;
        for(int i=0;i<=r;i++)
        {
            if(array[i]<a)
            {
                int t=array[i];
                array[i]=array[l];
                array[l]=t;
                l++;
            }
            else if(array[i]>b)
            {
                  int t1=array[i];
                array[i]=array[r];
                array[r]=t1;
                r--;
                i--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        sc.close();
}
 }
