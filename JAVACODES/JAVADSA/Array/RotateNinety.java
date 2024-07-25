package JAVACODES.JAVADSA.Array;
import java.util.Scanner;
public class RotateNinety 
{
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
        rotateby90(arr,r);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            System.out.println(arr[i][j]);        }

}
static void rotateby90(int matrix[][], int n) 
    { 
        // code here
            for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length/2;i++){
            for (int j = 0; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 -i][j];
                matrix[matrix.length - 1 -i][j]=temp;
            }
        }
    }
}
