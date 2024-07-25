// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class First {
static int swap=Integer.MAX_VALUE;
static long min=Long.MAX_VALUE;
    public static long tonumber(char a[],char b[])
    {
        String a1=new String(a);
        String b1=new String(b);
        long fn=Long.parseLong(a1);
        long sn=Long.parseLong(b1);
        long ans=(long)Math.abs(fn-sn);
        return ans;
    }
    public static void solve(int i,char a[],char b[],int s)
    {
        if(i==a.length)
        {
            return ;
        }
    long ans=tonumber(a,b);
    if(ans<=min)
    {
    if(ans==min)
    {
        swap=Math.min(s,swap);
    }
    else{
        min=ans;
        swap=s;
    }
    }
   
    char temp=a[i];
    a[i]=b[i];
    b[i]=temp;
    solve(i+1,a,b,s+1);
    char temp1=a[i];
    a[i]=b[i];
    b[i]=temp1;
    solve(i+1,a,b,s);
    return ;
    }
    public static int solution(String S, String T) {
        // Implement your solution here
        char a[]=S.toCharArray();
        char b[]=T.toCharArray();
        
        int s=0;
        solve(0,a,b,s);
        return swap;
    }


    public static void main(String args[])
{
    int aa=solution("21660","20968");
    System.out.println(aa);
}
}
