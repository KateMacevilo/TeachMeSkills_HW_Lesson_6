package com.teachMeSkills.lesson_6.Task1.shape;

public class Triangle implements Shape {

    int side1;
    int side2;
    int side3; //основание
    int high;

    public Triangle(int side1, int side2, int side3, int high) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.high = high;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateSquare() {
        // считала для равнобедренного треугольника, так как формул много, будь треугольник другим добавила бы условия
        return 0.5 * high * side3;
    }

}

