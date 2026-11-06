
package soal1;

/**
 * Menguji pembuatan objek dan method pada Soal 1.
 */
public class TesSoal1 {

    /**
     * Menjalankan pengujian kelas Perangkat, Laptop,
     * Ponsel, dan LaptopGaming.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {

        Laptop l = new Laptop(
                "Asus", 8000000, 24, 16, 14.0
        );

        Ponsel p = new Ponsel(
                "Samsung", 5000000, 12, 128, 3
        );

        LaptopGaming g = new LaptopGaming(
                "MSI", 15000000, 12, 32, 15.6, "RTX 4060"
        );

        System.out.println(l.infoSingkat());
        System.out.println(p.infoSingkat());
        System.out.println(g.infoSingkat());

        System.out.println("Pajak laptop: Rp"
                + String.format("%.0f", l.hitungPajak()));

        System.out.println("Promo laptop 10 persen: Rp"
                + String.format("%.0f", l.hitungHargaPromo(10)));
    }
}
