package com.teachMeSkills.lesson_6.Task3.document;

import java.util.Date;

public class FinancialInvoice extends BaseDoc implements Document{

    int codeDepartment;
    float totalSumMonth;

    public FinancialInvoice(String numDoc, Date dateDoc, int codeDepartment, float totalSumMonth) {
        super(numDoc, dateDoc);
        this.codeDepartment = codeDepartment;
        this.totalSumMonth = totalSumMonth;
    }

    public FinancialInvoice() {
    }

    @Override
    public String toString() {
        return "FinancialInvoice " +
                "numDoc = " + numDoc +
                ", dateDoc = " + dateDoc +
                ", codeDepartment = " + codeDepartment +
                ", totalSumMonth = " + totalSumMonth;

    }
}
