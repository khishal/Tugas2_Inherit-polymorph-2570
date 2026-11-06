
package soal2;

/**
 * Kelas turunan A yang meng-override method init().
 */
class B extends A {

    int nilai = 5;

    /**
     * Membuat objek B.
     */
    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Menampilkan proses inisialisasi kelas B.
     */
    @Override
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
