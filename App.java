class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    for (int countDown = 10; countDown > 0; countDown--) {
      System.out.println(countDown);
    }
    System.out.println("Launch!");
  }

  private static void whileLoop() {

    int feelings = 0;
    while (feelings < 5) {
      System.out.println("I love Java!");
      feelings++;
    }
  }

  private static void doWhileLoop() {

    int feelings = 0;
    do {
      System.out.println("I love Java!");
      feelings++;
    } while (feelings < 5);
  }
}
