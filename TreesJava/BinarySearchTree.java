/*
 * Binary tree with a property 
 * -> every node to this left of a given node is smaller than the node
 * -> every node to this right of a given node is greter than the node
 * efficient searching is -> O(log)
 * efficient insertion and delection is -> O(log)
 * 
 * 
 * 
 * Machine learning is the process of traning a piece of software called a mosel to make useful predictions or generate content form data
 */
public class BinarySearchTree {
  public static class Node{
    Node(int data){
      this.data = data;
    }
    int data;
    Node left;
    Node right;
  }
  public static void main(String[] args) {
    Node root = new Node(10);
    Node a = new Node(9);
    Node b = new Node(8);
    Node e = new Node(7);
    Node c = new Node(11);
    Node d = new Node(13);

    root.left = b;
    b.left = e;
    b.right = a;
    root.right = c;
    c.right = d;

    // System.out.println("Before insertion");
    // inoder(root);
    // System.out.println(searchBST(root, 15));
    // insertBST(root, 6);
    // System.out.println("after insertion");
    // inoder(root);

    
    
    
  }

  public static Node searchBST(Node root, int key){
    if(root == null) return null;
    else if(root.data == key) return root;
    else if(root.data > key) searchBST(root.left, key);
    else  searchBST(root.right, key);
    return null;
  }

  public static Node insertBST(Node root, int val){
    
    if(root == null) return new Node(val);

    else if(root.data > val){
      if(root.left == null) root.left = new Node(val);
      else insertBST(root.left, val); 
    }
    else{
      if(root.right == null) root.right = new Node(val);
      else insertBST(root.right, val);
    }
    return root;
    }

  public static void inoder(Node root){   
    // root left, root, root right
    if(root == null) return;
    inoder(root.left);       
    System.out.print(root.data+", ");
    inoder(root.right);
  }

}
