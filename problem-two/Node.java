public class Node<Comparable>{
  Node(){
    this(null, null);
  }
  Node(Comparable d){
    this(d, null);
  }
  Node(Comparable d, Node n){
    data = d;
    next = n;
  }
  Comparable data;
  Node next;
}
