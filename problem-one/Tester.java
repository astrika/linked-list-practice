/*********************************************************************
 Purpose/Description: The purpose of this class is to test the
 MySinglyLinkedList class methods. This will print out a created
 list.
 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

public class Tester{

  public static void main(String[] args){

     MySinglyLinkedList list = new MySinglyLinkedList();

    System.out.println("Adding A: " + list.add("A"));
	  list.print();
    System.out.println("Adding B: " + list.add("B"));
	  list.print();
    System.out.println("Adding C: " + list.add("C"));
	  list.print();
    System.out.println("Removing B: " + list.remove("B"));
    list.print();
    System.out.println("List size: " + list.size());

    System.out.println("List contains B: " + list.contains("B"));
    System.out.println("List contains A: " + list.contains("A"));

   }
}
