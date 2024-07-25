package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class Messages 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
        long n=sc.nextInt();
        long f=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        int l=(int)n;
        long ff=f;
        int ab=0;
       long aa[]=new long[l];
        for(int i=0;i<n;i++)
        {
     aa[i]=sc.nextLong();
        }
       long time=0;
        for(int i=0;i<n;i++)
        {
          long c1=(aa[i]-time)*a;
          time=aa[i];
          long c2=Math.min(c1,b);
          ff=ff-c2;
          if(ff<=0)
          {
            ab=1;
            break;
          }
        }
        if(ab==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
        sc.close();
    }
}
