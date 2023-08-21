package package2;

public class LeapYear {
  
  void isLeapYear(int year){
    boolean is = false;
    if(year % 400 == 0){
      is = true;
    } else if( year % 4 == 0  && year % 100 != 0){
      is = true;
    } 
    if(is){
      System.out.println("This is leap year.");
    } else {
      System.out.println("This is not leap year.");
    }
  }
}
