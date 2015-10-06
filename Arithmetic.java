public class Arithmetic {

  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    printf("%d + %d = %d\n", a, b, add(a,b));
    printf("%d * %d = %d\n", a, b, multiply(a,b));
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

}