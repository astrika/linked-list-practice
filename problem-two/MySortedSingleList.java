/*********************************************************************
 Purpose/Description: The purpose of this class is to create a single
 sorted linked list with no reference to a tail. Class includes
 methods to add, remove, print, and find elements. Duplicate elements
 were not permitted. Elements are put in order as the are added.
 This class is tested by Tester class.

 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

public class MySortedSingleList{

  Node<Object> head;
  private int size;

  /**
    * constructor for MySinglyLinkedList
    */
  public MySortedSingleList() {
      head = new Node<>();
      size = 0;
  }

  /**
  * Adds element to linked list and sorts and as its being added
  * No Duplicate elements allowed
  *
  * @param x object to be input in list
  * @return true if added
  */
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

  /**
  * Removes element of linked list
  *
  * @param x object to be removed in list
  * @return true if removed
  */
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
