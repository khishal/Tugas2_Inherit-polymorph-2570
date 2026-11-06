
package soal4;

/**
 * Merepresentasikan produk fisik yang memiliki berat.
 */
public class ProdukFisik extends Produk {

    public static final double ONGKOS_KIRIM_PER_KG = 10000.0;

    private double beratKg;

    /**
     * Membuat produk fisik.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram
     */
    public ProdukFisik(
        String kode,
        String nama,
        double hargaDasar,
        double beratKg
    ) {
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
     * Mengambil berat produk.
     *
     * @return berat dalam kilogram
     */
    public double getBeratKg() {
        return beratKg;
    }

    /**
     * Menghitung harga produk beserta ongkos kirim.
     *
     * @return harga akhir produk fisik
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() +
            (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Menghasilkan deskripsi produk fisik.
     *
     * @return deskripsi berat produk
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
