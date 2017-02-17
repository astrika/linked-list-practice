/*********************************************************************
 Purpose/Description: The purpose of this class is to test the
 MySortedSingleList class methods. This will print out a created
 list.
 To test:
 javac Node.java
 javac MySortedSingleList.java
 javac Tester.java
 java Tester

 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

public class Tester{

  public static void main(String[] args){

    MySortedSingleList list = new MySortedSingleList();

    System.out.println("Adding A: " + list.add("A"));
    list.print();
    System.out.println("Adding C: " + list.add("C"));
    list.print();
    System.out.println("Adding J: " + list.add("J"));
    list.print();
    System.out.println("Adding B: " + list.add("B"));
    list.print();
    System.out.println("Adding E: " + list.add("E"));
    list.print();
    System.out.println("Removing C: " + list.remove("C"));
    list.print();


    System.out.println("List contains C: " + list.contains("C"));
    System.out.println("List contains A: " + list.contains("A"));
  }

}
