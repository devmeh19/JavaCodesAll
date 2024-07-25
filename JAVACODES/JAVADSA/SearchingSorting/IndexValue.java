package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class IndexValue 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
            {
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
}

}
