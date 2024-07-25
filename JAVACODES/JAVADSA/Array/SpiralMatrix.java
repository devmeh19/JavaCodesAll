package JAVACODES.JAVADSA.Array;
import java.util.*;
public class SpiralMatrix
 {
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            a[i][j]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=r-1;
        int right=c-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(a[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                list.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                list.add(a[bottom][i]);
                
            }
            }
            bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(a[i][left]);
                }
                left++;
            }
        }
        
       for(int i=0;i<list.size();i++)
       {
        System.out.println(list.get(i));
       }
        
        sc.close();
    }
}
