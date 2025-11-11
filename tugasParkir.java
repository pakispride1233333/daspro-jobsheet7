import java.util.Scanner;

public class tugasParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis = 0;
        int durasi = 0;
        int total = 0;

       
        System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor): ");
        jenis = input.nextInt();

        
        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis kendaraan tidak valid!");
            return;
        }

       
        do {
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi < 0) {
                System.out.println("Durasi tidak boleh negatif, masukkan ulang.");
            }
        } while (durasi < 0);

       
        if (durasi > 5) {
            total = 12500;  
        } else {
            if (jenis == 1) { 
                
                total = durasi * 3000;
            } else { 
                
                total = durasi * 2000;
            }
        }

        System.out.println("Total bayar: Rp " + total);
    }
}
