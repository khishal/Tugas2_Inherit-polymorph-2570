
package soal2;

/**
 * Merepresentasikan kucing yang merupakan turunan dari Hewan.
 */
class Kucing extends Hewan {

    /**
     * Membuat objek kucing.
     *
     * @param nama nama kucing
     */
    Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Menampilkan suara khas kucing.
     */
    @Override
    void suara() {
        System.out.println("meong");
    }

    /**
     * Menampilkan aktivitas memanjat.
     */
    void panjat() {
        System.out.println(nama + " memanjat");
    }
}
