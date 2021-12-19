package com.teachMeSkills.lesson_6.Task3.register;

import com.teachMeSkills.lesson_6.Task3.document.Document;

public class Register {

    Document[] arrayDoc = new Document[10];

    public Register() {
    }

    public Register(Document[] arrayDoc) {
        this.arrayDoc = arrayDoc;
    }

    public void addDocumentInRegister(Document document) {
        for (int i = 0; i < arrayDoc.length; i++) {
            if (arrayDoc[i] == null){
                arrayDoc[i] = document;
                break;
            }
        }
    }

    public String showInfoAboutDoc(Document document) {
        for (int i = 0; i < arrayDoc.length; i++) {
            if (arrayDoc[i] == document){
                return arrayDoc[i].toString();
            }
        }
        return "nothing was found";
    }
}
