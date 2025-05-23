import  java.util.Scanner;
import java.io.*;

class objectFirst {
  
    int add(int a, int b) {
        return a + b;
    }
}

class objectSecond {
  
    int subtract(int a, int b) {
        return a - b;
    }
}
class objectThird {
  
    int multiply(int a, int b) {
        return a * b;
    }
}
class objectFourth {
  
    int divide(int a, int b) {
        if (b == 0) {
  
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
class objectFifth {
  
    int modulus(int a, int b) {
        return a % b;
    }
}

class objectOriented {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter two numbers:");
    a = sc.nextInt();
    b = sc.nextInt();

    objectFirst obj1 = new objectFirst();
    objectSecond obj2 = new objectSecond();
    objectThird obj3 = new objectThird();
    objectFourth obj4 = new objectFourth();
    objectFifth obj5 = new objectFifth();

    System.out.println("Addition: " + obj1.add(a, b));
    System.out.println("Subtraction: " + obj2.subtract(a, b));
    System.out.println("Multiplication: " + obj3.multiply(a, b));
    System.out.println("Division: " + obj4.divide(a, b));
    System.out.println("Modulus: " + obj5.modulus(a, b));
  }
} 