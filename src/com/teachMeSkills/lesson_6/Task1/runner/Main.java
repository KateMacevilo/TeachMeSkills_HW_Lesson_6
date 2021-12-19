package com.teachMeSkills.lesson_6.Task1.runner;

import com.teachMeSkills.lesson_6.Task1.shape.Circle;
import com.teachMeSkills.lesson_6.Task1.shape.Rectangle;
import com.teachMeSkills.lesson_6.Task1.shape.Shape;
import com.teachMeSkills.lesson_6.Task1.shape.Triangle;
import com.teachMeSkills.lesson_6.Task1.util.Util;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */
public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 3, 6, 5);
        Triangle triangle2 = new Triangle(5, 5, 8, 12);

        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(5, 8);

        Circle circle = new Circle(10);

        Shape[] arrayShape = new Shape[]{triangle1, triangle2, rectangle1, rectangle2, circle};

        for (Shape sh : arrayShape) {
            System.out.println("Периметр " + sh.getClass().getSimpleName() + " = " + sh.calculatePerimeter());
            System.out.println("Площадь " + sh.getClass().getSimpleName() + " = " + sh.calculateSquare());
        }

        Util util = new Util();
        System.out.println("Сумма периметров всех фигур = " + util.calculateAllPerimeters(arrayShape));

    }
}
