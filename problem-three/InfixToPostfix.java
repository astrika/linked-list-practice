import java.util.Scanner;

public class InfixToPostfix {

  private static Stack stack;
  private static String infix;
  private static String postfix;
  Scanner input = new Scanner(System.in);

  public InfixToPostfix(String input){
    input = infix;
    stack = new Stack();
  }

  public static String obtainInfix(Scanner input){
    infix = input.nextLine();
    infix = infix.substring(0, infix.indexOf('='));
    return infix;
  }

  public static String convert(){
    for(int i = 0; i < infix.length(); i++){
      char ch = infix.charAt(i);
      if(ch == '+' || ch == '-'){
        getOperand(ch, 0);
        break;
      } else if(ch == '*' || ch == '/'){
        getOperand(ch, 1);
        break;
      } else if (ch == '(' || ch == ')'){
        stack.push(ch);
        break;
      } else {
        postfix = postfix + ch;
        break;
      }
    }
  }

  public static void main(String[] args) {


  }
}
