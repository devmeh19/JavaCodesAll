import java.util.*;
public class SubsetGreaterOthers {
  static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) {
     System.out.println("Enter total elements");
     int n=sc.nextInt();
     int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
arr[i]=sc.nextInt();
    } 
    Arrays.sort(arr);
    long sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum=sum+arr[i];
    }
    int f=1;
  long sum2=0;
    for(int i=arr.length-1;i>=0;i--)
    {
        sum2+=arr[i];
        sum=sum-arr[i];
        if(sum-sum2<0)
        {
            break;
        }
        
        f++;
    }
    System.out.println(f);

    sc.close();
  }  
}
