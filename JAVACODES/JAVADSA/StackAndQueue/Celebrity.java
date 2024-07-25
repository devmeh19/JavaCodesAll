package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class Celebrity {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter total persons");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the inputs");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            
            {
                a[i][j]=sc.nextInt();
            }
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            s.push(i);
        }
        while(s.size()>1)
        {
            int v2=s.pop();
            int v1=s.pop();
            if(a[v1][v2]==0)
            {
                s.push(v1);
            }
            else if(a[v2][v1]==0)
            s.push(v2);
        }
         int m1=0;
         boolean mm=true;
         int m2=0;
         boolean mm2=true;
        if(s.size()==0)
        {
        System.out.println("No Celebrity");
        }
        else{
            int m=s.pop();
         for(int i=0;i<n;i++)
         {
     if(a[m][i]==0)
     m1++;
         }
         if(m1!=n)
mm=false;
        
        for(int i=0;i<n;i++)
        {
            if(a[i][m]==1)
m2++;
        }
        if(m2!=n-1)
        mm2=false;
        if(mm==true&&mm2==true)
        System.out.println("Celebrity is "+ m);
        else
        System.out.println("No Celebrity");
        sc.close();
    }
}
}
