import java.util.*;
public class NonOverlapping {
    static Scanner sc=new Scanner(System.in);
    public static class In
    {
        int start;
        int end;
       public  In(int a,int b)
        {
   start=a;
   end=b;
        }
public String toString(){
return start +","+end;
}
    }
    public static class Sort implements Comparator<In>
    {
    public int compare(In i1,In i2)
    {
        if(i1.start>i2.start)
        return 1;
       else if(i1.start<i2.start)
        return -1;
      else 
      {
        return 0;
      }
    }
    }
public static void main(String[] args) {
 ArrayList<In> inte=new ArrayList<>();
 System.out.println("Enter no. of elements");
 int n=sc.nextInt();
 System.out.println("Enter ELements");
 for(int i=0;i<n;i++)
 {
    System.out.println("Enter start time");
    int ss=sc.nextInt();
    System.out.println("Enter end time");
    int ee=sc.nextInt();
    inte.add(new In(ss,ee));
 }
 System.out.println(inte);
System.out.println(inte);
int result=0;
int prev=inte.get(0).end;
for(int i=1;i<n;i++){
In current=inte.get(i);
if(current.start<prev)
{
prev=Math.min(prev,current.end);
result++;
}
else
{
    prev=current.end;
}

}
System.out.println(result);
    sc.close();
}
}
