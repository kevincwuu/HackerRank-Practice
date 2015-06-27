/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node node = new Node();
    node.data = data;
    node.next = null; 
    if(head == null) {
        head = node;
    } else {
        Node iter = new Node();
        iter = head;
        while(iter.next != null) {
            iter = iter.next;
        }
        iter.next = node;
    }
    return head;
}
