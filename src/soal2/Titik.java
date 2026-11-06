
package soal2;

/**
 * Merepresentasikan titik sebagai subclass Lingkaran.
 */
class Titik extends Lingkaran {

    /**
     * Membuat titik dengan jari-jari nol.
     */
    Titik() {
        super(0);
    }

    /**
     * Mengembalikan luas titik.
     *
     * @return 0.0
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling titik.
     *
     * @return 0.0
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}
