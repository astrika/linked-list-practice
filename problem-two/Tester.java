public class Tester{

  public static void main(String[] args){

    MySortedSingleList list = new MySortedSingleList();

    System.out.println("Adding A: " + list.add("A"));
    System.out.println("Adding C: " + list.add("C"));
    System.out.println("Adding E: " + list.add("E"));
    System.out.println("Adding B: " + list.add("B"));
    System.out.println("Adding J: " + list.add("J"));
    System.out.println("Removing B: " + list.remove("B"));

    list.print();

    System.out.println("List contains B: " + list.contains("B"));
    System.out.println("List contains A: " + list.contains("A"));
  }

}
