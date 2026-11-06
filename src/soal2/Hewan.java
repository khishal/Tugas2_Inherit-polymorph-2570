
package soal2;

/**
 * Merepresentasikan hewan dengan nama dan perilaku dasar.
 */
class Hewan {

    protected String nama;

    /**
     * Membuat objek hewan.
     *
     * @param nama nama hewan
     */
    Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Menampilkan suara umum hewan.
     */
    void suara() {
        System.out.println("...");
    }

    /**
     * Menampilkan aktivitas makan dan suara hewan.
     */
    void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
