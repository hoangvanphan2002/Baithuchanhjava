package Package;
import java.util.Scanner;
public class Employee extends Person {
  protected String position;
  public void addPosition()
  {
  try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Type position");
      position = sc.nextLine();
    }
  }
  public void displayPosition()
  {
    System.out.println("Position: "+ position);
  }
}