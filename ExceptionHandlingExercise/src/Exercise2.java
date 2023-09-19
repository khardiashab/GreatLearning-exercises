import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

  public static void oddDetector(int numb) throws IOException {
    if(numb / 2 != 0 ){
      throw new IOException("Error : Given number is odd.");
    }
    else System.out.println("Programme completed successfully.");
  }

  public static void main(String[] args) throws IOException  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please provide a Integer Number programme run successfully if given number is even.");

    int input = sc.nextInt();
    oddDetector(input);
    try {
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  //   try {
      
    
  }
}
