import java.util.Scanner;
public class Segitiga20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc20.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc20.nextInt();
        luas = alas*tinggi/2;

        System.out.println("Luas segitiga: " + luas); 
    }
}
