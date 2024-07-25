package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class LargestSubarrayHashing {
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
    System.out.println("Enter sum");
    int sum=sc.nextInt();
    HashMap<Integer,Integer> mp=new HashMap<>();
    mp.put(0,0);
    int pre=0;
    int max=0;
    int pre1=0;
    int c=0;
    for(int i=0;i<a.length;i++)
    {
 pre=pre+a[i];
 pre1=pre-sum;
 if(mp.containsKey(pre1))
 {
    c++;
  max=Math.max(max,i+1-mp.get(pre1));
  mp.put(pre,i+1);
 }
 else{
mp.put(pre,i+1);
 }
    }
    System.out.println(max+" "+ c);
sc.close();
}
}
