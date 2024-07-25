import java.util.*;
public class MinPlatforms {
   static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Enter Total trains");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int dep[]=new int[n];
    System.out.println("Enter arrival and departure time");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        
    }
    for(int i=0;i<n;i++)
    {
        dep[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    Arrays.sort(dep);
    int j=0;
    int p=1;
    int m=1;
    for(int i=1;i<n&&j<n;)
    {
       if(arr[i]<=dep[j])
       {
           p++;
           m=Math.max(p,m);
          i++;
       }
       else
       {
           p--;
            m=Math.max(p,m);
           j++;
       }
    }
    System.out.println(m);
    sc.close();
} 
}
