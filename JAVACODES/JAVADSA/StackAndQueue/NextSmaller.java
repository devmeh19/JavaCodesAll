package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class NextSmaller {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter total size");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter Elements");
       for(int i=0;i<n;i++)
       {
   a[i]=sc.nextInt();
       }
       int b[]=new int[n];
           int len=a.length;
       int k=len-1;
       Stack<Integer> s=new Stack<>();
       for(int i=len-1;i>=0;i--)
       {
           while(!s.isEmpty()&&s.peek()>=a[i])
           {
               s.pop();
           }
           if(s.isEmpty())
           {
           b[k]=-1;
           k--;
           }
           else{
               b[k]=s.peek();
               k--;
           }
           s.push(a[i]);
       }
       for(int l=0;l<n;l++)
       {
           System.out.println(b[l]);
       }
       sc.close();
    }  
   }
