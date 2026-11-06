
package soal4;

/**
 * Merepresentasikan produk digital.
 */
public class ProdukDigital extends Produk {

    public static final double DISKON_DIGITAL = 0.10;

    private double ukuranMb;

    /**
     * Membuat produk digital.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran file dalam MB
     */
    public ProdukDigital(
        String kode,
        String nama,
        double hargaDasar,
        double ukuranMb
    ) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengambil ukuran file.
     *
     * @return ukuran file dalam MB
     */
    public double getUkuranMb() {
        return ukuranMb;
    }

    /**
     * Menghitung harga setelah diskon digital.
     *
     * @return harga akhir produk digital
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1 - DISKON_DIGITAL);
    }

    /**
     * Menghasilkan deskripsi produk digital.
     *
     * @return deskripsi ukuran produk
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
