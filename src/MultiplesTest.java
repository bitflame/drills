import java.math.BigDecimal;

public class MultiplesTest {
    Multiples multiples = new Multiples();

    public double useMultiple(int l) {
        int i = 1;
        double total = 0, three_multiples = 3, five_multiples = 5;
        while (true) {
            i++;
            if (three_multiples < l) {
                total += three_multiples;
            } else break;
            three_multiples = multiples.mult(3, i);
            if (five_multiples < l) {
                if (five_multiples % 3 != 0) total += five_multiples;
            }
            five_multiples = multiples.mult(5, i);
        }
        return total;
    }

    public static void main(String[] args) {
        MultiplesTest multiplesTest = new MultiplesTest();
        double sum = multiplesTest.useMultiple(10);
        // 3+ 5+ 6+ 9 = 23
        if (sum != 23)
            System.out.printf("The sum of the multiple of 3 and 5 should equal 23, but it actually is: %f\n", sum);
        else System.out.printf("Test with limit of 10 was successful\n");
        sum = multiplesTest.useMultiple(20);
        if (sum != 78)
            System.out.printf("The sum of the multiple of 3 and 5 should equal 78, but it actually is: %f\n", sum);
        else System.out.printf("Test with limit of 20 was successful\n");
        BigDecimal largeNumber = BigDecimal.valueOf(0);
    }
}
