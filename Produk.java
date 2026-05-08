public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;
    
    // Constructor
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    // Method tampil produk
    public void tampilProduk() {
        System.out.println(kodeProduk + " - " + namaProduk + " - Rp " + harga);
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }
}