package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class InfixEvaluation {
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
        // String str2="";
         Stack<Character> s=new Stack<>();
         Stack<Integer> s1=new Stack<>();
         for(int i=0;i<len;i++)
           {
             char ch=str.charAt(i);
             if(isOperand(ch))
             {
                  s1.push(ch-48);
             }
             else{
              if(ch=='('||s.isEmpty()||s.peek()=='(')
             s.push(ch);
             else if(ch==')')
             {
                 while(s.peek()!='('&&!s.isEmpty())
                 {
                  int v2=s1.pop();
                  int v1=s1.pop();
                  char c=s.pop();
                  if(c=='+')
                  s1.push(v1+v2);
                  if(c=='-')
                  s1.push(v1-v2);
                  if(c=='*')
                  s1.push(v1*v2);
                  if(c=='/')
                  s1.push(v1/v2);
                 }
                 s.pop();
             }
           else 
             {
                 while(!s.isEmpty()&&precedence(s.peek())>=precedence(ch))
                 {
                    int v2=s1.pop();
                  int v1=s1.pop();
                  char c=s.pop();
                  if(c=='+')
                  s1.push(v1+v2);
                  if(c=='-')
                  s1.push(v1-v2);
                  if(c=='*')
                  s1.push(v1*v2);
                  if(c=='/')
                  s1.push(v1/v2);
                 }
                 s.push(ch);
             }
           }
        }
          while(!s.isEmpty())
           {
            int v2=s1.pop();
                  int v1=s1.pop();
                  char c=s.pop();
                  if(c=='+')
                  s1.push(v1+v2);
                  if(c=='-')
                  s1.push(v1-v2);
                  if(c=='*')
                  s1.push(v1*v2);
                  if(c=='/')
                  s1.push(v1/v2);
           }
           System.out.println(s1.peek());
         sc.close();
     }
 }
