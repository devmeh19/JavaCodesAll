package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class ReverseStack {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        Stack<Character> s=new Stack<>();
        System.out.println("Enter String");
        String str=sc.next();
     int len=str.length();
        for(int i=0;i<len;i++)
        {
            s.push(str.charAt(i));
        }
        str="";
        while(!s.isEmpty())
        {
            str=str+s.pop();
        }
        System.out.println(str);
        sc.close();
    }
    
}
