package Package;
import java.util.Scanner;
public class Person{

    public String name;
    public int age;

    public void nhap()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\tNhap ho va ten : ");
            name = sc.nextLine();
            System.out.print("\tNhap tuoi : ");
            age = sc.nextInt();
        }
    }
    public void in()
    {
        System.out.println("Ho va ten : " + name );
        System.out.println("Tuoi : " + age);
    }


}