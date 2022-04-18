import java.util.Scanner;
public class KDVtutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("KDV miktari bulunacak parayi degerini giriniz: ");
        double kdvsizDeger = scan.nextDouble();

        double kdv = kdvsizDeger * ((kdvsizDeger> 1000)? 0.8 : 0.18);

        double kdvliDeger = kdv + kdvsizDeger;

        System.out.println("KDV'siz Fiyat = " + kdvsizDeger);
        System.out.println("KDV'li Fiyat = " + kdvliDeger);
        System.out.println("KDV tutarı = " + kdv);
    }
}
