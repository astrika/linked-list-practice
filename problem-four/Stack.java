/*********************************************************************
 Purpose/Description: The purpose of this class is to create a stack
 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

import java.util.*;

public class Stack {

   public List<Integer> list;

   //Constructor for Stack
   //creates a list for the stack
   Stack() {
     list = new ArrayList<Integer>();
   }

   /**
    * Pushes integer in stack
    *
    * @param d integer to be added to list
    */
   void push(Integer d) {
     list.add(d);
   }

   /**
    * Removes element from stack
    *
    * @return the stack with removed element
    */
   int pop() {
     return list.remove(list.size() - 1);
   }

   /**
    * Peeks at the top of stack
    *
    * @return the element at top of stack
    */
   int peek() {
     return list.get(list.size() - 1);
   }

   /**
    * Checks if stack is empty
    *
    * @return true if empty
    */
   boolean isEmpty() {
     return list.isEmpty();
   }

   /**
    * Prints content of stack
    *
    * @return String of stack content
    */
   String getString() {
     return list.toString();
   }
}
