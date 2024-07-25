package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class FirstLastPosition 
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
    System.out.println("Enter Occurence");
    int x=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(solve(n,x,arr));
        list.add(solve1(n,x,arr));
        System.out.println(list.get(0));
        System.out.println(list.get(1));   
        
        sc.close();
    }
    public static int solve(int n, int key, int[] v) {
        int start = 0;
        int end = n - 1;
        int res = -1;
    
        while (start <= end) {
          int mid = start + (end - start) / 2;
          if (v[mid] == key) {
            res = mid;
            end=mid-1;
    
          } else if (key < v[mid]) {
            end = mid - 1;
          } else {
            start = mid + 1;
          }
        }
        return res;
      }
      public static int solve1(int n, int key, int[] v) {
        int start = 0;
        int end = n - 1;
        int res = -1;
    
        while (start <= end) {
          int mid = start + (end - start) / 2;
          if (v[mid] == key) {
            res = mid;
            start = mid + 1;
    
          } else if (key < v[mid]) {
            end = mid - 1;
          } else {
            start = mid + 1;
          }
        }
        return res;
      }
}
