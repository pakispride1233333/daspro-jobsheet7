import java.util.Scanner;

public class KafeDoWhileNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                System.out.println("Semua transaksi selesai.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            sc.nextLine(); // membersihkan buffer enter

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            System.out.println();

        } while (true);

        System.out.println("Program selesai.");
    }
}
