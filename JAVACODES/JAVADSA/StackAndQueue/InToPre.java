package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class InToPre {
    static Scanner sc = new Scanner(System.in);
    static boolean isOperand(char ch)
     {
         if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/'&&ch!='^'&&ch!='('&&ch!=')')
         return true;
         return false;
     }
   static int precedence(char c)
   {
     if(c=='+'||c=='-')
     return 1;
    else if(c=='*'||c=='/')
     return 2;
   else  if(c=='^')
     return 3;
     else
     return -1;
   }
     public static void main(String[] args) 
     {
         System.out.println("Enter String");
         String str=sc.next();
            int len=str.length();
            String ss="";
         for(int j=len-1;j>=0;j--)
         {
            char c=str.charAt(j);
            if(c=='(')
            c=')';
          else if(c==')')
          c='(';
        ss=ss+c;
         }
      str=ss;
         String str2="";
         Stack<Character> s=new Stack<>();
         for(int i=0;i<len;i++)
           {
             char ch=str.charAt(i);
             if(isOperand(ch))
             {
               str2=str2+ch;
             }
             else{
              if(ch=='('||s.isEmpty()||s.peek()=='(')
             s.push(ch);
             else if(ch==')')
             {
                 while(s.peek()!='('&&!s.isEmpty())
                 {
                     str2=str2+s.peek();
                     s.pop();
                 }
                 s.pop();
             }
           else 
             {
                 while(!s.isEmpty()&&precedence(s.peek())>precedence(ch))
                 {
                     str2=str2+s.peek();
                     s.pop();
                 }
                 s.push(ch);
             }
           }
        }
           while(!s.isEmpty())
           {
             str2=str2+s.peek();
             s.pop();
           }
ss="";
   for(int j=str2.length()-1;j>=0;j--)
         {
            char c=str2.charAt(j);
        ss=ss+c;
         }

           System.out.println(ss);
         sc.close();
     }
 }
