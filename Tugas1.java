import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int banyakNilai = sc.nextInt();

        // Membuat array untuk menyimpan nilai-nilai mahasiswa
        int[] nilaiMahasiswa = new int[banyakNilai];

        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        // Menghitung nilai rata-rata
        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRata = totalNilai / nilaiMahasiswa.length;

        // Menampilkan nilai tertinggi dan nilai terendah
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("Nilai-nilai mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.println(nilai);
        }
    }
}