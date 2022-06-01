public class App90 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner m = new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ky: ");
        chuoi = m.nextLine();
        System.out.println("cac ky tu co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
    }
}
}