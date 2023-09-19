import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int divident, divisior;
    System.out.println("Enter two values like divident && divisior : ");
    divident = sc.nextInt();
    divisior = sc.nextInt();
    try {
      float result = divident/divisior;
      System.out.println("The result of this probme: "  + result);

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    sc.close();
  }
}
