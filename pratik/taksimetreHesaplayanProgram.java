import java.util.Scanner;
public class taksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("KM giriniz: ");
        int km = scan.nextInt();

        double toplamTutar = (km * 2.20) + 10;

        System.out.println("Odenecek tutar: " + toplamTutar);
    }
}
