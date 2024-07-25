package JAVACODES.JAVADSA.HashSet;
import java.util.*;
public class MaxOnTable {
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
int max=0;
for(int ii:a)
{
    if(s.contains(ii)){
        s.remove(ii);
    }
    else{
        s.add(ii);
        max=Math.max(max,s.size());
    }
}
System.out.println(max);
        sc.close();
    }
}
