/**
 * Mini Project 1: Sistem Point of Sale (PoS)
 * Bisnis: Rumah Makan Bakso - Pontianak
 * Kelompok: [Raihan Fadhillah, Gabriel Santoso, Kristian Candra Dinata]
 * 
 * Integrasi OOP Dasar
 */

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
         // Header sistem
         System.out.println("=== SISTEM POINT OF SALE ===");
         System.out.println("Bisnis: [Nama Bisnis] - Pontianak");
         System.out.println();
         
         // 1. Membuat array produk (minimal 5)
         ArrayList<Produk> daftarProduk = new ArrayList<>();
         
         // 2. Mengisi data produk
        daftarProduk.add(new Produk("P001", "Bakso Original", 10000, 10));
        daftarProduk.add(new Produk("P002", "Bakso Mercon", 15000, 10));
        daftarProduk.add(new Produk("P003", "Bakso Telur", 12000, 10));
        daftarProduk.add(new Produk("P004", "Bakso Komplit", 8000, 10));
        daftarProduk.add(new Produk("P005", "Teh Es", 3000, 10));
        daftarProduk.add(new Produk("P006", "Air Putih", 1000, 10));
        daftarProduk.add(new Produk("P007", "Es Jeruk", 5000, 10));
         
         // 3. Menampilkan daftar produk
         tampilDaftarProduk(daftarProduk);
         
         // 4. Simulasi transaksi
         System.out.println("=== TRANSAKSI ===");
         
         Transaksi trx = new Transaksi();

         // Item 1: Bakso Original (qty 2)
         int qty1 = 2;
         trx.pesan(cariProduk(daftarProduk, "Bakso Original"), qty1);
         
         // Item 2: Bakso Mercon (qty 1)
         int qty2 = 1;
         trx.pesan(cariProduk(daftarProduk, "Bakso Mercon"), qty2);
         
         // Item 3: Teh Es (qty 2)
         int qty3 = 2;
         trx.pesan(cariProduk(daftarProduk, "Teh Es"), qty3);
         
         System.out.println();
         
         //  // 5. Hitung total
         trx.tampilTotal();

         double uangSaya = 100000;
         trx.bayar(uangSaya);
    }

    public static void tampilDaftarProduk(ArrayList<Produk> daftarProduk){
        System.out.println("DAFTAR PRODUK:");
         for (Produk p : daftarProduk)p.tampilProduk();
         System.out.println();
    }

    public static Produk cariProduk(List<Produk> daftarProduk, String nama) {
        for (Produk p : daftarProduk) {
            if (p.getNamaProduk().equalsIgnoreCase(nama)) {
                return p;
            }
        }
        return null;
    }
}
