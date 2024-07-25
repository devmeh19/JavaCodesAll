package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class InsertAtIndexStack {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Stack<Integer> s1=new Stack<>();
        System.out.println("Enter Data and Index to be Inserted ");
        int d= sc.nextInt();
        int i=sc.nextInt();
        for(int j=1;j<i;j++)
        {
            s1.push(s.pop());
        }
        s1.push(d);
        while(!s1.isEmpty())
        {
            s.push(s1.pop());
        }
        System.out.println(s);
        sc.close();
    }
}
