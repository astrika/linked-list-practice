import java.util.*;

public class StackSort {

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
