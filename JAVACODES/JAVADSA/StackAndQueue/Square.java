package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class Square 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       int t=sc.nextInt();
       while(t-->0)
       {
        int x[]=new int[4];
        int y[]=new int[4];
        int minx=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int miny=Integer.MAX_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            if(x[i]>=maxx)
            {
                maxx=x[i];
            }
            if(x[i]<=minx)
            {
                minx=x[i];
            }
            if(x[i]>=maxy)
            {
                maxy=x[i];
            }
            if(x[i]<=miny)
            {
                miny=x[i];
            }
        }
int a=maxx-minx;
int b=maxy-miny;
int area=a*b;
System.out.println(area);
               }
       
       
        sc.close();
    }
}
