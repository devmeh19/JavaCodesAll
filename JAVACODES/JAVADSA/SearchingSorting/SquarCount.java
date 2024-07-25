package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class SquarCount 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Enter Number");
      int N=sc.nextInt();
      
        int m=(int)Math.sqrt(N);
        if(m*m==N){
     System.out.println(m-1);
     return;
        }
     System.out.println(m);
       
       
        sc.close();
    }
}

