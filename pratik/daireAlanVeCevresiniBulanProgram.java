import java.util.Scanner;
public class daireAlanVeCevresiniBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz: ");
        double yaricap = scan.nextDouble();

        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi " + cevre);

        System.out.print("Dilim alani bulunmasi istenen dairenin merkez aci olcusu: ");
        double merkezAcisi = scan.nextDouble();

        double dilimAlani = (Math.PI * (yaricap * yaricap) * merkezAcisi) / 360;
        System.out.println("Dilim alani: "+ dilimAlani);
    }
}
