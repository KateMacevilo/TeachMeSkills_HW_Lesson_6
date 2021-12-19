package com.teachMeSkills.lesson_6.Task2.runner;

import com.teachMeSkills.lesson_6.Task2.staff.Accountant;
import com.teachMeSkills.lesson_6.Task2.staff.Director;
import com.teachMeSkills.lesson_6.Task2.staff.Employee;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности
 * и имплементировать этот метод в созданные классы.
 */
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иван", "Васильев", "Электрик");

        Director director1 = new Director("Георгий", "Иванов",  "Директор");

        Accountant accountant1 = new Accountant("Светлана", "Семенова", "Главный бухгалтер");

        System.out.println("Должность сотрудника1 - " + employee1.printJobTitle(employee1));
        System.out.println("Должность сотрудника2 - " + director1.printJobTitle(director1));
        System.out.println("Должность сотрудника3 - " + accountant1.printJobTitle(accountant1));
    }
}
