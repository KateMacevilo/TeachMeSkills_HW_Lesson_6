package com.teachMeSkills.lesson_6.Task1.shape;

public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }

}
