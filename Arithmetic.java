public class Arithmetic {

  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    System.out.printf("%d + %d = %d\n", a, b, add(a,b));
    System.out.printf("%d * %d = %d\n", a, b, multiply(a,b));
    System.out.printf("%d - %d = %d\n", a, b, subtract(a,b));
    System.out.printf("%d / %d = %d\n", a, b, divide(a,b));
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

}
