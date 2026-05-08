/**
 * Mini Project 1: Sistem Point of Sale (PoS)
 * Bisnis: Bakso Tyga Sapi - Pontianak
 * Kelompok: [Nama Anggota Raihan Fadhillah, Gabriel Santoso, Kristian Candra Dinata]
 * 
 * Integrasi OOP Dasar
 */

// ========== CLASS PRODUK ==========
class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    
    // Constructor
    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Method tampil produk
    public void tampilProduk() {
        System.out.printf(
            "%-10s %-25s Rp %-10.0f\n", 
            kodeProduk, namaProduk, harga
        ); //Menampilkan Produk dengan format yang rapi
    }
}

// ========== MAIN PROGRAM ==========
public class Main {
    
    public static void main(String[] args) {
        
        // Header sistem
        System.out.println("=== SISTEM POINT OF SALE ===");
        System.out.println("Bisnis : Bakso Tyga Sapi - Pontianak");
        System.out.println();
        
        // 1. Membuat array produk (minimal 5)
        Produk[] daftarProduk = new Produk[7];
        
        // 2. Mengisi data produk
        daftarProduk[0] = new Produk("P001", "Bakso Iga", 40000);
        daftarProduk[1] = new Produk("P002", "Bakso Iga Istimewah", 52000);
        daftarProduk[2] = new Produk("P003", "Bakso Mie", 23000);
        daftarProduk[3] = new Produk("P003", "Mie Ayam Dower", 25000);
        daftarProduk[4] = new Produk("P004", "Es Radja Mangga", 15000);
        daftarProduk[5] = new Produk("P005", "Es Teh Manis", 5000);
        daftarProduk[6] = new Produk("P006", "Es Milo", 8000);
        

        // 3. Menampilkan daftar produk
        System.out.println("DAFTAR PRODUK YANG TERSEDIA :");
        
        //Looping untuk menampilkan data tiap-tiap produk
        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilProduk();
        }
        System.out.println();
        
        // 4. Simulasi transaksi
        System.out.println("=== TRANSAKSI ===");
        
        // Pesanan 1 : Bakso Iga (qty 4)
        int qty1 = 4;
        double subtotal1 = daftarProduk[0].harga * qty1;//Perhitungan Subtotal 
        System.out.printf("%-12s %-25s (%dx)       Rp %-10.0f\n",
        "Pesanan 1 :",
        daftarProduk[0].namaProduk, qty1, subtotal1);//Menampilkan pesanan dengan format yang rapi
        
        // Pesanan 2 : Bakso Iga Istimewah (qty 3)
        int qty2 = 3;
        double subtotal2 = daftarProduk[1].harga * qty2;//Perhitungan Subtotal
        System.out.printf("%-12s %-25s (%dx)       Rp %-10.0f\n",
        "Pesanan 2 :",
        daftarProduk[1].namaProduk, qty2, subtotal2);//Menampilkan pesanan dengan format yang rapi
        
        // Pesanan 3 : Es Teh Manis (qty 7)
        int qty3 = 7;
        double subtotal3 = daftarProduk[6].harga * qty3;//Perhitungan Subtotal
        System.out.printf("%-12s %-25s (%dx)       Rp %-10.0f\n",
        "Pesanan 3 :",
        daftarProduk[6].namaProduk, qty3, subtotal3);//Menampilkan pesanan dengan format yang rapi
        
        System.out.println();
        
        // 5. Hitung total
        double total = subtotal1 + subtotal2 + subtotal3;
        System.out.println("SUBTOTAL: Rp " + total);
        System.out.println("---");
        System.out.println("TOTAL: Rp " + total);
        System.out.println();
        System.out.println("Terima kasih telah makan di Bakso Tyga Sapi!");
    }
}
