package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MinJumps 
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
        int halt=0;
        int jump=0;
        int max=0;
        if(arr.length<=1)
        {
            System.out.println(0);
            return ;
        }
        if(arr[0]==0)
        
        {
            System.out.println(-1);
            return ;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            max=Math.max(max,arr[i]+i);
            if(max>=arr.length-1)
            {
                jump++;
                System.out.println(jump);
                return ;
                
            }
            if(i==halt)
            {
                halt=max;
                jump++;
                 if(i>=max)
                 
                 {
                    System.out.println(-1);
                    return ; 

                 }
            }
        }
            if(halt>=arr.length-1)

{
    System.out.println(jump);
    return ;
}        
        
        System.out.println(-1);
        sc.close();
    }
}
