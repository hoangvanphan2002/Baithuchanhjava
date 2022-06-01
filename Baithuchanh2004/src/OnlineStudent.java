package Package;
import java.util.Scanner;
public class OnlineStudent extends Student {
  public String devices;
  public void addDevices(){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Devices : ");
        devices = sc.nextLine();
    }
  }
  public void displayDevices(){
    System.out.println("Devices: "+devices);
  }
  public void placeToStudy(){
    System.out.println(" Learn on Teams");
  }
}