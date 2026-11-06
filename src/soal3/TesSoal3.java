
package soal3;

/**
 * Menguji komposisi objek Titik dan Garis,
 * serta konsep aliasing dan defensive copy.
 */
public class TesSoal3 {

    /**
     * Menjalankan pengujian kelas Titik dan Garis.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {

        // Pengujian constructor dengan empat koordinat
        System.out.println("=== PENGUJIAN GARIS ===");

        Garis g = new Garis(0, 0, 3, 4);

        System.out.println(
            g + " panjang=" + g.getPanjang()
        );

        // Pengujian defensive copy
        System.out.println("\n=== PENGUJIAN DEFENSIVE COPY ===");

        Titik t = new Titik(1, 1);

        Garis g2 = new Garis(t, new Titik(5, 5));

        System.out.println("Sebelum titik diubah:");
        System.out.println(g2);

        t.setX(100);

        System.out.println("Setelah titik diubah:");
        System.out.println(g2);
    }
}
