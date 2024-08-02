package org.example.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxEarningsMinusSpendingsTests {

    @Test
    public void testCalcTaxFor() {

        int debit = 100_000, credit = 45_000, expected = 8_250;

        TaxSystem taxES = new TaxEarningsMinusSpendings("УСН доходы минус расходы");
        int result = taxES.calcTaxFor(debit, credit);

        Assertions.assertEquals(result, expected);
    }
}