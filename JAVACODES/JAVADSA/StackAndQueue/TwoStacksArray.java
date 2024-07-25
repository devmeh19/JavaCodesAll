package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class TwoStacksArray {
    static Scanner sc=new Scanner(System.in);

    int top1;
    int top2;
    int size;
    int a[];
   TwoStacksArray(int n)
    {
        top1=-1;
        size=n;
        top2=n;
        a=new int[n];
        
    }
    void push1(int x)
    {
     if(top2-top1>1)
     a[++top1]=x;
     else{
         System.out.println("Overflow");
     }
    }
    void push2(int x)
    {
       if(top2-top1>1)
     a[--top2]=x;
     else{
         System.out.println("Overflow");
     }
    }
    int pop1()
    {
        if(top1==-1){
       System.out.println("UnderFlow");
       return -1;}
        else
        {
        int m=a[top1];
        top1--;
        return m;
        }
    }
    int pop2()
    {
      
        if(top2==size)
        {
             System.out.println("UnderFlow");
        return -1;
        }
        else
        {
        int m=a[top2];
        top2++;
        return m;
        }  
    }
    public static void main(String[] args) {
        System.out.println("Enter size");
        int n=sc.nextInt();
        TwoStacksArray ob= new TwoStacksArray(n);
        ob.push1(5);
        ob.push1(6);
        ob.push2(7);
        ob.push2(8);
        ob.push2(9);
        System.out.println(ob.pop1());
         System.out.println(ob.pop2());

        sc.close();
    }
}
