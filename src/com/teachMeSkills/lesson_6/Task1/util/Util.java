package com.teachMeSkills.lesson_6.Task1.util;

import com.teachMeSkills.lesson_6.Task1.shape.Shape;

public class Util {

    public double calculateAllPerimeters(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calculatePerimeter();
        }
        return sum;
    }
}
