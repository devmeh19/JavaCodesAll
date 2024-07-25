package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class leafsamelevel {
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
            //Scanner sc=new Scanner(System.in);
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

System.out.println(check(root));
sc.close();
}
static int m;
static boolean level(Node root,int h)
{
    if(root==null)
        return true ;
  //  if(a==0)
    //return ;
  
    if(root.left==null&&root.right==null)
    {
        if(m==-1)
        {
            m=h;
            return true;
        }
      else  
      if(h!=m)
        {
            return false;
              
        }
      //  return;  
    }
   
       return level(root.left,h+1)&&level(root.right,h+1);
        
       // return true;  
}
static boolean check(Node root)
{
  
   
   int h=1;
   m=-1;
boolean h1=	level(root,h);
   return h1;
   
}
}
