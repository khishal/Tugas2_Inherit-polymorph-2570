
package soal1;

/**
 * Merepresentasikan perangkat elektronik dengan informasi dasar.
 */
public class Perangkat {

    private static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Membuat objek perangkat elektronik.
     *
     * @param merek merek perangkat
     * @param harga harga dasar perangkat
     * @param garansiBulan lama garansi dalam bulan
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.isBlank()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }

        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    public String getMerek() {
        return merek;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
