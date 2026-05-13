public class Elektronik extends produk {
    private int masaGaransi;
    public Elektronik(String nama, double harga, int stok, int masaGaransi) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }
}

