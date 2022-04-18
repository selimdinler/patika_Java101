import java.util.Scanner;
public class dikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci dik kenarı giriniz: ");
        int dik1 = scan.nextInt();

        System.out.print("ikinci dik kenarı giriniz: ");
        int dik2 = scan.nextInt();

        double hipotenus = Math.pow((dik1 * dik1 + dik2 * dik2),0.5);
        double ucgenAlan = (dik1 * dik2) /2;

        System.out.println("Hipotenus: " + hipotenus);
        System.out.println("Ucgenin Alanı: " + ucgenAlan);
    }
}
