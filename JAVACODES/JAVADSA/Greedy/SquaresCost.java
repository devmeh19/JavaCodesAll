import java.util.*;
public class SquaresCost {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter length");
       int m=sc.nextInt();
       System.out.println("Enter breadth");
       int n=sc.nextInt();
  ArrayList<Integer> x=new ArrayList<>();
  ArrayList<Integer> y=new ArrayList<>();
  System.out.println("Enter cost of vertical elements");
  for(int i=0;i<m-1;i++)
  {
int ll=sc.nextInt();
x.add(ll);
  }
  System.out.println("Enter cost of horizontal elements");
       for(int i=0;i<n-1;i++)
       {
        int bb=sc.nextInt();
        y.add(bb);
       }
       x.sort(Comparator.reverseOrder());
       y.sort(Comparator.reverseOrder());
    System.out.println(x);
    System.out.println(y);
   int ve=1;
   int ho=1;
   int i=0;
   int j=0;
   int total=0;
   while(i<m-1&&j<n-1)
   {
    if(x.get(i)>y.get(j))
    {
total+=x.get(i)*ho;
ve++;
i++;
    }
   else 
    {
total+=y.get(j)*ve;
ho++;
j++;
    }
   }
   while(i<m-1)
   {
    total+=x.get(i)*ho;
    i++;
    ve++;
   }
   while(j<n-1)
   {
    total+=y.get(j)*ve;
    ho++;
j++;
   }
   System.out.println(total);
        sc.close();
    }
}
