
package soal2;

/**
 * Kelas induk untuk menguji urutan pemanggilan constructor.
 */
class A {

    /**
     * Membuat objek A dan memanggil init().
     */
    A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Menampilkan proses inisialisasi kelas A.
     */
    void init() {
        System.out.println("init A");
    }
}
