package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class RotatedArraySearch
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
        System.out.println("Enter Target");
        int t=sc.nextInt();
System.out.println(search(arr,t));
}
public static int search(int[] a, int target) {
    int start=0;
    int end=a.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(a[mid]==target)
        {
            return mid;
        }

        if(a[start]<=a[mid])
        {
if(a[start]<=target&&target<=a[mid])
end=mid-1;
else
start=mid+1;

        }
        else
        {
                    
if(a[mid]<=target&&target<=a[end])
start=mid+1;
else
end=mid-1;   
        }
    }
    return -1;
}
}