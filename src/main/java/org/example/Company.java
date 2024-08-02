package org.example;

import org.example.taxes.TaxSystem;

public class Company {
    String title;
    int debit;
    int credit;
    TaxSystem taxSystem;
    int tax;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }

    public void payTaxes() {
        tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб", title, tax);
        debit = 0;
        credit = 0;
    }

    public String toString() {
        return title + " [" + taxSystem + "] доходы: " + debit + " расходы: " + credit;
    }
}