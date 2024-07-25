import java.util.*;
public class MinimumCoins {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String");
        String A=sc.next();
        char arr[]=new char[A.length()];
        for(int i=0;i<A.length();i++)
        {
            arr[i]=A.charAt(i);
            
        }
        Arrays.sort(arr);
        char ch1=' '; 
        char ch2=' ';
           String str="";
        int f=0;
        for(int i=0;i<A.length();i++){
       if(f==A.length())
        break;
         ch1=arr[f];
        f++;
        if(ch1<A.charAt(i)){
        ch2=A.charAt(i);
            break;
        }
        }
      for(int j=0;j<arr.length;j++)
            {
                char ch3=A.charAt(j);
                if(ch3==ch1)
                ch3=ch2;
                else if(ch3==ch2)
                ch3=ch1;
                str=str+ch3;
            }
      
       System.out.println(str);
       sc.close(); 
    }

       
    }

