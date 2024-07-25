package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class LargestArea {
    static Scanner sc= new Scanner(System.in);
int[] nextsmaller(int a[])
{
    int len=a.length;
    int b[]=new int[len];
    int k=len-1;
    Stack<Integer> s=new Stack<>();
       for(int i=len-1;i>=0;i--)
       {
           while(!s.isEmpty()&&a[s.peek()]>=a[i])
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
           s.push(i);
       }
       return b;
    }  
    int[]  previoussmaller(int a[])
    {
        int len=a.length;
        int b[]=new int[len];
    int k=0;
        Stack<Integer> s=new Stack<>();
    for(int i=0;i<len;i++)
    {
        while(!s.isEmpty()&&a[s.peek()]>=a[i])
        {
            s.pop();
        }
        if(s.isEmpty())
        {
        b[k]=-1;
        k++;
        }
        else{
            b[k]=s.peek();
            k++;
        }
        s.push(i);
    }
    return b;
    }
    public static void main(String[] args) 
    {
        LargestArea ob =new LargestArea();
       System.out.println("Enter size");
       int n=sc.nextInt();
       int Height[]=new int[n];
       System.out.println("Enter elements"); 
       for(int i=0;i<n;i++)
       {
        Height[i]=sc.nextInt();
       }
       int next[]=ob.nextsmaller(Height);
       int prev[] =ob.previoussmaller(Height);
       int area=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
      if(next[i]==-1)
       next[i]=n;
       int m=Height[i]*(next[i]-prev[i]-1);
area=Math.max(area,m);
       }
       System.out.println("Area"+area);
        sc.close();
    }
}
