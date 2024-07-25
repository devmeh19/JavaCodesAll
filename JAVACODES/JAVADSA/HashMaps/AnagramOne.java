package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class AnagramOne {
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
HashMap<Character,Integer>  m2=check(s2);
System.out.println(m1.equals(m2));

        sc.close();
    }
}
