public class App51 {
    public static void main(String[] args) throws Exception {
        System.out.println("Các số nhỏ hơn 5 là: ");
        for(int i=0;i<=5;i++){
          if(i>=5){
            continue;
          }
          System.out.println(i);
        }
      }
}