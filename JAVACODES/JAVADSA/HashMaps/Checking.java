package JAVACODES.JAVADSA.HashMaps;
import java.util.*;
public class Checking
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",28);
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        mp.put("Akash",25);
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));
  System.out.println(mp.containsKey("Akash"));
  System.out.println(mp.containsKey("Yash"));
  mp.putIfAbsent("Anshika",30);
  mp.putIfAbsent("Yash",30);
  System.out.println(mp.keySet());
  System.out.println(mp.values());
  System.out.println(mp.entrySet());
  for(String key : mp.keySet())
  {
    System.out.printf("Age of %s is %d\n",key,mp.get(key));
  }
  System.out.println();
  for(Map.Entry<String,Integer> e: mp.entrySet())
  {
System.out.printf("Age of%s is %d\n",e.getKey(),e.getValue());
  }
  System.out.println();
  for(var e: mp.entrySet())
  {
System.out.printf("Age of%s is %d\n",e.getKey(),e.getValue());
  }
        sc.close();
    }
}
