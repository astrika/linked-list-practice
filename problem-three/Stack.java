private class Stack {

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

    Character isEmpty() {
      return list.isEmpty();
    }

}
