public class MySinglyLinkedList{

    Node<Object> head;
    private int size;

    public MySinglyLinkedList() {
        head = new Node<>();
        size = 0;
    }

    public boolean add(Object x) {
      Node current = head;
      while (current.next != null) {
          if (current.data != null && current.data.equals(x)) {
              return false;
          }
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

  public int size(){
    return size;
  }

  public void print(){
    Node current = head;
    String str = "";
    while (current.next != null) {
      current = current.next;
      str += current.data.toString() + ", ";
    }
    System.out.println(str.substring(0, str.length() - 2));
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
