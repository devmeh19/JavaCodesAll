package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class StackPermutation {
 static Scanner sc=new Scanner(System.in);
 public static int isStackPermutation(int n, int[] ip, int[] op) {    
    Stack<Integer> s= new Stack<>();
    int j=0;
    for(int i=0;i<n;i++)
    {
        s.push(ip[i]);
        if(s.peek()==op[j])
        {
            while(!s.isEmpty()&&s.peek()==op[j])
            {
                s.pop();
                j++;
            }
        }
    }
    if(s.isEmpty())
    return 1;
    else
    return 0;
    
}
 public static void main(String[] args) {
    System.out.println("Enter Size,first array and second array");
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
       for(int i=0;i<n;i++)
    {
        b[i]=sc.nextInt();
    }
    System.out.println(isStackPermutation(n,a,b));
    sc.close();
 }   
}

