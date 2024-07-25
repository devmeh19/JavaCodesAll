package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class MinDistance {
    
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
    public static  Node create()
    {
           // Scanner sc=new Scanner(System.in);
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
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
Node root=create();
System.out.println(findDist(root,1,4));
sc.close();
}
  static  Node lca(Node root, int n1,int n2)
	{
		if(root==null)
		return null;
		if(root.data==n1||root.data==n2)
		return root;
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		if(left!=null&&right!=null)
		return root;
			if(left!=null&&right==null)
		return left;
			if(left==null&&right!=null)
			return right;
			else
			return null;
	}
  static  int solve(Node root,int val)
    {
        if(root==null)
        return 0;
        if(root.data==val)
        return 1;
        int l=solve(root.left,val);
        int r=solve(root.right,val);
        if(l==0&&r==0)
        return 0;
        return l+r+1;
    }
    
   static int findDist(Node root, int a, int b) {
        Node dd=lca(root,a,b);
        int m1=solve(dd,a);
        int m2=solve(dd,b);
        return m1+m2-2;
    }
}
