/*********************************************************************
 Purpose/Description: The purpose of this class is to convert an infix
 expression to an postfix expression. Infix expression is read from
 a standard input file and postfix expression is printed on console.
 To run:
 javac Stack.javac
 javac InfixToPostfix.java
 java InfixToPostfix
 
 Author’s Panther ID: 3354122
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 -Astrid Manuel
 ********************************************************************/

import java.util.*;

public class InfixToPostfix {

  /**
 * Converts an expression from infix to postfix
 *
 * @param infix the input string that is an infix expression
 * @return postfix the postfix expression
 */
  private static String convert(String infix) {
    Stack stack = new Stack();
    String postfix = "";
    char c;
    for (int i = 0; i < infix.length(); i++) {
      c = infix.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else if (isAlpha(c)) {
        postfix += c;
      } else if (isOperator(c) && (stack.isEmpty() || orderOp(c) > orderOp(stack.peek()) || stack.peek() == '(')) {
        stack.push(c);
      } else if (!stack.isEmpty() || orderOp(c) >= orderOp(stack.peek())) {
        postfix += stack.pop();
        stack.push(c);
      } else if (c == ')') {
        while (stack.peek() != '(') {
          postfix += stack.pop();
        }
      }
    }
    while (!stack.isEmpty()) {
      postfix += stack.pop();
    }
    return postfix;
  }

  /**
 * Returns int for determining order of operations
 *
 * @param c operant to be checked for priority
 * @return 0, 1 ,2 based on priority
 */
  private static int orderOp(char c) {
    if (c == '+' || c == '-') {
      return 1;
    } else if (c == '*' || c == '/') {
      return 2;
    }
    return 0;
  }

    /**
   *  Returns true if character is an operator
   *
   * @param c character to be checked
   * @return true if it is an operator
   */
  private static boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/';
  }

  /**
 * Returns true if character is a variable or number
 *
 * @param c character to be checked
 * @return true if character is a variable o number
 */
  private static boolean isAlpha(char c) {
    return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
  }

  // Run with command: "java InfixToPostfix < input.txt"
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String infix = input.nextLine();
    System.out.println(convert(infix.substring(0, infix.indexOf('='))));
  }
}
