public class MultiplesTest {
    public static void main(String[] args) {
        Multiples multiples = new Multiples();
        // 3+ 5+ 6+ 9 = 23
        long three_sum = 0;
        int i = 1;
        long three_multiples = 3;
        while (three_multiples < 10) {
            three_sum += three_multiples;
            i++;
            three_multiples = multiples.mult(3, i);
        }
        if (three_sum != 18) System.out.printf("The sum of multiples of 3 should equal 18, but it is: %d\n", three_sum);
        long five_sum = 0;
        i = 1;
        long five_multiples = 5;
        while (five_multiples < 10) {
            five_sum += five_multiples;
            i++;
            five_multiples = multiples.mult(5, i);
        }
        if (five_sum != 5)
            System.out.printf("The sum of the multiples of 5 under 10 should be 5, but it is: %d\n", five_sum);
        i = 1;
        three_multiples = 3;
        five_multiples = 5;
        long sum = 0;
        int limit = 10;
        while (true) {
            i++;
            if (three_multiples < limit) {
                sum += three_multiples;
            } else break;
            three_multiples = multiples.mult(3, i);
            if (five_multiples < limit) {
                if (five_sum % 3 != 0) sum += five_multiples;
            }
            five_multiples = multiples.mult(5, i);
        }
        if (sum != 23)
            System.out.printf("The sum of the multiple of 3 and 5 should equal 23, but it actually is: %d\n", sum);
    }
}
