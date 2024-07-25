package JAVACODES.JAVADSA.Array;
import java.util.*;
public class Palindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           // String s=String.valueOf(a[i]);
            String s=Integer.toString(a[i]);
            int m=0;
            int j=s.length()-1;
            while(m<j)
            {
                if(s.charAt(m)!=s.charAt(j))
                {
                    System.out.println("Not");
                    return;
                }
                m++;
                j--;
            }
        }
       System.out.println("Yes");
        
        sc.close();
    }
    
}
