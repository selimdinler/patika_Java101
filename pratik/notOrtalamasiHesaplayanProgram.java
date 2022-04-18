import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        int mat, fizik, kimya, tr, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz: ");
        tr = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();

        double ort = (mat + fizik + kimya + tr + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + ort);

        String sınıfGectiMi = (ort > 60)? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Sınıf Yukselme:" + sınıfGectiMi);
    }
}
