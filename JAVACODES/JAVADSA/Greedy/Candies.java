import java.util.*;
public class Candies {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter total");
    int n=sc.nextInt();
    System.out.println("Enter Free");
    int K=sc.nextInt();
    int candies[]=new int[n];
    for(int i=0;i<n;i++)
    {
        candies[i]=sc.nextInt();
    }
    ArrayList<Integer> list=new ArrayList<>();
    Arrays.sort(candies);
    int minsum=0;
     int maxsum=0;
    int j=0;
    for(int i=0;i<n-j;i++)
    {
        minsum+=candies[i];
        j+=K;
    }
   
    int jj=0;
    for(int k=candies.length-1;k>=jj;k--)
    {
        maxsum+=candies[k];
        jj+=K;
    }
    list.add(minsum);
    list.add(maxsum);
for(int i=0;i<list.size();i++){

    System.out.println(list.get(i));
}
    sc.close();
   } 
}
