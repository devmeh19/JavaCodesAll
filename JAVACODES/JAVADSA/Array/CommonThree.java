package JAVACODES.JAVADSA.Array;
import java.util.*;
public class CommonThree
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of three array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int A[]=new int[n1];
        int B[]=new int[n2];
        int C[]=new int[n3];
        System.out.println("Enter Elements");
        for(int i=0;i<n1;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            B[i]=sc.nextInt();
        }
        for(int i=0;i<n3;i++)
        {
            C[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> r=new ArrayList<>();
        Set<Integer> seen=new HashSet<>();
        while(i<n1&&j<n2&&k<n3)
        {
            if(A[i]==B[j]&&B[j]==C[k])
            {
              if(seen.add(A[i]))
                r.add(A[i]);
              
                
                i++;
                j++;
                k++;
                continue;
            }
            else if(B[j]<C[k])
            {
                j++;
                
            }
            else if(A[i]<C[k])
            {
                i++;
            }
            else
            k++;
        }
       System.out.println(r);
        sc.close();
    }
}
