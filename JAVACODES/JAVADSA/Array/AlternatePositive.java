
import java.util.Scanner;
public class AlternatePositive
 {
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int po[]=new int[n];
        int ne[]=new int[n];
int a1[]=new int[n];
int o=0;
int e=0;

for(int i=0;i<n;i++)
{
    if(a[i]>=0)
    {
        po[o]=a[i];
        o++;
    }
    else
    {
        ne[e]=a[i];
        e++;
    }
}

int d1=Math.min(o,e);
int d2=Math.max(o,e);
int o1=0;
int e1=0;
for(int i=0;i<d1;i++)
{
    if(i%2==0)
    {
      a1[i]=po[o1];
      o1++;
    }
    else
    {
        a1[i]=ne[e1];
        e1++;
        
    }
}
if(o1>e1)
{
   for(int i=d1;i<d2;i++)
   {
       a1[i]=po[o1];
       o1++;
   }
}
else
{
    for(int i=d1;i<d2;i++)
   {
       a1[i]=ne[e1];
       e1++;
   } 
}
a=a1;
for(int i=0;i<n;i++)
{
    System.out.println(a1[i]);
}
        
        sc.close();
    }
}
