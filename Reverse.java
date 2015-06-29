/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node prev = new Node();
    Node curr = new Node();
    Node next = new Node();
    curr = head; 
    prev = null;
    while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr; 
        curr = next;
    }
    head = prev;
    return head; 
}
