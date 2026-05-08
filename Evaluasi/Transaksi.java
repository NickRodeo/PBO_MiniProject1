import java.util.ArrayList;

public class Transaksi {
    double totalHarga = 0;

    ArrayList<String> riwayatPesanan = new ArrayList<>();
    ArrayList<Integer> riwayatQty = new ArrayList<>();
    ArrayList<Double> riwayatSubtotal = new ArrayList<>();

    public void pesan(Produk produk, int qty) {
        if(produk == null){
            System.out.println("Menu tersebut tidak ada");
            return;
        }
        if (produk.getStok() >= qty) {
            double subtotal = produk.harga * qty;

            riwayatPesanan.add(produk.namaProduk);
            riwayatQty.add(qty);
            riwayatSubtotal.add(subtotal);

            totalHarga += subtotal;
            produk.subtractStok(qty); 
            System.out.println("Ditambahkan ke pesanan: " + produk.namaProduk);
        } else {
            System.out.println("Maaf, stok " + produk.namaProduk + " tidak cukup!");
        }
    }

    public void tampilTotal() {
        System.out.println("\n========== STRUK BELANJA ==========");
        for (int i = 0; i < riwayatPesanan.size(); i++) {
            double hargaSatuan = riwayatSubtotal.get(i) / riwayatQty.get(i);
            
            System.out.printf("%-15s %dx  Rp %-8.0f = Rp %.0f\n", 
                riwayatPesanan.get(i), 
                riwayatQty.get(i), 
                hargaSatuan, 
                riwayatSubtotal.get(i));
        }
        
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL YANG HARUS DIBAYAR: Rp %.0f\n", totalHarga);
        System.out.println("-----------------------------------");
    }

    public void bayar(double uang){
        System.out.println("TOTAL UANG ANDA : Rp " + uang);
        if(uang >= totalHarga){
            System.out.println("Pembayaran Berhasil");
            System.out.println("Kembalian       : Rp " + (uang - totalHarga));
            System.out.println("===================================");
        } else {
            System.out.println("Pembayaran Gagal, Uang anda tidak cukup");
            System.out.println("===================================");
        }
    }
}
