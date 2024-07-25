package JAVACODES.JAVADSA.Heap;
import java.util.*;
public class MaxHeapCreate 
{
static Scanner sc=new Scanner(System.in);
static void swap(ArrayList<Integer> list,int ii,int jj)
{
    int temp=list.get(ii);
    list.set(ii,list.get(jj));
    list.set(jj,temp); 

}
static void insert(ArrayList<Integer> list,int i)
{
int p=(i-1)/2;
if(i==0||list.get(p)>list.get(i))
{
    return ;
}
swap(list,p,i);
insert(list,p);
}

static void delete(ArrayList<Integer> list)
{
    swap(list,0,list.size()-1);
    list.remove(list.size()-1);
    int n=list.size()-1;
    pushdown(list,0,n);
}
static void pushdown(ArrayList<Integer> list,int in,int n)
{
int left=2*in+1;
int right=2*in+2;
int largest=in;
if(left<=n&&list.get(left)>list.get(largest))
largest=left;
if(right<=n&&list.get(right)>list.get(largest))
largest=right;
if(in==largest)
{
    return;
}
swap(list,largest,in);
pushdown(list,largest,n);
}
static void heapsort1(ArrayList<Integer> list)
{
int n=list.size()-1;
for(int i=n;i>0;i--)
{
    swap(list,0,i);
    pushdown(list,0,i-1);
}
}
static void heapify(ArrayList<Integer> list)
{
 
    int n=list.size();
   // int first=(((list.size()-1)-1)/2);
    for(int i=n/2-1;i>=0;i--)
    {
        pushdown(list,i,list.size()-1);
    }
}
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
    //   list.add(1);
       list.add(5);
       list.add(7);
       list.add(2);
       list.add(3);
       list.add(5);
       list.add(5);
       System.out.println(list);
      // int index=list.size()-1; 4 1 3 9 7
     // insert(list,index);
       heapify(list);
    System.out.println(list);
     // delete(list);
    heapsort1(list);
  //  heapify(list);
      System.out.println(list);
        sc.close();
    }
}
