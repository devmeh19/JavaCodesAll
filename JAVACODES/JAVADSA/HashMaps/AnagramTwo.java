package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class AnagramTwo {
    static Scanner sc=new Scanner(System.in);
    static HashMap<Character,Integer> check(String str)
    {
        HashMap<Character,Integer>  mp=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
            if(mp.containsKey(ch))
            {
int f=mp.get(ch);
mp.put(ch,f+1);
            }
            else{
         mp.put(ch,1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
    String s1;
    String s2;
System.out.println("Enter two Strings");
s1=sc.next();
s2=sc.next();
if(s1.length()!=s2.length()){
     System.out.println(false);
return ;
}
HashMap<Character,Integer>  m1=check(s1);
for(int i=0;i<s2.length();i++)
{
    char ch1=s2.charAt(i);
    if(!m1.containsKey(ch1))
    {
        System.out.println("False");
        return;
    }
    else{
        int f1=m1.get(ch1);
        m1.put(ch1,f1-1);
    }
}
for(int ii:m1.values())
{
    if(ii!=0){
        System.out.println("False");
        return;
    }
}
System.out.println("True");

        sc.close();
    }
}
