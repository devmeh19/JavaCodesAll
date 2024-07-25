package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class Isomorphic {
    static Scanner sc=new Scanner(System.in);
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
HashMap<Character,Character> mp=new HashMap<>();
for(int i=0;i<s1.length();i++)
{
char c1=s1.charAt(i);
char c2=s2.charAt(i);
if(mp.containsKey(c1))
{
    if(mp.get(c1)!=c2){
System.out.println("False");
return ;
    }
}
else if(mp.containsKey(c2))
{
    System.out.println("False");
    return;
}
else
{
    mp.put(c1,c2);
}
}
System.out.println("True");

        sc.close();
    }
}
