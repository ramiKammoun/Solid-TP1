package com.directi.training.ocp.example;

import java.util.List;

public class AreaCalculator
{
    public void calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        System.out.println("total area = " + area);
    }
}
