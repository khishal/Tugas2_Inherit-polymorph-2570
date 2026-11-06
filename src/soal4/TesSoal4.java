
package soal4;

/**
 * Menguji mini project toko digital.
 */
public class TesSoal4 {

    /**
     * Menjalankan pengujian toko digital.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {

        Keranjang keranjang = new Keranjang();

        // Menambahkan produk fisik
        keranjang.tambah(
            new ProdukFisik(
                "F01",
                "Keyboard Mekanik",
                500000,
                1.5
            )
        );

        // Menambahkan produk digital
        keranjang.tambah(
            new ProdukDigital(
                "D01",
                "Ebook Java",
                100000,
                20
            )
        );

        // Menambahkan produk langganan
        keranjang.tambah(
            new Langganan(
                "L01",
                "Kelas Online",
                150000,
                20,
                12
            )
        );

        // Mencetak struk
        System.out.println("=== STRUK BELANJA ===");
        keranjang.cetakStruk();

        // Menghitung produk berdasarkan jenis
        System.out.println("\n=== JUMLAH PRODUK ===");
        keranjang.hitungPerJenis();

        // Menguji kode produk duplikat
        System.out.println("\n=== PENGUJIAN EXCEPTION ===");

        try {
            keranjang.tambah(
                new ProdukFisik(
                    "F01",
                    "Mouse",
                    100000,
                    0.2
                )
            );

        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}
