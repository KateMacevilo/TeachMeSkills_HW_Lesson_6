package com.teachMeSkills.lesson_6.Task3.runner;

import com.teachMeSkills.lesson_6.Task3.document.ContractEmployee;
import com.teachMeSkills.lesson_6.Task3.document.ContractSupplyGoods;
import com.teachMeSkills.lesson_6.Task3.document.FinancialInvoice;
import com.teachMeSkills.lesson_6.Task3.register.Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        ContractEmployee contractEmployee1 = new ContractEmployee("E123/22", new SimpleDateFormat( "dd.MM.yyyy" ).parse( "28.12.2016" ),
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "18.02.2014" ), null, "Игорь Иванов");
        ContractSupplyGoods contractSupplyGoods1 = new ContractSupplyGoods("G233/66",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "08.10.2020" ), "fruit", 230);
        FinancialInvoice financialInvoice1 = new FinancialInvoice("F123-22/556",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "01.10.2020" ), 12, 256.77f);

        Register register = new Register();

        register.addDocumentInRegister(contractEmployee1);
        register.addDocumentInRegister(contractSupplyGoods1);
        register.addDocumentInRegister(financialInvoice1);

        System.out.println(register.showInfoAboutDoc(contractEmployee1));
        System.out.println(register.showInfoAboutDoc(contractSupplyGoods1));
        System.out.println(register.showInfoAboutDoc(financialInvoice1));

    }

}
