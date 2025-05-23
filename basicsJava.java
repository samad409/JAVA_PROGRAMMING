import java.io.*;

public class basicsJava {
    public static void main(String[] args) {
      int a = 5;
      float b = 5.5f; //f tells java that this is a float not a double
      char c = 'A';
      String d = "Hello";
      boolean e = true;
      double f = 5.5;

      // Print variables
      System.out.println("Integer: " + a);
      System.out.println("Float: " + b);
      System.out.println("Character: " + c);
      System.out.println("String: " + d);
      System.out.println("Boolean: " + e);
      System.out.println("Double: " + f);

      // Arithmetic operations
      int sum = a + 5;
      int diff = a - 2;
      int prod = a * 2;
      int quot = a / 2;
      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + diff);
      System.out.println("Product: " + prod);
      System.out.println("Quotient: " + quot);
      
      // Conditional statements
      if (a > 0) {
          System.out.println("a is positive");
      } else {
          System.out.println("a is non-positive");
      }
      // Looping
      for (int i = 0; i < 5; i++) {
          System.out.println("Loop iteration: " + i);
      }
      
    }
}