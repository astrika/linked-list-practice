public class Stack{

  private int maxSize;
  private int[] stackArray;
  private int top;

  public Stack(int max){
    maxSize = max;
    stackArray = new int[maxSize];
    top = 0;
  }

  public void push(char i){
    stackArray[++top] = i;
  }

  public int pop(){
    return stackArray[top--];
  }

  public int peek(){
    return stackArray[top];
  }

  public boolean isEmpty(){
    return (top == 0);
  }

}
