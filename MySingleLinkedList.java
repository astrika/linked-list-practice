import java.util.List;

public class MySingleLinkedList{

    Node head;
    Node current;
    private int size;

    public MySingleLinkedList() {
        head = new Node();
        size = 0;
    }

    public boolean add(Object x) {
      Node current = head;
      while (current.next != null) {
          if (current.data.equals(x)) {
              return false;
          }
          current = current.next;
      }
      current.next = new Node(x);
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
    while (current.data != null) {
        System.out.printf(current.data + "   ");
        current = current.next;
    }
  }

  public boolean contains(Object x){
    Node current = head;
    while (current.data != null) {
        if (current.next.data.equals(x)) {
            return true;
        }
        current = current.next;
    }
    return false;
  }

}
