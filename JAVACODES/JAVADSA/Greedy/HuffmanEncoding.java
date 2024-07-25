import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class HuffmanEncoding {
      static Scanner sc=new Scanner(System.in);
      static class Node implements Comparable<Node>{
        int data;
        Node left;
        Node right;
        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo(Node other) {
            return this.data < other.data ? -1: 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter String");
        String S=sc.next();
        int len=S.length();
System.out.println("Enter Length");
        int N=sc.nextInt();
        int f[]=new int[N];
for(int i=0;i<len;i++)
{
    f[i]=sc.nextInt();
}
 // List<Node> nodes = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        for (int i = 0; i < f.length; i++) {
            pq.offer(new Node(f[i]));
        }
        
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            
            Node merged = new Node(left.data + right.data);
            merged.left = left;
            merged.right = right;
            
            pq.offer(merged);
        }
            ArrayList<String> codes = new ArrayList<>();
        traverse(pq.poll(), codes, "");
        for(int i=0;i<codes.size();i++)
        {
            System.out.println(codes.get(i));
        }
        
        sc.close();

    }
           private static void traverse(Node root, ArrayList<String> codes, String code){
        if (root.left == null && root.right == null) {
            codes.add(code);
            return;
        }
        if (root.left != null) traverse(root.left, codes, code + "0");
        if (root.right != null) traverse(root.right, codes, code + "1");
    }
        
    }

