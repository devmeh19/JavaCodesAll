package JAVACODES.JAVADSA.HashSet;
import java.util.*;
public class CreateSet
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<String> s=new HashSet<>();
        s.add("Dev");
        s.add("Hello");
        System.out.println(s.size());
        System.out.println(s.contains("Dev"));
        System.out.println(s.contains("Hi"));
        s.remove("Hello");
        System.out.println(s.size());
        s.add("DD");
        s.add("DDEE");
        System.out.println(s.size());
        for(String s1:s)
        {
System.out.println(s1);
        }
       Iterator<String> ii=s.iterator();
       while(ii.hasNext())
       {
        System.out.println(ii.next());
       }
        sc.close();
    }
}
