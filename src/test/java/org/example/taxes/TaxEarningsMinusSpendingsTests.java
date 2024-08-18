package org.example.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.typeCompatibleWith;

public class TaxEarningsMinusSpendingsTests {

    @Test
    public void testCalcTaxFor() {

        int debit = 100_000, credit = 45_000, expected = 8_250;

        TaxSystem taxES = new TaxEarningsMinusSpendings("УСН доходы минус расходы");
        int result = taxES.calcTaxFor(debit, credit);

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testCalcTaxForHamcrest() {

        int debit = 100_000, credit = 45_000, expected = 8_250;

        TaxSystem taxES = new TaxEarningsMinusSpendings("УСН доходы минус расходы");
        int result = taxES.calcTaxFor(debit, credit);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void testTaxEarningsMinusSpendingsSubclassTaxSystem() { //является подклассом?
        assertThat(TaxEarningsMinusSpendings.class, typeCompatibleWith(TaxSystem.class));
    }




}