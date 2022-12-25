import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat;
        int phys;
        int music;
        int chem;
        int tur;
        int hist;
        int average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik ders notunu giriniz: ");
        mat=scan.nextInt();
        System.out.println("Fizik ders notunu giriniz: ");
        phys=scan.nextInt();
        System.out.println("Müzik ders notunu giriniz: ");
        music=scan.nextInt();
        System.out.println("Kimya ders notunu giriniz: ");
        chem=scan.nextInt();
        System.out.println("Türkçe ders notunu giriniz: ");
        tur=scan.nextInt();
        System.out.println("Tarih ders notunu giriniz: ");
        hist=scan.nextInt();
        average=(mat+phys+music+chem+tur+hist)/6;
        if (average>=60){
            System.out.println("Sınıfı geçti.");
        }
        else {
            System.out.println("Sınıfta kaldı.");
        }

    }
}