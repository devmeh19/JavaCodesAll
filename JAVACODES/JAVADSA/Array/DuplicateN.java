package JAVACODES.JAVADSA.Array;
import java.util.*;
public class DuplicateN
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int slow=nums[0];
        int fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
         slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        System.out.println(slow);
        sc.close();
    }
}
