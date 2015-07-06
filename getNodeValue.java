/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node iter = head;
    int counter = 0; 
    while(iter != null) {
        counter++;
        iter = iter.next;
    }
    counter--;
    iter = head;
    while(iter != null) {
        if(counter == n) {
            return iter.data;
        }
        counter--;
        iter = iter.next;
    }
    return 0;
}
