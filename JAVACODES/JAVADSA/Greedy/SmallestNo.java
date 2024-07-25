import java.util.*;
public class SmallestNo {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Total digit");
        int d=sc.nextInt();
        System.out.println("Enter Sum");
        int sum=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<d;i++)
        {
            list.add(0);
        }
        if(d==0||d*9<sum)
        {
            System.out.println("Not Possible");
            return;
        }
        else
        {
            sum--;
            for(int i=d-1;i>=1;i--)
            {
                if(sum>9)
                {
      list.set(i,9);
      sum-=9;
                }
                else{
                    list.set(i,sum);
                    sum=0;
                    break;
                }
            }
        }
        list.set(0,sum+1);
        System.out.println(list);
        sc.close();
    }
}
