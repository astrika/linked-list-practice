import java.util.Scanner;

public class InfixToPostfix {

  private Stack stack;
  private String infix;
  private String postfix;
  Scanner input = new Scanner(System.in);

  public InfixToPostfix(String input){
    input = infix;
    int stackSize = infix.length();
    stack = new Stack(stackSize);
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
        getOperand(ch, 1);
        break;
      } else if(ch ==)
    }
  }

  public static void main(String[] args) {


  }
}
