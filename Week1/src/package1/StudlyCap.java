package package1;
import java.util.Scanner;
public class StudlyCap {

  private String userInput(){
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter the string: ");
    String text;
    text = in.nextLine();
    in.close();
    return text;
  }

  private Boolean isSmallLetter(char ch){
    if(ch >=97 && ch <= 122) return true;
    return false;
  }

  private Boolean isCapitalLetter(char ch ){
    if(ch >= 65 && ch<= 90) return true;
    return false;
  }

  private boolean isOdd(int num){
    if( num % 2 == 0) return false;
    return true;
  }

  private char changeInCapitalLetter(char ch){
    if(isSmallLetter(ch)) return (char)((int)ch - 32);
    return ch;
  }

  private char changeInSmallLetter(char ch){
    if(isCapitalLetter(ch)) return (char)((int)ch + 32);
    return ch;
  }

  private void studlyCap(String text){
    String result = "";
    
    for(int i = 0 ; i< text.length(); i ++){
      if(isOdd(i+1)){
        result+= changeInSmallLetter(text.charAt(i));
      } else {
        result += changeInCapitalLetter(text.charAt(i));
      }
    }

    System.out.println("The Studly caps string is : " + result);
  }

  // driver code 
  public static void main(String[] args) {
    StudlyCap stdCap = new StudlyCap();
    String text = stdCap.userInput();
    stdCap.studlyCap(text);
  }
}