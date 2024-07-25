package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class ValidParanthesis {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ValidParanthesis ob = new ValidParanthesis();
     System.out.println("Enter the string");
     String w=sc.next();
     boolean check=ob.balanced(w);
    System.out.println(check);
     sc.close();
    }
    boolean isOpening(char c)
    {
if(c=='('||c=='{'||c=='[')
return true;
return false;
    }
    boolean isMatching(char a,char b)
    {
        if(b=='('&&a==')')
        return true;
        else if(b=='{'&&a=='}')
       return true;
       else if(b=='['&&a==']')
       return true;
       return false;
    }
    boolean balanced(String wo)
    {
         Stack<Character> s=new Stack<>();
     int len=wo.length();
     for(int i=0;i<len;i++)
     {
        char ch= wo.charAt(i);
        if(isOpening(ch))
        {
            s.push(ch);
        }
        else{
            if(s.isEmpty())
            {
                return false;
            }
            else if(!isMatching(ch,s.peek()))
          {
               return false;
          }
          else
          {
            s.pop();
          }
                }
     }
     return s.isEmpty();

    }
}
