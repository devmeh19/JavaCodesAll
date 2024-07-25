package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class SumNodesleaf {
    static class Node
    {
        Node left;
        Node right;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
    }
    static Scanner sc=new Scanner(System.in);
    public static  Node create()
    {
          //  Scanner sc=new Scanner(System.in);
        Node root=null; 
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1)
        {
            
            return null;
        }
root=new Node(data);
System.out.println("Enter left for"+data);
root.left=create();
System.out.println("Enter right for"+data);
root.right=create();

return root;
}
public static void main(String args[])
{
Node root=create();
System.out.println(sumOfLongRootToLeafPath(root));
sc.close();
}
 static   int mlen=0;
  static  int msum=Integer.MIN_VALUE;
 static   public void solve(Node root,int len,int sum)
    {
        if(root==null)
        {
            if(len>mlen)
            {
               mlen=len;
               msum=sum;
            }
            if(len==mlen)
            {
                msum=Math.max(sum,msum);
            }
            return;
        }
        sum=sum+root.data;
        solve(root.left,len+1,sum);
        solve(root.right,len+1,sum);
    }
   static public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        
       int len=0;
       int sum=0;
        solve( root,len,sum);
        return msum;
        
        
        
    }
}
