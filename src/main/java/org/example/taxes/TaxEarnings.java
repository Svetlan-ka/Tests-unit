package org.example.taxes;


public class TaxEarnings extends TaxSystem {
    final int RATE = 6;
    final int PERSENT = 100;

    public TaxEarnings(String name) {
        this.name = name;
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        int result = (debit * RATE) / PERSENT;
        return Math.max(result, 0);
    }
}
