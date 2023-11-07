package StackOperations;

import java.util.NoSuchElementException;
public class LinkedStack implements Stack {
  private class Node {
   int plate;
   Node next;
   public Node(int current) {
    plate = current;
   }
  }
  //list functions below
  //in a list the head is the 'top'
  //but this is a stack so let's call it top
  private Node top;
  //constructor to start an empty stack
  public LinkedStack() {
   top = null;
  }
  public void push(int current) {
   Node c = new Node(current);
   c.next = top;
   top = c;
  }
  public int pop() {
   int returnPlate;
   returnPlate = top.plate;
   top = top.next;
   return returnPlate;
  }
 public boolean isEmpty() {
   return top == null;
  }
  public int size() {
   int counter = 0;
   for(Node node = top; node != null; node=node.next) {
    counter ++;
   }
   return counter;
  }
  public int peek() {
  if(top == null) {
   throw new NoSuchElementException();
  }
  return top.plate;
  }
}