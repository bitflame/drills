public class Multiples {
    public long mult(long n, int i) {
        return n * i;
    }

    public long secondFunc(long m, long n, int multiple) {
        long m_multiple = m * multiple;
        long n_multiple = n * multiple;
        return m_multiple;
    }

    public static void main(String[] args) {
        Multiples multiples = new Multiples();

        long result = 3;
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d ", result);
            result = multiples.mult(result, i);
        }
    }
}
