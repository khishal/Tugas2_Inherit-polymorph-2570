
package soal2;

/**
 * Merepresentasikan lingkaran berdasarkan jari-jari.
 */
class Lingkaran {

    protected double jariJari;

    /**
     * Membuat lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari ukuran jari-jari lingkaran
     */
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
