import java.util.Scanner;
public class vucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu giriniz (metre cinsinde) : ");
        double boy = scan.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        double kilo = scan.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + vki);
    }
}
