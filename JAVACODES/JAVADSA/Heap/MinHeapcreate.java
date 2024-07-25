package JAVACODES.JAVADSA.Heap;

import java.util.*;
public class MinHeapcreate 
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
if(i==0||list.get(p)<list.get(i))
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
    pushdown1(list,0,n);
}
static void pushdown1(ArrayList<Integer> list,int in,int n)
{
   
    if(in==n)
    return;
int left=2*in+1;
int right=2*in+2;
int smallest=in;

if(left<=n&&list.get(left)<list.get(smallest))
smallest=left;
if(right<=n&&list.get(right)<list.get(smallest))
smallest=right;
if(in==smallest)
{
    return;
}
swap(list,smallest,in);
pushdown1(list,smallest,n);
}
static void heapify(ArrayList<Integer> list)
{
    int n=list.size();
    for(int i=n/2-1;i>=0;i--)
    {
        pushdown1(list,i,list.size()-1);
      
    }
}
static void heapsort(ArrayList<Integer> list)
{
heapify(list);
System.out.println(list);
for(int i=list.size()-1;i>0;i--)
{
    swap(list,0,i);
    pushdown1(list,0,i-1);
}
}
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       list.add(40);
       list.add(55);
       list.add(53);
       list.add(52);
       list.add(54);
       System.out.println(list);
      heapify(list);
     //  int index=list.size()-1;
     // insert(list,index);
   //   System.out.println(list);
   // delete(list);
 heapsort(list);
    System.out.println(list);

        sc.close();
    }
}
