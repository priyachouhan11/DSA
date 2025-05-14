public class SymmetricBinaryTree {
  /*
   * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
   */

   public static class Node {
    Node(int data){
      this.data = data;
    }
    int data;
    Node left;
    Node right;
   }
  public static void main(String[] args) {
    Node root = new Node(1);
    Node a = new Node(2);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(3);
    Node e = new Node(4);
    Node f = new Node(4);
    root.left = a;
    root.right = b;
    a.left = c;
    a.right = e;
    b.left =f;
    b.right = d;

    System.out.println("Is Symmetric: "+isSymmetric(root));
  }
  public static int isSymmetric(Node A) {
    if(A == null) return 1;
    return isMirror(A.left, A.right)?1:0;
  }
  private static boolean isMirror(Node left, Node right){
    if(left == null && right == null) return true;
    if(left == null || right == null) return false;
    return (left.data == right.data) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
  }

}
