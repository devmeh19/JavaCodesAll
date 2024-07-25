package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class MissingAndRepeating 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }


        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }

        
        int bit=0;
        while(true)
        {
            if((xr&(1<<bit))!=0)
            {
                break;
            }
            bit++;
            
            }
            int number=1<<bit;
          int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }
            else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            }
             else {
                zero = zero ^ i;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }

        if (cnt == 2) 
        {
            System.out.println(zero+""+one);
            return;
        }
        System.out.println(one+""+zero);
}
}
