package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class MakeStringValid
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
        System.out.println("Enter String");
        String str=sc.next();
        int len=str.length();
        Stack<Character> s=new Stack<>();
        if(len%2!=0)
        {
            System.out.println("Not Possible");
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                char ch=str.charAt(i);
                if(ch=='{')
                {
                    s.push(ch);
                }
                else 
                {
                    if(ch=='}'){
                    if(!s.isEmpty()&&s.peek()=='{')
                    {
                    s.pop();
                    }
                    else
                    s.push(ch);
                }
            }
            }
            int a=0;
            int b=0;
            int c=0;
            char m;
            while(s.size()!=0)
            {
                m=s.pop();
                if(m=='{')
              a++;
              else if(m=='}')
              b++;

            }
            c=((a+1)/2)+((b+1)/2);
            System.out.println(c);
        }
        sc.close();
    }
}
