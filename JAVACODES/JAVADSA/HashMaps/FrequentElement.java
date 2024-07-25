package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class FrequentElement 
{
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
    HashMap<Integer,Integer> mp=new HashMap<>();
   for(int ii :a)
   {
  if(!mp.containsKey(ii))
  {
    mp.put(ii,1);
  }
  else
  {
    int aa=mp.get(ii);
    aa++;
    mp.put(ii,aa);
  }
   }
   int max=-1;
   for(int  ii: mp.values())
   {
    max=Math.max(max,ii);
   }
   System.out.println(max);


        sc.close();
    }

}
