/*********************************************************************
 Purpose/Description: The purpose of this class is to create a stack of
 characters. Tested by InfixToPostfix class
 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

import java.util.*;

public class Stack {

    private List<Character> list;

    //Constructor for Stack
    //creates a list of characters for the stack
    Stack() {
      list = new ArrayList<Character>();
    }

    /**
    * Pushes character in stack
    *
    * @param d character to be added to list
    */
    void push(Character i) {
      list.add(0, i);
    }

    /**
   * Removes character from stack
   *
   * @return the stack with removed element
   */
    Character pop() {
      return list.remove(0);
    }

    /**
     * Peeks at the top of stack
     *
     * @return the element at top of stack
     */
    Character peek() {
      return list.get(0);
    }

    /**
     * Checks if stack is empty
     *
     * @return true if empty
     */
    boolean isEmpty() {
      return list.isEmpty();
    }

}
