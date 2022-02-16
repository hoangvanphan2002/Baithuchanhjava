import java.util.Scanner;
public class App {
    public static void main (String[] args)throws Exception {
        //khai bao bien
        double heSoA, heSoB, heSoC, delta, X1, X2 ;
        Scanner lt = new Scanner(System.in);
        System.out.println("Nhap he so A (A#0)");
        heSoA = lt.nextDouble();
        System.out.println("Nhap he so B");
        heSoB = lt.nextDouble();
        System.out.println("Nhap he so C");
        heSoC = lt.nextDouble();

        System.out.println("Phuong trinh bac 2 vua nhap co dang: "+heSoA+"X^2"+heSoB+"X+"+heSoC+"=0");
        //tinh delta
        delta = heSoB *heSoB-4*heSoA*heSoC;
        //tinh nghiem
        if(delta>0){
            X1 =(-heSoB +Math.sqrt(delta))/(2*heSoA);
            X2 = (-heSoB - Math.sqrt(delta))/(2*heSoA);
            System.out.println("Phuong trinh co 2 nghiem la:"
            + "X1 = "+X1+"va X2= "+X2);
        }
        else if (delta ==0){X1 = -heSoB/(2*heSoA);
        System.out.println("phuong trinh co nghiem kep: X1= X2 = "+X1);
        }else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
    }