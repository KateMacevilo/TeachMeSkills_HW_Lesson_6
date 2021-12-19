package com.teachMeSkills.lesson_6.Task3.document;

import java.util.Date;

public abstract class BaseDoc {

    String numDoc;
    Date dateDoc;

    public BaseDoc(String numDoc, Date dateDoc) {
        this.numDoc = numDoc;
        this.dateDoc = dateDoc;
    }

    protected BaseDoc() {
    }
}
