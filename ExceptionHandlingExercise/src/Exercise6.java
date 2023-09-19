import java.util.HashSet;

public class Exercise6 {
  public static void main(String[] args) throws DuplicateNumberException, DNException  {
    final int[] arr = { 3, 5, 6, 3, 1, 2, 4, 7 };
    identifyDuplicates(arr);
  }

  public static void identifyDuplicates(int... arr) throws DuplicateNumberException  {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (!set.add(num)) {
        throw new DuplicateNumberException(num);
      }
    }
    System.out.println("There are no duplicate values.");
  }
}

class DNException extends IllegalArgumentException {

  public DNException(int num) {
    super("Duplicate " + num + "  values.");
  }
}

class DuplicateNumberException extends Exception {
  DuplicateNumberException(int duplicateNumber) {
    // super();
    super("Error: Number is duplicated.");
  }
}