package JAVACODES.JAVADSA.Array;
import java.util.*;
public class ChocolateProblem 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int aa[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            aa[i]=sc.nextInt();
        }
        System.out.println("Enter students");
        int m=sc.nextInt();
        Arrays.sort(aa);
   int mini=Integer.MAX_VALUE;
   for(int i=0;i+m-1<n;i++)
   {
       if(aa[i+m-1]-aa[i]<mini)
       {
           mini=aa[i+m-1]-aa[i];
       }
   }
   System.out.println(mini);
        sc.close();
}
}