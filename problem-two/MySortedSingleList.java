public class MySortedSingleList{

  Node<Object> head;
  private int size;

  public MySortedSingleList() {
      head = new Node<>();
      size = 0;
  }
    
  public boolean add(Comparable x) {
    Node current = head;
    while (current.next != null) {
      if (current.data != null && current.data.equals(x)) {
          return false;
      current = current.next;
    }
    current.next = new Node<>(x);
    size++;
    return true;
  }

  public boolean remove(Object x) {
    Node current = head;
    while (current.next != null) {
      if (current.next.data.equals(x)) {
          current.next = current.next.next;
          size--;
          return true;
      }
      current = current.next;
    }
    return false;
  }

  public boolean contains(Object x){
    Node current = head;
    while (current.next != null) {
        if (current.next.data.equals(x)) {
            return true;
          }
          current = current.next;
        }
        return false;
  }
  
}