package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class KWindowSize {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter size , window , elements");
    int n=sc.nextInt();
int k=sc.nextInt();
long a[]=new long[n];
for(int i=0;i<n;i++)
{
    a[i]=sc.nextLong();
}
long b[]=printFirstNegativeInteger(a,n,k);
for(int i=0;i<n+k-1;i++)
{
System.out.println(b[i]);
}
sc.close();
   }

public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
    Deque<Integer> dq= new ArrayDeque<>();
    long b[]=new long[N-(K-1)];

    for(int i=0;i<K;i++)
    {
        if(A[i]<0)
        dq.addLast(i);
    }
    if(dq.size()>0)
    {
        b[0]=A[dq.peekFirst()];
    }
    else
    b[0]=0;
 int m=1;
    for(int j=K;j<N;j++)
    {
        if(!dq.isEmpty() && j-dq.peekFirst()>=K)
        dq.removeFirst();
    
    if(A[j]<0)
    dq.addLast(j);
    
    if(dq.size()>0){
    b[m]=A[dq.peekFirst()];
    m++;}
        
        else
        {
        b[m]=0;
        m++;}
    }
    return b;
   } 
}
