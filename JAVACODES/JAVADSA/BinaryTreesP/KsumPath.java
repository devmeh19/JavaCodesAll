package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.ArrayList;
import java.util.Scanner;

public class KsumPath {
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
ksumpath(root,3);
System.out.println();
sc.close();
}
    static int count=0;
 static   ArrayList<Integer> aa=new ArrayList<>();
  static  public void ksumpath(Node root,int k)
    {
     if(root==null)
     return;
    aa.add(root.data);
    ksumpath(root.left,k);
    ksumpath(root.right,k);
    int sum=0;
    for(int j=aa.size();j>=0;j--)
    {
sum=sum+j;
        if(sum==k)
      count++;   
     }
     aa.remove(aa.size()-1);
    }
}
