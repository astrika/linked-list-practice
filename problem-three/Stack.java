import java.util.*;

public class Stack {

    private List<Character> list;

    Stack() {
      list = new ArrayList<Character>();
    }

    void push(Character i) {
      list.add(0, i);
    }

    Character pop() {
      return list.remove(0);
    }

    Character peek() {
      return list.get(0);
    }

    boolean isEmpty() {
      return list.isEmpty();
    }

}
