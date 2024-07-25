 package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class FourPairSum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
System.out.println("Enter Targert");
int target=sc.nextInt();
        Arrays.sort(nums);
for (int i = 0; i < n; i++) {
    if (i > 0 && nums[i] == nums[i - 1]) continue;
    for (int j = i + 1; j < n; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) continue;
        int k = j + 1;
        int l = n - 1;
        while (k < l) {
            long sum = nums[i];
            sum += nums[j];
            sum += nums[k];
            sum += nums[l];
            if (sum == target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                temp.add(nums[l]);
                ans.add(temp);
                k++;
                l--;
                while (k < l && nums[k] == nums[k - 1]) k++;
                while (k < l && nums[l] == nums[l + 1]) l--;
            } else if (sum < target) k++;
            else l--;
        }
    }
}
for(int i=0;i<ans.size();i++)
{
for(int j=0;j<ans.get(i).size();j++)
{
    System.out.print(ans.get(i).get(j));
}
System.out.println();
}


    }
}
