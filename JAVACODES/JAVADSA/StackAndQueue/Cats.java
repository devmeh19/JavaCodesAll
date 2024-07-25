package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class Cats 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       int t=sc.nextInt();
       while(t-->0)
       {
        int n=sc.nextInt();
        String s=sc.next();
       // int len=s.length();
        String f=sc.next();
        int s1=0;
        int f1=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
         char ch=s.charAt(i);
         char ch1=f.charAt(i);
         if(ch=='1'){
         s1++;
a[i]=1;
         }
         if(ch1=='1'){
            b[i]=1;
         f1++;

         }
        }
        int aa=0;
       // int vis=0;
        for(int i=0;i<n;i++)
        {
if((a[i]==1&&b[i]==1))
aa++;
        }
        if(s1>=f1)
        {
            s1=s1-aa;
            System.out.println(s1);
            
        }
        else
        {
            f1=f1-aa;
            System.out.println(f1);
        }
       }
     
       
       
        sc.close();
    }
}
