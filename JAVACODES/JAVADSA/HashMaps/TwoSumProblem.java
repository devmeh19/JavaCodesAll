package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class TwoSumProblem {
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Enter Target");
    int target=sc.nextInt();
HashMap<Integer,Integer> mp=new HashMap<>();
for(int i=0;i<a.length;i++)
{
    int t=target-a[i];
    if(mp.containsKey(t))
    {
    System.out.println(mp.get(t)+" "+i);
    }
    else{
        mp.put(a[i],i);
    }
}
sc.close();
}
}
