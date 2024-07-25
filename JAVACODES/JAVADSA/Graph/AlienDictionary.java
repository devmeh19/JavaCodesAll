package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class AlienDictionary {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("Enter total no.of words and letters");
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s[]=new String[n];
            System.out.println("Enter words");
            for(int i=0;i<n;i++)
            {
                s[i]=sc.next();
            }
            ArrayList<ArrayList<Integer>> graph =new ArrayList<>();
            for(int i=0;i<k;i++)
            {
            graph.add(new ArrayList<>());
            }
            for(int j=0;j<n-1;j++)
            {
                String s1=s[j];
                String s2=s[j+1];
                int len=Math.min(s1.length(),s2.length());
                for(int i=0;i<len;i++)
                {
                    if(s1.charAt(i)!=s2.charAt(i))
                    {
           graph.get(s1.charAt(i)-'a').add(s2.charAt(i)-'a');
break;

                    }
                }
            }
            int in[]=new int[k];
            for(int i=0;i<graph.size();i++)
           {
           for(int j=0;j<graph.get(i).size();j++)
           {
             int mm=graph.get(i).get(j); 
                 in[mm]++;
           }
           }
           
Queue<Integer> q= new LinkedList<>();
for(int i=0;i<k;i++)
{
    if(in[i]==0)
    q.add(i);
}
String str="";
while(!q.isEmpty())
{
     int curr=q.remove();
     int cc=curr+97;
     str=str+(char)cc;
       
        for(int i=0;i<graph.get(curr).size();i++)
        {
int ee= graph.get(curr).get(i);
in[ee]--;
if(in[ee]==0)
q.add(ee);

 }
        }
        System.out.println(str);
    
           
    sc.close();
    }

}
