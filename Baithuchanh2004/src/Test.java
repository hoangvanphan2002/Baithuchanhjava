import Package.TaxiCar;
import Package.Tiger;
import Package.FullTimeEmployee;
import Package.PartTimeEmployee;
import Package.OfflineStudent;
import Package.OnlineStudent;
import Package.Customer;
import Package.VIPCustomer;
public class Test {
    public static void main(String[] args) throws Exception {
        OfflineStudent of = new OfflineStudent();
        OnlineStudent on = new OnlineStudent();
        FullTimeEmployee fte = new FullTimeEmployee();
        PartTimeEmployee pte = new PartTimeEmployee();
        Customer ct = new Customer();
        VIPCustomer vip = new VIPCustomer();
        Tiger tig = new Tiger();
        TaxiCar tx = new TaxiCar();

        System.out.println("     OfflineStudent     ");
            of.nhap();
            of.in();
            of.addVehicles();
            of.displayVehicles();
            of.placeToStudy();
        
        System.out.println("     OnlineStudent       ");
            on.addDevices();
            on.displayDevices();
            on.placeToStudy();
    
        System.out.println("     FullTimeEmployee    ");    
            fte.nhap();
            fte.in();
            fte.addOvertimeHours();
            fte.Salary();
            System.out.println("Salary: " + fte.Salary());
            fte.typeOfEmployee();
        
        System.out.println("     PartTimeStudent     ");
            pte.nhap();
            pte.in();
            pte.addNumberOfDayWork();
            pte.Salary();
            System.out.println("Salary: " + pte.Salary());
            pte.typeOfEmployee();
    
        System.out.println("     Customer     ");
            ct.nhap();
            ct.in();
            ct.addCustomerID();
            ct.displayCustomerID();

        System.out.println("     VIPCustomer     ");
            vip.nhap();
            vip.in();
            vip.addCustomerID();
            vip.displayCustomerID();
            vip.Gifts();
    
        System.out.println("     Animal     ");
            tig.Eat();
            tig.Sleep();
            tig.walk();
            tig.run();
            tig.roar();
    
        System.out.println("     Car     ");
            tx.Move();
            tx.Stop();
            tx.TurnRight();
            tx.Turnleft();
            tx.Reverse();  
    }
}