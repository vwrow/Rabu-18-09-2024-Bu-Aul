package perulanganBuAul;
import java.util.Scanner;

public class whileAlatTulis {
    public static void main(String[] args) {
        
        int jumlah=0, pilihan;
        double harga, total, temp=0;
        String tambahBeli="a";

        Scanner w = new Scanner(System.in);
        
        do {
            System.out.println("== List Alat Tulis ==");
            System.out.println("1. Buku 4000\n2. Pensil 2500\n3. Penghapus 1000\n4. Penggaris 3000\n");

            System.out.print("Barang Yang Ingin Dibeli: ");
            pilihan = w.nextInt();

            switch (pilihan) {
                case 1:
                    harga = 4000;
                    break;
                case 2:
                    harga = 2500;
                    break;
                case 3:
                    harga = 1000;
                case 4:
                    harga = 3000;
                default:
                    System.out.println("System Error");
                    harga = 0;
                    break;
            }

            if (harga <= 1) {
            } else {
                System.out.print("Jumlah Yang Ingin Dibeli: ");
                jumlah = w.nextInt();
                
                total = jumlah*harga;
                temp += total;

                System.out.print("Apakah Ingin Membeli Barang Lainnya (ya/ tidak)? ");
                tambahBeli = w.next();
            }
        } while (tambahBeli.equalsIgnoreCase("ya"));

        System.out.println("Total: "+temp);
        w.close();
    }
}
