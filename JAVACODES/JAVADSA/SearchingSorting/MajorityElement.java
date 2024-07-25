package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class MajorityElement 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter Elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=a[0];
        int count=1;
        for(int i=1;i<size;i++)
        {
            if(count==0)
            {
              count=1;
              c=a[i];
              continue;
            }
            if(a[i]==c)
            {
                count++;
                
            }
            else
            count--;
        }
      int c1=0;
      for(int i=0;i<size;i++)
      {
          if(a[i]==c)
          {
              c1++;
          }
      }
      if(c1>size/2){
       System.out.println(c);
        return ;

      }
       System.out.println(-1);


}
}
