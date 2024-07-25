package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class isSumTree {
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
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
Node root=create();
System.out.println(isSumTreet(root));
sc.close();
}
static int sum(Node root)
{
    if(root==null)
    {
        return 0;
    }
    return sum(root.left)+sum(root.right)+root.data;

}
	static boolean isSumTreet(Node root)
	{
             if(root==null||root.left==null&&root.right==null)
             return true;
             int l=sum(root.left);
             int r=sum(root.right);
             int sum=l+r;
             if(root.data!=sum)
             return false;
             return isSumTreet(root.left)&&isSumTreet(root.right);
             
             
             
             
	}
    
}
