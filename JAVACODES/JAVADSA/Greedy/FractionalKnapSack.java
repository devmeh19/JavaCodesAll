import java.util.*;
public class FractionalKnapSack {
    public static class Item
    {
        int value;
        int weight;
        public String toString(){
            {
                return value+" "+weight;
            }
    }
}
public static class ItemTools implements Comparator<Item>
{
public int compare(Item i1,Item i2)
{
   if(i1.value/i1.weight<i2.value/i2.weight)
   return 1;
   else if(i1.value/i1.weight>i2.value/i2.weight)
   return -1;
   else
   return 0;
}

}
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
ArrayList<Item> l3=new ArrayList<>();
System.out.println("Enter no. of elements");
int n=sc.nextInt();
System.out.println("Enter Elements and values");
for(int i=0;i<n;i++)
{
    int v=sc.nextInt();
    l1.add(v);
    int w=sc.nextInt();
    l2.add(w);
    Item item=new Item();
    item.value=v;
    item.weight=w;
   // System.out.println(item);
    l3.add(item);
}
l3.sort(new ItemTools());
System.out.println(l3);
System.out.println("Enter Weight");
int W=sc.nextInt();
int profit=0;

    for(int i=0;i<l3.size()&&W>0;i++)
    {
        Item ii=l3.get(i);
        if(ii.weight<=W)
        {
profit=profit+ii.value;
W=W-ii.weight;
        }
        else{
            profit=profit+((ii.value/ii.weight)*W);
            W=0;
        }
    }

System.out.println(profit);
 sc.close();
    }
}

