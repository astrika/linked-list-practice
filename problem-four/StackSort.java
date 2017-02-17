/*********************************************************************
 Purpose/Description: The purpose of this class is to sort an unsorted
 stack. Class prints sorted stack.
 Author’s Panther ID: 3354122

 Run Time: O(n) = n^2
 T(n) = n^2 + C
 There are two while loops of size n, one is nested in the other.

 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

import java.util.*;

public class StackSort {

  /**
    * Sorts an unsorted stack
    *
    * @param unsorted the unsorted stack
    * @return temp the sorted stack
    */
  public static Stack sort(Stack unsorted) {
    Stack temp = new Stack();
    while (!unsorted.isEmpty()) {
      int i = unsorted.pop();
      while (!temp.isEmpty() && temp.peek() > i) {
        unsorted.push(temp.pop());
      }
      temp.push(i);
    }
    return temp;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(9);
    stack.push(2);
    stack.push(8);
    stack.push(3);
    stack.push(7);
    stack.push(4);
    stack.push(6);
    stack.push(5);
    System.out.println(sort(stack).getString());
  }
}
