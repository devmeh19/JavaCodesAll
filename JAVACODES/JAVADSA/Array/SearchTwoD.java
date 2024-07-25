package JAVACODES.JAVADSA.Array;
import java.util.*;
public class SearchTwoD 
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
        System.out.println("Enter target");
        int target=sc.nextInt();
            int n=a.length;
            int m=a[0].length;
                    int low=0;
                    int high=n*m-1;
                    while(low<=high)
                    {
                        int mid=(low+high)/2;
                        int row=mid/m;
                        int column=mid%m;
                        if(a[row][column]==target)
                        {
                            System.out.println(true);
                            return ;
                        }
                                 if(a[row][column]<target)
                        {
                          low++;
                        }
                                 if(a[row][column]>target)
                        {
                            high--;
                        }
            
                    }
                    System.out.println(false);
                    return ;
                }
}