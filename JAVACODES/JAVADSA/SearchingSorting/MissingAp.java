package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class MissingAp {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("Enter First term , difference and element");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
        if(c==0)
        {
            if(a==b)
            {
                System.out.println(1);
            return ;
            }
            else
            {
                System.out.println(0);
            return ;

            }
        }
        else
        {
            if((b-a)/c<0)
            {
                System.out.println(0);
                return ;
            }
            else
            {
                if((b-a)%c==0){
               System.out.println(1);
                    return ;

                }
                else

                {
                    System.out.println(0);
                return ;

                }
            }
        }



}
}
