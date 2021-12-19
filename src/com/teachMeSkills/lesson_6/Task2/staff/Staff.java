package com.teachMeSkills.lesson_6.Task2.staff;

public interface Staff {

    default String printJobTitle(Staff staff) {
        return staff.toString();
    }

}
