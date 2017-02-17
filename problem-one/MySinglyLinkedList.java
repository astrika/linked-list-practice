/*********************************************************************
 Purpose/Description: The purpose of this class is to create a single
 linked list with no reference to a tail. Class includes methods to
 add, remove, print, give size, and find elements.
 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/


public class MySinglyLinkedList{

    Node<Object> head;
    private int size;

    /**
    * constructor for MySinglyLinkedList
    */
    public MySinglyLinkedList() {
        head = new Node<>();
        size = 0;
    }

    /**
    * Adds element to linked list
    *
    * @param x object to be input in list
    * @return true if added
    */

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

    /**
    * Removes element to linked list
    *
    * @param x object to be removed in list
    * @return true if removed
    */

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

    /**
    * Gives size of list
    *
    * @return size of list
    */

    public int size(){
      return size;
    }

    /**
    * Prints the elements of linked list
    */

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

  /**
  * Checks if an item is contained in list
  *
  * @param x object to checked
  * @return true if it is contained
  */

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
