import java.util.*;
public class MaxStocks {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter days");
    int n=sc.nextInt();
    System.out.println("Total Money");
    int k=sc.nextInt();
    int price[]=new int[n];
    for(int i=0;i<n;i++)
    {
        price[i]=sc.nextInt();
    }
    int[][] pairs = new int[n][2];
        
    for (int i = 0; i < n; i++) {
        pairs[i][0] = price[i];
        pairs[i][1] = i + 1;
    }
    
    // Sort the array based on prices
    Arrays.sort(pairs, (p1, p2) -> Integer.compare(p1[0], p2[0]));
    
    int count = 0;
    int remainingMoney = k;
    
    for (int i = 0; i < n; i++) {
        int stockValue = pairs[i][0] * pairs[i][1];
        
        if (remainingMoney >= stockValue) {
            count += pairs[i][1];
            remainingMoney -= stockValue;
        } else if (remainingMoney >= pairs[i][0]) {
            int val = pairs[i][0];
           
            
            while (remainingMoney >= val) {
                count += 1;
                remainingMoney -= val;
              
            }
        }
    }
    
  System.out.println(count);


    sc.close();
   } 
}
