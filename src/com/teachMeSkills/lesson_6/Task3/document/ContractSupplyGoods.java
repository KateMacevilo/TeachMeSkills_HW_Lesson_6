package com.teachMeSkills.lesson_6.Task3.document;

import javax.print.Doc;
import java.util.Date;

public class ContractSupplyGoods extends BaseDoc implements Document {

    String typeGood;
    int countGood;

    public ContractSupplyGoods(String numDoc, Date dateDoc, String typeGood, int countGood) {
        super(numDoc, dateDoc);
        this.typeGood = typeGood;
        this.countGood = countGood;
    }

    public ContractSupplyGoods() {
    }

    @Override
    public String toString() {
        return "ContractSupplyGoods " +
                " numDoc = " + numDoc +
                ", dateDoc = " + dateDoc +
                ", typeGood = " + typeGood +
                ", countGood = " + countGood ;
    }
}
