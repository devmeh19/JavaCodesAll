package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class LongestValidSubstring {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
        System.out.println("Enter String");
        String str=sc.next();
        int len=str.length();
        Stack<Character> s=new Stack<>();
            for(int i=0;i<len;i++)
            {
                char ch=str.charAt(i);
                if(ch=='(')
                {
                    s.push(ch);
                }
                else 
                {
                    if(ch==')'){
                    if(!s.isEmpty()&&s.peek()=='(')
                    {
                    s.pop();
                    }
                    else
                    s.push(ch);
                }
            }
            }
            int nm=s.size();
            int mm=len-nm;
            System.out.println(mm);
        sc.close();
    }
}
