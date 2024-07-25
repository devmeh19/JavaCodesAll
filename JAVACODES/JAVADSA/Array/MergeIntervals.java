package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MergeIntervals 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int intervals[][]=new int[n][m];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            intervals[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> s=new Stack<>();
        s.push(intervals[0]);

    for(int i=1;i<intervals.length;i++)
    {
        int st=intervals[i][0];
        int en=intervals[i][1];
        int s1[]=s.pop();
        int st1=s1[0];
        int en1=s1[1];
        int end=Math.max(en,en1);
        if(en1>=st)
        {
int merge[]={st1,end};
s.push(merge);
        }
        else
        {
            s.add(s1);
            s.add(intervals[i]);
        }
    }
    int ss=s.size();
int o[][]=new int[s.size()][2];
for(int i=o.length-1;i>=0;i--){
    int p[]=s.pop();
    o[i][0]=p[0];
    o[i][1]=p[1];
}

for(int i=0;i<ss;i++)
{
    for(int j=0;j<m;j++)
    {
       System.out.print(o[i][j]);
    }
    System.out.println();
}
        sc.close();
    }
}
