/*********************************************************************
 Purpose/Description: The purpose of this class is to create a single
 node that contains data and reference to the next node. Tested by
 Tester class. Node contains comparable types. Tested by Tester class
 ********************************************************************/

public class Node<Comparable>{

  //constructor for Node
  // data and next are set to null
  Node(){
    this(null, null);
  }

  //constructor for Node
  // data is set to d and next is set to null
  Node(Comparable d){
    this(d, null);
  }

  //constructor for Node
  // data is set to d and next is set to n
  Node(Comparable d, Node n){
    data = d;
    next = n;
  }
  Comparable data;
  Node next;
}
