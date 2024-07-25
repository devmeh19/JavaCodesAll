package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class LargestSubtreesum {
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
         //   Scanner sc=new Scanner(System.in);
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

System.out.println(findLargestSubtreeSum1(root));
sc.close();
}
static int max1=Integer.MIN_VALUE;
public static int findLargestSubtreeSum1(Node root) {     
    if(root==null)
    return 0;
    int l=findLargestSubtreeSum1(root.left);
    int r=findLargestSubtreeSum1(root.right);
    int sum=l+r+root.data;
    max1=Math.max(max1,sum);
    return sum;
}
}
