
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //Memasukkan jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();

        //Deklrasi array untuk nama pesanan dan harga pesanan
        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];

        //input nama makanan dan harga makanan
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc2.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextInt();
        }

        //Hitung total biaya
        int totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        //Tampilkan daftar pesanan
        System.out.println("Daftar pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        //Tampilkan total biaya
        System.out.println("Total biaya: Rp" + totalBiaya);
    }
    
}
