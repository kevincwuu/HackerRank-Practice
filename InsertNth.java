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

Node InsertNth(Node head, int data, int position) {
    Node currHead = head;
    Node node = new Node();
    node.data = data;
    Node iter = head;
    if(position == 0) {
        node.next = head; 
        currHead = node;
    }
    int counter = 0;
    while((iter.next != null) && (counter != position-1)) {
        iter = iter.next;
        counter++;
    }
    if(counter == position-1) {
        node.next = iter.next;
        iter.next = node;
    }
    return currHead;
}
