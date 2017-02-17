import java.util.Scanner;

public class InfixToPostfix {

  private static Stack stack;
  private static String infix;
  private static String postfix;

  public InfixToPostfix(String input){
    input = infix;
    stack = new Stack();
  }

  public static String obtainInfix(Scanner input){
    infix = input.nextLine();
    return infix;
  }

  public static String convert(){
    for(int i = 0; i < infix.length(); i++){
      char ch = infix.charAt(i);
      while(ch != infix.charAt(i)){
      if(ch == '+' || ch == '-'){
        getOperand(ch, 0);
        break;
      } else if(ch == '*' || ch == '/'){
        getOperand(ch, 1);
        break;
      } else if (ch == '('){
        stack.push(ch);
        break;
      } else if(ch == ')'){
        getParenthesis(ch);
        break;
      } else {
        postfix = postfix + ch;
        break;
      }
      }
    }
    while (!stack.isEmpty()){
      postfix = postfix + stack.pop();
    }
    return postfix;
  }

  public static void getOperand(char operand, int priority1){
    while(!stack.isEmpty()){
      char topOperand = stack.pop();
      if(topOperand == '('){
        stack.push(topOperand);
        break;
      } else {
        int priority2;
        if (topOperand == '+' || topOperand == '-'){
          priority2 = 0;
        }else {
          priority2 = 1;
        }
        if(priority2 > priority1){
          stack.push(topOperand);
          break;
        } else {
          postfix = postfix + topOperand;
        }
      }
    }
    stack.push(operand);
  }

  public static void getParenthesis(char ch){
    while(!stack.isEmpty()){
      char check = stack.pop();
      if(check == '('){
        break;
      }else{
        postfix = postfix + check;
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String infix = obtainInfix(input);
    InfixToPostfix conversion = new InfixToPostfix(infix);
    String postfix = conversion.convert();
    System.out.println("Postfix expression: " + postfix);
  }
}
