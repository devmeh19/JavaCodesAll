import java.util.*;
public class jj {
    static Scanner sc=new Scanner(System.in);
     public static String sortString(String str)
    {
        char tempArray[] = str.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
    public static void main(String[] args) {
  int t=sc.nextInt();
  while(t-->0)
  {
int n=sc.nextInt();
int m=sc.nextInt();
String s=sc.next();
char array[]=s.toCharArray();
int a[]=new int[m];
for(int i=0;i<m;i++)
{
  a[i]=sc.nextInt();
}
String c=sc.next();
c=sortString(c);
Arrays.sort(a);
int ii=0;
int jj=m-1; 

HashSet<Integer> s11=new HashSet<>();
for(int i=0;i<m;i++)
{
  s11.add(a[i]);
}

ArrayList<Integer> arr=new ArrayList<>();
for(int s1:s11)
{
arr.add(s1);
}

int size=arr.size();
c=c.substring(0,size);
for(int i=0;i<size;i++)
{
  array[arr.get(i)-1]=c.charAt(i);
}
String str1=new String(array);
System.out.println(str1);
  }
  
  
  sc.close();
      }
    }   

