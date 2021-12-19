package com.teachMeSkills.lesson_6.Task3.document;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractEmployee extends BaseDoc implements Document {

    Date dateStart;
    Date dateEnd;
    String nameEmployee;

    public ContractEmployee() {
    }

    public ContractEmployee(String numDoc, Date dateDoc, Date dateStart, Date dateEnd, String nameEmployee) {
        super(numDoc, dateDoc);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "ContractEmployee " +
                " numDoc = " + numDoc +
                ", dateDoc = " + dateDoc +
                ", dateStart = " + dateStart +
                ", dateEnd = " + dateEnd +
                ", nameEmployee = " + nameEmployee ;
    }
}
