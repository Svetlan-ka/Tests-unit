package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.taxes.TaxEarnings;
import org.example.taxes.TaxSystem;

public class CompanyTests {
    @Test
    public void testShiftMoney() {

        int amount = 15_000, debit = 0, credit = 0,
                expectedDebit = 15_000, expectedCredit = 0;

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        Company company = new Company("ООО", taxEarnings);
        company.shiftMoney(amount);

        int newDebit = company.debit;
        int newCredit = company.credit;
        Assertions.assertEquals(newDebit, expectedDebit);
        Assertions.assertEquals(newCredit, expectedCredit);
    }
}