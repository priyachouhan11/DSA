import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

  public static class Node{
    public Node(int data) {
          this.data = data;
        }
        int data;
        Node left;
        Node right;
        
      }

      public static void main(String[] args) {
        Node root = new Node(1);    
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        pre_oder(root);
        // System.out.println();
        // inoder(root);
        // System.out.println();
        // post_oder(root);
        // System.out.println(sizeOfTree(root));
        // System.out.println(sumOfTree(root));
        // System.out.println(maxValeOfTree(root));
       // System.out.println(hightOfTree(root));
      //  System.out.println(minValeOfTree(root));
      //  System.out.println(productOfTree(root));
       //nthLever(root, 4);
      // bfs(root);
      // System.out.println();
      // dfs(root);

      //System.out.println(countLeaves(root));



  }

  public static void pre_oder(Node root){
    // root, root left, root right
    if(root == null) return;
    System.out.print(root.data+", ");
    pre_oder(root.left);
    pre_oder(root.right);
  }

  public static void inoder(Node root){   
    // root left, root, root right
    if(root == null) return;
    inoder(root.left);       
    System.out.print(root.data+", ");
    inoder(root.right);
  }

  public static void post_oder(Node root){
        // root left, root right, root

    if(root == null) return;
    post_oder(root.left);
    post_oder(root.right);
    System.out.print(root.data+", ");
  }
  
  public static int sizeOfTree(Node root){
    if(root == null) return 0;
    return sizeOfTree(root.left) + sizeOfTree(root.right) +1;
  }

  public static int sumOfTree(Node root){
    if(root == null) return 0;
    return root.data + sumOfTree(root.left) + sumOfTree(root.right);
  }

  public static int maxValeOfTree(Node root){
    if(root == null) return Integer.MIN_VALUE;
    return Math.max(root.data, Math.max(maxValeOfTree(root.left), maxValeOfTree(root.right)));
  }

  public static int hightOfTree(Node root){
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 0;
    return 1+ Math.max(hightOfTree(root.left), hightOfTree(root.right));
  }
  
  public static int minValeOfTree(Node root){
    if(root == null) return Integer.MIN_VALUE;
    return Math.min((root.data), Math.min(minValeOfTree(root.left), minValeOfTree(root.right)));
  }

  public static int productOfTree(Node root){
    if(root == null) return 1;
    return root.data * productOfTree(root.left) * productOfTree(root.right);
  }

  public static void nthLever(Node root, int n){
    if(root == null) return;
    if(n==1) System.out.print(root.data+" ");
    nthLever(root.left, n-1);
    nthLever(root.right, n-1);
  }

  public static void bfs(Node root){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (q.size() >0) {
      Node temp = q.peek();
      if(temp.left != null){
        q.add(temp.left);
      }
      if(temp.right !=null){
        q.add(temp.right);
      }
      System.out.print(temp.data+" ");
      q.remove();
      
    }
  }

  public static void dfs(Node root){
    Stack<Node> s = new Stack<>();
    s.add(root);
    while (s.size() > 0) {
      Node temp = s.peek();
      if(temp.left != null){
        s.add(temp.left);
      }
      if(temp.right != null){
        s.add(temp.right);
      }
      System.out.print(temp.data+" ");
      s.remove(temp);
      
    }
  }

  public static int countLeaves(Node node) {
    if(node == null) return 0;
    if(node.left == null && node.right == null) return 1;
    return countLeaves(node.left) + countLeaves(node.right);
  }

  

}
