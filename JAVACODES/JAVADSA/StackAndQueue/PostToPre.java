package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class PostToPre 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter String");
        String str=sc.next();
        Stack<String> s=new Stack<>();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57)
            {
     s.push(ascii-48+"");
            }
            else{
                String v2=s.pop();
                String v1=s.pop();
            if(ch=='+')
            s.push('+'+v1+v2);
            if(ch=='-')
            s.push('-'+v1+v2);
            if(ch=='*')
            s.push('*'+v1+v2);
            if(ch=='/')
            s.push('/'+v1+v2);
            }
        }
        System.out.println(s.pop());
        sc.close();
    }
}
