package org.example.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.typeCompatibleWith;

public class TaxEarningsTests {

    @Test
    public void testCalcTaxFor() {

        int debit = 100_000, expected = 6_000;

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        int result = taxEarnings.calcTaxFor(debit, debit);

        Assertions.assertEquals(result, expected);
    }

    @MethodSource("argumentsStream")
    @ParameterizedTest
    public void testCalcTaxForWithParameters(int debit, int expected) {

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        int result = taxEarnings.calcTaxFor(debit, debit);

        Assertions.assertEquals(result, expected);
    }

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(Arguments.of(100_000, 6_000),
                Arguments.of(0, 0),
                Arguments.of(-1400, 0));
    }

    @Test
    public void testCalcTaxForHamcrest() {

        int debit = 100_000, expected = 6_000;

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        int result = taxEarnings.calcTaxFor(debit, debit);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void testTaxEarningsSubclassTaxSystem() { //является подклассом?
        assertThat(TaxEarnings.class, typeCompatibleWith(TaxSystem.class));
    }
}