package Shape;

public class Quadrilateral {
    public void kiemtra(){
        Point p = new Point();
           System.out.println("Nhập hoành độ và tung độ (0 < hoành độ , tung độ < 180) ");
           p.in();
           if(p.hoanhdo < 0 || p.tungdo < 0 )
           {
               p.hoanhdo = Math.abs(p.hoanhdo);
               p.tungdo = Math.abs(p.tungdo);
           }
           if(p.hoanhdo == p.tungdo && p.hoanhdo + p.tungdo == 180 )
           {
               System.out.println("\tcó là một tứ giác và là tứ giác nội tiếp !!! ");
           }
           else 
           {
               System.out.println("\tKhông là tứ giác !!! ");
           }
        }
}