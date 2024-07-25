package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class RedundantBracket {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        boolean isRe=true;
        System.out.println("Enter string");
        String str=sc.next();
        int len=str.length();
        Stack<Character> s=new Stack<>();
        int m=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/')
            s.push(ch);
            else  if(ch==')') 
             {
                 isRe=true;
                while(s.peek()!='(')
                {
                    if(s.peek()=='+'||s.peek()=='-'||s.peek()=='*'||s.peek()=='/')
                isRe=false;
                s.pop();
                }
                s.pop();
             if(isRe==true)
             {
                m=1;
        
             } 
        }
        }
        if(m==0)
        System.out.println("Not Redundant");
        else if(m==1)
        System.out.println("Redundant");
        sc.close();
    }
    
}
