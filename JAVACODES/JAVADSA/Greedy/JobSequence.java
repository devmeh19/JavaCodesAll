import java.util.*;
public class JobSequence {
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter total no. of jobs");
        int n=sc.nextInt();
        Job arr[]=new Job[n];
        System.out.println("Enter deadline and profit");
        for(int i=0;i<n;i++)
        {
          //  int dd=sc.nextInt();
        //  int pp=sc.nextInt();
        //    arr[i]=new Job(i+1,dd,pp);
        }
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        int max_dead=0;
        for(int i=0;i<n;i++){
            max_dead=Math.max(max_dead,arr[i].deadline);
        }
        
        boolean[] job=new boolean[max_dead];
        int[] res=new int[2];
        
        for(int i=0;i<n;i++){
            int x=arr[i].deadline;
            if(job[x-1]==false){
                res[0]++;
                res[1]+=arr[i].profit;
                job[x-1]=true;
            }
            else{ 
                for(int j=x-1;j>=0;j--){
                    if(job[j]==false){
                        res[0]++;
                        res[1]+=arr[i].profit;
                        job[j]=true;
                        break;
                    }
                }
            }
        }
        
      System.out.println(res[0]+" "+res[1]);

        sc.close();
    }
}
