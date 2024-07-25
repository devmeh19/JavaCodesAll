import java.util.*;
public class IslandFood {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int S=sc.nextInt();
        int N=sc.nextInt();
        int M=sc.nextInt();
        int result=0;
        int total=S*M;
        if(M>N||(S>7&&7*M>6*N))
{
result=-1;
}
else
{
result=(int)(Math.ceil((double)total/N));
}
System.out.println(result);
        sc.close();
    }
}
