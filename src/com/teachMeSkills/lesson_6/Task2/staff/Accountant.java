package com.teachMeSkills.lesson_6.Task2.staff;

public class Accountant extends InfoAboutStaff implements Staff {

    public Accountant(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName, jobTitle);
    }

    @Override
    public String toString() {
        return jobTitle;
    }

}
