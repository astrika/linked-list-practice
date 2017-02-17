import java.util.*;

public class Stack {

   public List<Integer> list;

   Stack() {
     list = new ArrayList<Integer>();
   }

   void push(Integer d) {
     list.add(d);
   }

   int pop() {
     return list.remove(list.size() - 1);
   }

   int peek() {
     return list.get(list.size() - 1);
   }

   boolean isEmpty() {
     return list.isEmpty();
   }

   String getString() {
     return list.toString();
   }
}
