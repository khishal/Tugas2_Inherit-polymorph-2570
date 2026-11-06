
package soal2;

/**
 * Menguji inheritance, overriding, upcasting,
 * downcasting, dan dynamic method dispatch.
 */
public class TesSoal2 {

    /**
     * Menjalankan seluruh pengujian Soal 2.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {

        // =========================
        // BAGIAN A: Hewan dan Kucing
        // =========================
        System.out.println("=== BAGIAN A ===");

        Hewan h = new Kucing("Tom");

        h.makan();
        h.suara();

        // h.panjat();

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");

        // Downcasting dengan instanceof
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println(
                "h2 bukan objek Kucing, downcasting tidak dapat dilakukan."
            );
        }

        // =========================
        // BAGIAN B: Constructor
        // =========================
        System.out.println("\n=== BAGIAN B ===");

        new B();

        // =========================
        // BAGIAN C: Lingkaran dan Titik
        // =========================
        System.out.println("\n=== BAGIAN C ===");

        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
