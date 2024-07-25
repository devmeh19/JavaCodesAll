import java.util.*;
public class LargestPalindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Enter String");
    String s=sc.next();
    ArrayList<Integer> f=new ArrayList<>();
    for(int i=0;i<=9;i++)
    {
        f.add(0);
       }
       int n=s.length();
       for(int i=0;i<n;i++)
       {
    int digit=s.charAt(i)-'0';
    f.set(digit,f.get(digit)+1);
       }
       if(!validate(f))
       {
        System.out.println("Not Possible");
        return ;
       }
       String first="";
       for(int i=9;i>=0;i--)
       {
while(f.get(i)>1)
{
    first+=i;
    f.set(i,f.get(i)-2);
}
       }
    StringBuilder sb=new StringBuilder(first);
    sb.reverse();
    String second=sb.toString();
for(int i=9;i>=0;i--)
{
    if(f.get(i)==1)
    first+=i;
}
String result=first+second;
System.out.println(result);
        sc.close();
    }
    public static boolean validate(ArrayList<Integer> f)
    {
boolean odd=false;
for(int i=0;i<f.size();i++)
{
    if(f.get(i)%2!=0)
    {
        if(odd==true)
        return false;
        odd=true;  
    }
    
}
return true;
    }
   

}
