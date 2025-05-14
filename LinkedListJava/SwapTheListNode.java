package DSA.LinkedListJava;

public class SwapTheListNode {
  /*
   * Given a linked list A, swap every two adjacent nodes and return its head.
   * NOTE: Your algorithm should use only constant space. You may not modify the values in the list; only nodes themselves can be changed.
   */

   static class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
      this.val = val;
      next = null;
    }
   }
   public static void main(String[] args) {
    // Creating the linked list: 
      // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    swapPairs(head);

    ListNode curr = head;
    while (curr != null) {
      System.out.print(curr.val+"->");
      curr = curr.next;
    }
   }

   @SuppressWarnings("null")
  public static ListNode swapPairs(ListNode A) {
    if(A == null && A.next == null) return A;

    ListNode dummy = new ListNode(0);
    dummy.next = A;
    ListNode prev = dummy;
    ListNode curr = A;

    while (curr != null && curr.next != null) {
      ListNode nextPair = curr.next.next;
      ListNode second = curr.next;

      // swap nodes
      second.next = curr;
      curr.next = nextPair;
      prev.next = second;

      // update pointers
      prev = curr;
      curr = nextPair;
    }
    return dummy.next;

  }
}
