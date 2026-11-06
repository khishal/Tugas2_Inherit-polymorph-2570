
package soal1;

/**
 * Merepresentasikan laptop gaming dengan kartu grafis khusus.
 */
public class LaptopGaming extends Laptop {

    private static final int TAMBAHAN_GARANSI = 6;

    private String kartuGrafis;

    /**
     * Membuat objek laptop gaming.
     *
     * @param merek merek laptop
     * @param harga harga dasar laptop
     * @param garansiBulan lama garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis jenis kartu grafis
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci,
                        String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI,
                ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menghasilkan informasi singkat laptop gaming.
     *
     * @return informasi laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | GPU " + kartuGrafis;
    }
}
