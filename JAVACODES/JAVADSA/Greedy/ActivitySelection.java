import java.util.*;
public class ActivitySelection {
    public static class Meet
    {
        int start;
        int finish;
        int number;
        public String toString(){
            {
                return start+" "+finish+" "+ number;
            }
    }
public static class Meeting implements Comparator <Meet>
{
public int compare(Meet i1,Meet i2)
{
   if(i1.finish>i2.finish)
   return 1;
   else if(i1.finish<i2.finish)
   return -1;
   else
   return 0;
}
}
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
ArrayList<Meet> l3=new ArrayList<>();
System.out.println("Enter no. of elements");
int n=sc.nextInt();
System.out.println("Enter Elements and values");
for(int i=0;i<n;i++)
{
    int v=sc.nextInt();
    l1.add(v);
    int w=sc.nextInt();
    l2.add(w);
    Meet item=new Meet();
    item.start=v;
    item.finish=w;
    item.number=i+1;
    l3.add(item);
}
l3.sort(new Meeting());
System.out.println(l3);
ArrayList<Integer> result=new ArrayList<>();
result.add(l3.get(0).number);
Meet on=l3.get(0);
for(int i=1;i<l3.size();i++)
{
    Meet m1=l3.get(i);
    if(m1.start>on.finish)
    {
result.add(m1.number);
on=m1;
    }
}
System.out.println(result);
 sc.close();
    }
}
}
