import java.math.BigDecimal;

public class Atm {
    // charge .50 for each withdrawal and process orders at $5.00 increments
    public BigDecimal balance = new BigDecimal("1000");
    public BigDecimal charge = new BigDecimal("0.5");

    public BigDecimal processOrder(BigDecimal requestedAmount) {
        if (requestedAmount.divide(BigDecimal.valueOf(5)) != BigDecimal.valueOf(0))
            throw new IllegalArgumentException("Your request has to be at $5.00 increments");
        return balance = balance.subtract(requestedAmount).subtract(charge);
    }

    public static void main(String[] args) {

    }
}
