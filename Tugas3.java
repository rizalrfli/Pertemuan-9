
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Daftar menu
        System.out.println("======================");
        System.out.println("Menu Makanan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Roti Bakar");
        System.out.println("4. Kentang Goreng");
        System.out.println("5. Teh Tarik");
        System.out.println("6. Cappucino");
        System.out.println("7. Chocolate Ice");
        System.out.println("======================");

        //Deklarasi array menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        //input nama makanan
        System.out.print("Masukkan nama makanan: ");
        String makanan = sc.nextLine();

        //Mencari indeks makanan
        boolean ketemu = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makanan)) {
                ketemu = true;
                break;
            }
        }
        //Menampilkan hasil pencarian
        if (ketemu) {
            System.out.println("Makanan " + makanan + " ada di menu.");
        } else {
            System.out.println("Makanan " + makanan + " tidak ada di menu.");
        }
    }
}
