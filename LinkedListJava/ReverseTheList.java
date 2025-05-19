public class ReverseTheList {
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      next = null;
    }
  }
  public static void main (String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(6);
    head.next.next.next.next.next.next = new Node(7);
    head.next.next.next.next.next.next.next = new Node(8);
    head.next.next.next.next.next.next.next.next = new Node(9);
    head.next.next.next.next.next.next.next.next.next = new Node(10);

    Node temp = head;

    // while (temp != null) {
    //   System.out.print(temp.data+" ");
    //   temp = temp.next;
    // }
    head = Reverse(head);

    

    while (temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    

  }

  public static Node Reverse(Node head){
    Node prev = null;
    Node current = head;
    Node next = null;

    while(current != null && current.next != null){
      next = current.next;
      current.next = prev;
      prev = current;
    }
    return prev;
  }

}