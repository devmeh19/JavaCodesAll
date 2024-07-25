package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class MaxandMinWindow {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter size , window , elements");
    int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
int b;
b=solve(a,n,k);
System.out.println(b);

   sc.close();
   } 
   static int solve(int a[],int n,int k)
{
   // int b[]=new int[n-k+1];
    Deque<Integer>max = new ArrayDeque<>();
    Deque<Integer>min = new ArrayDeque<>();
    for(int i=0;i<k;i++)
{
    while(!max.isEmpty()&&a[max.peekLast()]<=a[i])
    {
    max.removeLast();
    }
    while(!min.isEmpty()&&a[min.peekLast()]>a[i])
    {
    min.removeLast();
    }
    max.addLast(i);
    min.addLast(i);
}
int sum=0;
sum=a[max.peekFirst()]+a[min.peekFirst()];
for(int i=k;i<n;i++)
{
   // int sum=a[max.peekFirst()]-a[max.peekFirst()];
    while(!max.isEmpty()&&i-max.peekFirst()>=k)
    max.removeFirst();
     while(!min.isEmpty()&&i-min.peekFirst()>=k)
    min.removeFirst();
        while(!max.isEmpty()&&a[max.peekLast()]<=a[i])
    {
    max.removeLast();
    }
    while(!min.isEmpty()&&a[min.peekLast()]>a[i])
    {
    min.removeLast();
    }
    max.addLast(i);
    min.addLast(i);
    sum+=a[max.peekFirst()]+a[min.peekFirst()];

}

    return sum;
}

}
