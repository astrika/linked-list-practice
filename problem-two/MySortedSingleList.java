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
      }
      Node<Comparable> temp = current.next;
      if (temp.data != null && temp.data.compareTo(x) > 0) {
        current.next = new Node<>(x);
        current.next.next = temp;
        return true;
      }
      current = current.next;
    }
    current.next = new Node<>(x);
    size++;
    return true;
  }

  public boolean remove(Comparable x) {
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

  public void print(){
    Node current = head;
    String str = "";
    while (current.next != null) {
      if (str.length() > 0) {
        str += ", ";
      }
      current = current.next;
      str += current.data.toString();
    }
    System.out.println(str);
  }

  public boolean contains(Comparable x){
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
