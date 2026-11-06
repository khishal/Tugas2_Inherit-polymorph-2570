
package soal1;

/**
 * Merepresentasikan ponsel sebagai perangkat elektronik.
 */
public class Ponsel extends Perangkat {

    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat objek ponsel.
     *
     * @param merek merek ponsel
     * @param harga harga dasar ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menghasilkan informasi singkat ponsel.
     *
     * @return informasi ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | " + kapasitasGb + " GB"
                + " | " + jumlahKamera + " kamera";
    }
}
