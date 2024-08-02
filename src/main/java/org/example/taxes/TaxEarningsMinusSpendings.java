package org.example.taxes;

public class TaxEarningsMinusSpendings extends TaxSystem {
    final int RATE = 15;
    final int PERSENT = 100;

    public TaxEarningsMinusSpendings(String name) {
        this.name = name;
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        int result = ((debit - credit) * RATE) / PERSENT;
        return Math.max(result, 0);
    }
}