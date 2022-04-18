import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double armut_KGf= 2.14;
        double elma_KGf = 3.67;
        double domates_KGf = 1.11;
        double muz_KGf = 0.95;
        double patlican_KGf = 5;

        System.out.print("Armut Kaç Kilo? : ");
        double armutToplam = scan.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaToplam = scan.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesToplam = scan.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzToplam = scan.nextDouble();

        System.out.print("Patlýcan Kaç Kilo ? : ");
        double patlicanToplam = scan.nextDouble();

        double toplam = (armut_KGf * armutToplam) + (elma_KGf * elmaToplam) + (domates_KGf * domatesToplam) + (muz_KGf * muzToplam) + (patlican_KGf * patlicanToplam);

        System.out.println("Toplam tutar : " + toplam);
    }
}
