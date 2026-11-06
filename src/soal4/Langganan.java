
package soal4;

/**
 * Merepresentasikan produk langganan digital.
 */
public class Langganan extends ProdukDigital {

    public static final int BATAS_DISKON_BULAN = 12;
    public static final double DISKON_LANGGANAN = 0.20;

    private int durasiBulan;

    /**
     * Membuat produk langganan.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar per bulan
     * @param ukuranMb ukuran produk dalam MB
     * @param durasiBulan durasi langganan
     */
    public Langganan(
        String kode,
        String nama,
        double hargaDasar,
        double ukuranMb,
        int durasiBulan
    ) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Mengambil durasi langganan.
     *
     * @return durasi dalam bulan
     */
    public int getDurasiBulan() {
        return durasiBulan;
    }

    /**
     * Menghitung harga total langganan.
     *
     * @return harga akhir setelah diskon jika memenuhi syarat
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total = total * (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menghasilkan deskripsi produk langganan.
     *
     * @return deskripsi durasi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
