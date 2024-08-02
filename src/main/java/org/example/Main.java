package org.example;

import org.example.taxes.TaxEarnings;
import org.example.taxes.TaxEarningsMinusSpendings;
import org.example.taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        TaxSystem taxEarnings = new TaxEarnings("УСН доходы");
        TaxSystem taxEarningsMinusSpendings = new TaxEarningsMinusSpendings("УСН доходы минус расходы");

        Company company1 = new Company("ИП Киселева А.Н.", taxEarnings);
        Company company2 = new Company("ООО Рога и копыта", taxEarningsMinusSpendings);

        company1.debit = 16000;
        company1.credit = 4590;

        company1.shiftMoney(175_000);
        company1.shiftMoney(-25_700);

        System.out.println(company1);

        company1.setTaxSystem(taxEarningsMinusSpendings);
        company1.payTaxes();
        System.out.println();

        System.out.println(company1);
    }
}