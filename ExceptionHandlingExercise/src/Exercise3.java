import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) throws FileNotFoundException {
    readFile(null);
  }

  // readFile function that takes filename as input. and print the content
  public static void readFile(String filename) throws FileNotFoundException{
    File file = new File(filename);
    Scanner sc = new Scanner(file);

    while(sc.hasNextLine()){
      String line = sc.nextLine();
      System.out.println(line);
    }
  }
}
