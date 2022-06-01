import java.util.Scanner;
public class App11 {
  public static void main(String[] args) throws Exception {
    int i,j,k;
    for ( i = 0; i <= 20; ++i)
    for ( j = 0; j <= 10; ++j)
        for ( k = 0; k <= 4; ++k)
            if (i * 10000 + j * 20000 + k * 50000 == 200000)
                System.out.println("so to 10000 " + i + " ,so to 20000 " + j + " ,so 50000 " + k);
             
  }
}