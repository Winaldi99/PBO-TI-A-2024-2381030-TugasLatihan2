import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan pilihan anda: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                hitungPersegi();
                break;
            case 2:
                hitungPersegiPanjang();
                break;
            case 3:
                hitungLingkaran();
                break;
            default:
                System.out.println("Pilih 1/2/3");
        }
    }
    public static void hitungPersegi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Panjang sisi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas Persegi : " + luas);
        System.out.println("Keliling Persegi : " + keliling);
    }

    public static void hitungPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar : ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }

    public static void hitungLingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari : ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }

}
