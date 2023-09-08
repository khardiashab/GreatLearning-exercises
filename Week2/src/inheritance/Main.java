package inheritance;

class One{
  
}

public class Main {
  private char x = 65;
  Main(char a){
    System.out.println(x);
    System.out.println(a);
  }
  public static void main(String[] args) {
    Main o = new Main('a');
  }
}
