import java.util.*;
public class PositionalList {
//initialize everything to 0. Head and tail are empty to start
  public int size = 0;
  public Node head = null;
  public Node tail = null;
  public void addNodeAtStart(int data) {
    Node n = new Node(data);
    if(size == 0){
     head = n;
     tail = n;
     n.next = head;
    } else {
     Node temp = head;
     n.next = temp;
     head = n;
     tail.next = head;
    }
    size++;
  }
  public static void main(String[] args) {
    PositionalList pl = new PositionalList();
for(int i = 0; i < 25; i++) {
  pl.addNodeAtStart(i+5);
}
pl.print();
  }
  //create the class for the node
  class Node{
   int data;
   Node next;
   //constructor to setup the node
   public Node(int data){
    this.data = data;
   }
  }

  public void print(){
    System.out.print("Positional List:");
    Node temp = head;
    if(size<=0){
     System.out.print("List is empty");
    }else{
     do {
      System.out.print(" " + temp.data);
      temp = temp.next;
     }
      while(temp!=head);
     }
    System.out.println();
  }
}