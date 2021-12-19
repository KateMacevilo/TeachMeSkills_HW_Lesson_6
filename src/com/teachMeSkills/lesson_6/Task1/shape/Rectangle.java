package com.teachMeSkills.lesson_6.Task1.shape;

public class Rectangle implements Shape {

    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return ((width + length) * 2);
    }

    @Override
    public double calculateSquare() {
        return width * length;
    }

}
