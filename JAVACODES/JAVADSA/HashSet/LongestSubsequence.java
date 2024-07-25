package JAVACODES.JAVADSA.HashSet;
import java.util.*;
public class LongestSubsequence {
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
HashSet<Integer> s=new HashSet<>();
for(int num: a)
{
    s.add(num);
}
int max=1;
int cc;
for(int nu:s)
{
  cc=1;
  if(s.contains(nu-1))
  continue;
  else{
    int aa=nu;
    while(s.contains(aa+1))
    {
    cc++;
    max=Math.max(cc,max);
    aa++;
    }
  }
}
System.out.println(max);
    sc.close();
    }
}
