import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TugasBP1 {
    public static void main(String[] args) {
        try {
            // Membaca input dari pengguna
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Masukkan nomor telepon: ");
            String nomorTelepon = reader.readLine();
            
            System.out.print("Masukkan nominal pulsa yang ingin dibeli: ");
            int nominal = Integer.parseInt(reader.readLine());
            
            // Menampilkan hasil transaksi
            System.out.println("\n--- Hasil Transaksi Pembelian Pulsa ---");
            System.out.println("Nomor Telepon: " + nomorTelepon);
            System.out.println("Nominal Pulsa: Rp " + nominal);
            System.out.println("Pembayaran sukses! Terima kasih telah melakukan transaksi.");
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam input.");
        }
    }
}
