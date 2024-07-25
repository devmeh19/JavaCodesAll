package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MaximumRowOne
 {
    public static  int lowerBound(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            arr[i][j]=sc.nextInt();
        }
        int n=r;
        int m=c;
        int cnt_max = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
    
            int cnt_ones = m - lowerBound(arr[i], m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        System.out.println(index);
        sc.close();
    }
}
 