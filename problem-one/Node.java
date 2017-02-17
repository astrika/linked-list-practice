/*********************************************************************
 Purpose/Description: The purpose of this class is to create a single
 node that contains data and reference to the next node.
 ********************************************************************/


public class Node<Object>{

  //constructor for Node
  // data and next are set to null
  Node(){
    this(null, null);
  }

  //constructor for Node
  // data is set to d and next is set to null
  Node(Object d){
    this(d, null);
  }

  //constructor for Node
  // data is set to d and next is set to n
  Node(Object d, Node n){
    data = d;
    next = n;
  }
  
  Object data;
  Node next;
}
