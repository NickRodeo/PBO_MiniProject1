/**
 * Mini Project 1: Sistem Point of Sale (PoS)
 * Bisnis: Rumah Makan Bakso - Pontianak
 * Kelompok: [Raihan Fadhillah, Gabriel Santoso, Kristian Candra Dinata]
 * 
 * Integrasi OOP Dasar
 */

public class Main {
    public static void main(String[] args) {
         // Header sistem
         System.out.println("=== SISTEM POINT OF SALE ===");
         System.out.println("Bisnis: [Nama Bisnis] - Pontianak");
         System.out.println();
         
         // 1. Membuat array produk (minimal 5)
         Produk[] daftarProduk = new Produk[5];
         
         // 2. Mengisi data produk
         daftarProduk[0] = new Produk("P001", "Kopi Hitam", 12000, 10);
         daftarProduk[1] = new Produk("P002", "Kopi Susu", 15000, 10);
         daftarProduk[2] = new Produk("P003", "Roti Bakar", 10000, 10);
         daftarProduk[3] = new Produk("P004", "Pisang Goreng", 8000, 10);
         daftarProduk[4] = new Produk("P005", "Teh Tarik", 8000, 10);
         
         // 3. Menampilkan daftar produk
         tampilDaftarProduk(daftarProduk);
         
         // 4. Simulasi transaksi
         System.out.println("=== TRANSAKSI ===");
         
         Transaksi trx = new Transaksi();

         // Item 1: Kopi Susu (qty 2)
         int qty1 = 2;
         trx.pesan(daftarProduk[1], qty1);
         
         // Item 2: Roti Bakar (qty 1)
         int qty2 = 1;
         trx.pesan(daftarProduk[2], qty2);
         
         // Item 3: Teh Tarik (qty 2)
         int qty3 = 2;
         trx.pesan(daftarProduk[3], qty3);
         
         System.out.println();
         
         //  // 5. Hitung total
         trx.tampilTotal();

         double uangSaya = 100000;
         trx.bayar(uangSaya);
    }

    public static void tampilDaftarProduk(Produk[] daftarProduk){
        System.out.println("DAFTAR PRODUK:");
         for (int i = 0; i < daftarProduk.length; i++) {
             daftarProduk[i].tampilProduk();
         }
         System.out.println();
    }
}
