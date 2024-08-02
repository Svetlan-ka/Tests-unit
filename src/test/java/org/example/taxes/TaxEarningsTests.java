package org.example.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxEarningsTests {
    @Test
    public void testCalcTaxFor() {

        int debit = 100_000, expected = 6_000;

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        int result = taxEarnings.calcTaxFor(debit, debit);

        Assertions.assertEquals(result, expected);
    }
}