public class Node<Object>{
  Node(){
    this(null, null);
  }
  Node(Object d){
    this(d, null);
  }
  Node(Object d, Node n){
    data = d;
    next = n;
  }
  Object data;
  Node next;
}
