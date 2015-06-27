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

Node Delete(Node head, int position) {
    Node currHead = head;
    Node iter = head;
    int counter = 0;
    if(position == 0) {
        currHead = head.next;
    } else {
        while((iter.next != null) && (counter != position-1)) {
            counter++;
            iter = iter.next;
        }
    }
    iter.next = iter.next.next;
    return currHead;
}

